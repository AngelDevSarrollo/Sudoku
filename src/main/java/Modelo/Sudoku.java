package Modelo;

import javax.xml.transform.Source;

public class Sudoku {
    private int sudoku[][];

    // Constructor
    public Sudoku() {
        sudoku = new int[][] {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    }

public boolean recorrerSudoku() {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if (sudoku[i][j] == 0) {
                    for (int valorPosicionSudoku = 1; valorPosicionSudoku <= 9; valorPosicionSudoku++) {
                        if (metodoValidarFila(i, valorPosicionSudoku) && metodoValidarColumnas(j, valorPosicionSudoku) && metodoValidarCuadrante(i, j, valorPosicionSudoku)) {
                            sudoku[i][j] = valorPosicionSudoku;
                            if (recorrerSudoku()) {
                                return true;
                            }
                            sudoku[i][j] = 0;
                        }
                    }
                    return false;  
                }
            }
        }
        return true;  
    }
    // Métodos para validar si el número que ponemos está en la fila, columna o cuadrante
    public boolean metodoValidarFila(int i, int valorPosicionSudoku) {
        for (int j = 0; j < sudoku[i].length; j++) {
            if (sudoku[i][j] == valorPosicionSudoku) {
                return false;
            }
        }
        return true;
    }

    public boolean metodoValidarColumnas(int j, int valorPosicionSudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][j] == valorPosicionSudoku) {
                return false;
            }
        }
        return true;
    }

    public boolean metodoValidarCuadrante(int i, int j, int valorPosicionSudoku) {
        int posicionDeI = metodoValidarSubcuadrante(i);
        int posicionDeJ = metodoValidarSubcuadrante(j);

        for (int k = posicionDeI; k < posicionDeI + 3; k++) {
            for (int l = posicionDeJ; l < posicionDeJ + 3; l++) {
                if (sudoku[k][l] == valorPosicionSudoku) {
                    return false;
                }
            }
        }
        return true;
    }

    public int metodoValidarSubcuadrante(int posicion) {
        if (posicion <= 2) return 0;
        else if (posicion <= 5) return 3;
        else return 6;
    }

    public void mostrarSudoku() {
        recorrerSudoku();
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]);
                if (j != sudoku[0].length - 1) System.out.print(" - ");
            }
            System.out.println();
        }
    }

    // Getter y setter
    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
}
