/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import vista.TableroSudoku;
import java.awt.Color;
import javax.swing.BorderFactory;

public class FromSudoku extends javax.swing.JFrame {
    
    public static TableroSudoku tableroSudoku;
    private TableroNumeros tableroNumeros;
    private FromNiveles fromNiveles;
    private boolean estadoCrear;
    
    private int xPos;
    private int yPos;

    public FromSudoku() {
        initComponents();
        iniciarComponente();
        panelFondo.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
    }
    public void iniciarComponente(){
        tableroSudoku = new TableroSudoku();
        tableroSudoku.setTxtAltura(36);
        tableroSudoku.setTxtAncho(36);
        tableroSudoku.setTxtMargen(4);
        tableroSudoku.setTxtTamañoLetra(27);
        
        tableroSudoku.setPanelBackground(new Color(0, 0, 0));
        //(185, 132, 140)
        tableroSudoku.setTxtBackground1(Color.white);
        tableroSudoku.setTxtForeground1(new Color(153,1,1));
        tableroSudoku.setTxtBackground3(new Color(47, 112, 175));
        tableroSudoku.setTxtForeground3(Color.BLACK);
        tableroSudoku.setTxtBackground2(new Color(140, 198, 227));
        tableroSudoku.setTxtForeground2(Color.WHITE);
        tableroSudoku.setTxtBackground4(new Color(214, 223, 223));
        tableroSudoku.setTxtForeground4(Color.BLACK);
        
        panelFondo.add(tableroSudoku);
        tableroSudoku.setLocation(70, 60);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();
        
        //Cambiar colores, despues
        tableroNumeros = new TableroNumeros();
        tableroNumeros.setTxtAncho(36);
        tableroNumeros.setTxtAltura(36);
        tableroNumeros.setTxtMargen(4);
        tableroNumeros.setTxtTamañoLetra(27);
        tableroNumeros.setPanelBackground(new Color(0, 0, 0));
        tableroNumeros.setTxtBackground1(Color.white);
        tableroNumeros.setTxtForeground1(Color.BLACK);
        tableroNumeros.setTxtBackground2(new Color(140, 198, 227));
        tableroNumeros.setTxtForeground2(Color.WHITE);
        panelFondo.add(tableroNumeros);
        tableroNumeros.crearTablero();
        tableroNumeros.setLocation(20, 60);
        tableroNumeros.setVisible(true);

        tableroSudoku.generarSudoku(2);
        estadoCrear = true;
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelResolver = new javax.swing.JPanel();
        idResolver = new javax.swing.JLabel();
        panelNuevaPartida = new javax.swing.JPanel();
        idNuevaPartida = new javax.swing.JLabel();
        panelLimpiar = new javax.swing.JPanel();
        idLimpiar = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        idCrear = new javax.swing.JLabel();
        panelComprobar = new javax.swing.JPanel();
        idComprobar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(2, 49, 93));
        panelFondo.setPreferredSize(new java.awt.Dimension(540, 420));
        panelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelFondoMouseDragged(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUDOKU");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(420, 10, 150, 40);

        idResolver.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        idResolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idResolver.setText("RESOLVER");
        idResolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idResolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idResolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idResolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idResolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelResolverLayout = new javax.swing.GroupLayout(panelResolver);
        panelResolver.setLayout(panelResolverLayout);
        panelResolverLayout.setHorizontalGroup(
            panelResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelResolverLayout.setVerticalGroup(
            panelResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelResolver);
        panelResolver.setBounds(420, 260, 150, 40);

        idNuevaPartida.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        idNuevaPartida.setText("   NUEVA PARTIDA");
        idNuevaPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idNuevaPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idNuevaPartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idNuevaPartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaPartidaLayout = new javax.swing.GroupLayout(panelNuevaPartida);
        panelNuevaPartida.setLayout(panelNuevaPartidaLayout);
        panelNuevaPartidaLayout.setHorizontalGroup(
            panelNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaPartidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNuevaPartidaLayout.setVerticalGroup(
            panelNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaPartidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelNuevaPartida);
        panelNuevaPartida.setBounds(420, 60, 150, 40);

        idLimpiar.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        idLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLimpiar.setText("LIMPIAR");
        idLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idLimpiarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelLimpiarLayout = new javax.swing.GroupLayout(panelLimpiar);
        panelLimpiar.setLayout(panelLimpiarLayout);
        panelLimpiarLayout.setHorizontalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLimpiarLayout.setVerticalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelLimpiar);
        panelLimpiar.setBounds(420, 110, 150, 40);

        idCrear.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        idCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idCrear.setText("CREAR");
        idCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idCrearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idCrearMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelCrear);
        panelCrear.setBounds(420, 160, 150, 40);

        idComprobar.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        idComprobar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idComprobar.setText("COMPROBAR");
        idComprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idComprobarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idComprobarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idComprobarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelComprobarLayout = new javax.swing.GroupLayout(panelComprobar);
        panelComprobar.setLayout(panelComprobarLayout);
        panelComprobarLayout.setHorizontalGroup(
            panelComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprobarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelComprobarLayout.setVerticalGroup(
            panelComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprobarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelComprobar);
        panelComprobar.setBounds(420, 210, 150, 40);

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        panelFondo.add(jLabel2);
        jLabel2.setBounds(550, 0, 37, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idNuevaPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNuevaPartidaMousePressed
        if(fromNiveles != null){
            fromNiveles.setVisible(true);            
        }else{
            fromNiveles = new FromNiveles(tableroSudoku);
            fromNiveles.setVisible(true);
        }
    }//GEN-LAST:event_idNuevaPartidaMousePressed

    private void idLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idLimpiarMousePressed
        tableroSudoku.limpiar();
    }//GEN-LAST:event_idLimpiarMousePressed

    private void idCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idCrearMousePressed
        if(estadoCrear){
          idNuevaPartida.setVisible(false);
          idLimpiar.setVisible(false);
          idComprobar.setVisible(false);
          idResolver.setVisible(false);
          estadoCrear = false;
          tableroSudoku.limpiarTxt();
          idCrear.setText("LISTO");
        }else{
            if(tableroSudoku.crearSudokuPersonalizado()){               
            idNuevaPartida.setVisible(true);
          idLimpiar.setVisible(true);
          idComprobar.setVisible(true);
          idResolver.setVisible(true);
          estadoCrear = true;
          tableroSudoku.crearSudokuPersonalizado();
          idCrear.setText("CREAR");
            }            
        }
    }//GEN-LAST:event_idCrearMousePressed

    private void idComprobarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idComprobarMousePressed
        tableroSudoku.comprobar();
    }//GEN-LAST:event_idComprobarMousePressed

    private void idResolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idResolverMousePressed
        tableroSudoku.resolver();
    }//GEN-LAST:event_idResolverMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed

    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
       this.setLocation(evt.getXOnScreen() - xPos, evt.getYOnScreen() - yPos);
    }//GEN-LAST:event_panelFondoMouseDragged

    private void idNuevaPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNuevaPartidaMouseEntered
        panelNuevaPartida.setBackground(new Color(47, 112, 175));
    }//GEN-LAST:event_idNuevaPartidaMouseEntered

    private void idNuevaPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idNuevaPartidaMouseExited
        panelNuevaPartida.setBackground(Color.white);
    }//GEN-LAST:event_idNuevaPartidaMouseExited

    private void idLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idLimpiarMouseEntered
        panelLimpiar.setBackground(new Color(47, 112, 175));
    }//GEN-LAST:event_idLimpiarMouseEntered

    private void idLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idLimpiarMouseExited
        panelLimpiar.setBackground(Color.white);
    }//GEN-LAST:event_idLimpiarMouseExited

    private void idCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idCrearMouseEntered
        panelCrear.setBackground(new Color(47, 112, 175));
    }//GEN-LAST:event_idCrearMouseEntered

    private void idCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idCrearMouseExited
       panelCrear.setBackground(Color.white);
    }//GEN-LAST:event_idCrearMouseExited

    private void idComprobarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idComprobarMouseEntered
        panelComprobar.setBackground(new Color(47, 112, 175));
    }//GEN-LAST:event_idComprobarMouseEntered

    private void idComprobarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idComprobarMouseExited
        panelComprobar.setBackground(Color.white);
    }//GEN-LAST:event_idComprobarMouseExited

    private void idResolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idResolverMouseEntered
        panelResolver.setBackground(new Color(47, 112, 175));
    }//GEN-LAST:event_idResolverMouseEntered

    private void idResolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idResolverMouseExited
        panelResolver.setBackground(Color.white);
    }//GEN-LAST:event_idResolverMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idComprobar;
    private javax.swing.JLabel idCrear;
    private javax.swing.JLabel idLimpiar;
    private javax.swing.JLabel idNuevaPartida;
    private javax.swing.JLabel idResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelComprobar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLimpiar;
    private javax.swing.JPanel panelNuevaPartida;
    private javax.swing.JPanel panelResolver;
    // End of variables declaration//GEN-END:variables
}
