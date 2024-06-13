/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import vista.TableroSudoku;
import java.awt.Color;

public class FromSudoku extends javax.swing.JFrame {
    
    private TableroSudoku tableroSudoku;

    public FromSudoku() {
        initComponents();
        
        iniciarComponente();
    }
    public void iniciarComponente(){
        tableroSudoku = new TableroSudoku();
        tableroSudoku.setTxtAltura(36);
        tableroSudoku.setTxtAncho(36);
        tableroSudoku.setTxtMargen(4);
        tableroSudoku.setTxtTamañoLetra(27);
        
        tableroSudoku.setPanelBackground(new Color(246, 244, 245));
        //(185, 132, 140)
        tableroSudoku.setTxtBackground1(Color.white);
        tableroSudoku.setTxtForeground1(Color.BLACK);
        tableroSudoku.setTxtBackground2(new Color(47, 112, 175));
        tableroSudoku.setTxtForeground2(Color.BLACK);
        tableroSudoku.setTxtBackground3(new Color(128, 100, 145));
        tableroSudoku.setTxtForeground3(Color.WHITE);
        panelFondo.add(tableroSudoku);
        tableroSudoku.setLocation(20, 60);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(2, 49, 93));
        panelFondo.setPreferredSize(new java.awt.Dimension(540, 420));
        panelFondo.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUDOKU");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(420, 10, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromSudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
