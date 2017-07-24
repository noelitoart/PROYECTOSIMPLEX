/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guis;

import Simplex.AproximarNumero;
import Simplex.ColorFilas;
import Simplex.ColorFilasFunciones;
import CrearTablas.CrearTablasSimplex;
import Simplex.GetX;
import Simplex.Guardar;
import Simplex.Simplex;
import static Simplex.Simplex.filalaMenor;
import static Simplex.Simplex.todosMenor;
import Persistencia.EscribirLeer;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

/**
 *
 * @author Mipc
 */
public class GuiSimplex extends javax.swing.JFrame {
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arcivos sipx ", "sipx");
    private DefaultTableModel modeloRestricciones = null;
    private DefaultTableModel modeloSolucion = null;
    
    private int Xn = 0, Nrestricciones;
    private boolean limpiar = true, guardar = true;
    private EscribirLeer archivo = new EscribirLeer(); 

    public GuiSimplex() {
        initComponents();
        Tablon.setDefaultRenderer(Object.class, new ColorFilas());
        jtRestricciones.setDefaultRenderer(Object.class, new ColorFilasFunciones());
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png")).getImage());
        jDialog1.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png")).getImage());
        ventanaCoeficientes.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png")).getImage());
        jFileChooser2.setFileFilter(filtro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaCoeficientes = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRestricciones = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        info2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jcbObjetivo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jspRest = new javax.swing.JSpinner();
        jspvariables = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOperaciones = new javax.swing.JTextArea();
        jlPivote = new javax.swing.JLabel();
        jlcolunna = new javax.swing.JLabel();
        jlfila = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablon = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaEcuaciones = new javax.swing.JTextArea();
        info = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        ventanaCoeficientes.setTitle("Coeficientes");
        ventanaCoeficientes.setMinimumSize(new java.awt.Dimension(610, 610));
        ventanaCoeficientes.setResizable(false);
        ventanaCoeficientes.getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coeficientes del Problema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(null);

        jtRestricciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtRestricciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jtRestricciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtRestricciones.setComponentPopupMenu(jPopupMenu2);
        jtRestricciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtRestriccionesFocusGained(evt);
            }
        });
        jtRestricciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtRestriccionesMousePressed(evt);
            }
        });
        jtRestricciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRestriccionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtRestricciones);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(16, 30, 558, 350);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/writing62.png"))); // NOI18N
        jButton2.setText("Terminar ");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(390, 390, 177, 41);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Rellenar con 0");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(16, 398, 110, 31);

        info2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(info2);
        info2.setBounds(138, 402, 240, 22);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(130, 402, 12, 20);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(382, 402, 12, 20);

        ventanaCoeficientes.getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 120, 590, 450);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jcbObjetivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbObjetivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maximizar", "Minimizar" }));
        jPanel1.add(jcbObjetivo);
        jcbObjetivo.setBounds(20, 24, 120, 34);

        jPanel8.add(jPanel1);
        jPanel1.setBounds(20, 10, 160, 80);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        jspRest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jspRest.setModel(new javax.swing.SpinnerNumberModel(2, 1, 400, 1));
        jspRest.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspRestStateChanged(evt);
            }
        });
        jPanel5.add(jspRest);
        jspRest.setBounds(140, 50, 100, 28);

        jspvariables.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jspvariables.setModel(new javax.swing.SpinnerNumberModel(2, 2, 350, 1));
        jPanel5.add(jspvariables);
        jspvariables.setBounds(140, 10, 100, 28);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(270, 50, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Restricciones");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(30, 47, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Variables ");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(30, 10, 130, 30);

        jPanel8.add(jPanel5);
        jPanel5.setBounds(220, 6, 360, 88);

        ventanaCoeficientes.getContentPane().add(jPanel8);
        jPanel8.setBounds(10, 10, 590, 100);

        jMenuBar2.add(jMenu3);
        jMenuBar2.add(jMenu4);

        ventanaCoeficientes.setJMenuBar(jMenuBar2);

        jDialog1.setTitle("Abrir");
        jDialog1.setMinimumSize(new java.awt.Dimension(643, 419));
        jDialog1.getContentPane().setLayout(new javax.swing.BoxLayout(jDialog1.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jFileChooser2.setFileFilter(null);
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);

        jDialog1.getAccessibleContext().setAccessibleParent(null);

        jMenuItem5.setText("Eliminar Fila");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simplex");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel4.setLayout(null);

        jtaOperaciones.setEditable(false);
        jtaOperaciones.setColumns(20);
        jtaOperaciones.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jtaOperaciones.setRows(5);
        jScrollPane2.setViewportView(jtaOperaciones);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 230, 310);

        jlPivote.setText("Pivote");
        jPanel4.add(jlPivote);
        jlPivote.setBounds(10, 360, 180, 20);

        jlcolunna.setText("Columna");
        jPanel4.add(jlcolunna);
        jlcolunna.setBounds(10, 410, 150, 20);

        jlfila.setText("Fila");
        jPanel4.add(jlfila);
        jlfila.setBounds(10, 380, 130, 20);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(10, 340, 230, 10);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(856, 41, 250, 450);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        Tablon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tablon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tablon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(Tablon);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 10, 820, 360);

        jLabel3.setText("Ingeniería de sistemas CECAR 2015   ---- Fredys Vergara");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 570, 310, 20);

        jTabbedPane1.addTab("Solución", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/one62 (2).png")), jPanel2); // NOI18N

        jPanel6.setLayout(null);

        jScrollPane5.setBorder(null);

        jtaEcuaciones.setEditable(false);
        jtaEcuaciones.setColumns(20);
        jtaEcuaciones.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jtaEcuaciones.setRows(5);
        jtaEcuaciones.setBorder(null);
        jtaEcuaciones.setOpaque(false);
        jScrollPane5.setViewportView(jtaEcuaciones);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(230, 80, 430, 290);

        jTabbedPane1.addTab("Ecuaciones", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/text lines18.png")), jPanel6); // NOI18N

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 840, 480);
        //----------------------------------------------
        //JDialog d = new javax.swing.JDialog();;
        //d.setMinimumSize(new java.awt.Dimension(643, 419));
        //d.setVisible(true);
        //------------------------------------------

        info.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        info.setOpaque(true);
        getContentPane().add(info);
        info.setBounds(10, 580, 400, 20);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pen67.png"))); // NOI18N
        jButton1.setText("Coeficientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(30, 10, 230, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play109.png"))); // NOI18N
        jButton4.setText("Resolver P a P");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4);
        jButton4.setBounds(520, 10, 240, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logotype171.png"))); // NOI18N
        jButton5.setText("Resolver");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);
        jButton5.setBounds(320, 10, 160, 50);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(10, 497, 830, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/epis.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel8);
        jLabel8.setBounds(910, 500, 70, 70);

        jLabel2.setText("INGENIERIA  DE SISTEMAS --NOE CAÑARI--");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 580, 220, 20);

        jMenu1.setText("File");
        jMenu1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu1StateChanged(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/floppy2.png"))); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder265.png"))); // NOI18N
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        jMenuItem4.setText("Inicio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1119, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventanaCoeficientes.setBounds(this.getX() + 100, this.getY() + 5, ventanaCoeficientes.getWidth(), ventanaCoeficientes.getHeight());
        ventanaCoeficientes.setVisible(true);        
        if (limpiar)crearTablaRestricciones();        
        limpiar = false;
        jButton4.setEnabled(false);
        Nrestricciones = modeloRestricciones.getRowCount()-1;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        crearTablaRestricciones();
        jCheckBox1ActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!validar()) {            
            CrearTablasSimplex.TablaSolucion(Xn, Nrestricciones, modeloRestricciones, Tablon);
            modeloSolucion = (DefaultTableModel) Tablon.getModel();
            Simplex.calcularZj(modeloSolucion);
            Simplex.calcularCj_Zj(modeloSolucion);
            if (jcbObjetivo.getSelectedIndex() == 0) {
                Simplex.mayorFilaCj_Zj(modeloSolucion);
             
            } else {
                
                Simplex.menorFilaCj_Zj(modeloSolucion);
            }
            Simplex.CalcularXn_Mayor(modeloSolucion);
            Simplex.Menor(modeloSolucion);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            ventanaCoeficientes.setVisible(false);
            Simplex.ntablones = 1;
            jtaOperaciones.setText(null);
            jlfila.setText("Fila: " + (Simplex.filalaMenor - 1));
            jlcolunna.setText("Columna: " + (Simplex.columnaMayor));
            jlPivote.setText("Pivote: " + Simplex.pivote);
            jlPivote.setText("Pivote: " + AproximarNumero.valorAprocimado(String.valueOf(modeloSolucion.getValueAt(filalaMenor,Simplex.columnaMayor))));
            Ecuaciones();
        }
        info2.setText("");
//        info.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        info.setText(null);
        info.setBackground(new Color(240, 240, 240));
        if (!todosMenor) {
            if (filalaMenor <= 0) {
                info.setText("No se ha podido encontrar una solución al sistema ");
                info.setBackground(new Color(255, 35, 35));
            } else {
                Simplex.Convertir0Pivote(modeloSolucion);
                Simplex.Gauss(modeloSolucion);
                Simplex.calcularZj(modeloSolucion);
                Simplex.calcularCj_Zj(modeloSolucion);
                 if (jcbObjetivo.getSelectedItem().toString().equalsIgnoreCase("Maximizar")) {
                  Simplex.mayorFilaCj_Zj(modeloSolucion);
                 } else if (jcbObjetivo.getSelectedItem().toString().equalsIgnoreCase("Minimizar")) {
                    Simplex.menorFilaCj_Zj(modeloSolucion);
                }
                Simplex.CalcularXn_Mayor(modeloSolucion);
                Simplex.Menor(modeloSolucion);
            }
        }
        if (todosMenor) {
            jButton4.setEnabled(false);
            info.setBackground(Color.GREEN);
            info.setText("Fin de proceso");
            GetX.mostar(modeloSolucion, Xn);
            limpiarUltimaCelda();
            
        }
        jlfila.setText("Fila: " + (Simplex.filalaMenor - 1));
        jlcolunna.setText("Columna: " + (Simplex.columnaMayor));
        jlPivote.setText("Pivote: " + AproximarNumero.valorAprocimado(String.valueOf(modeloSolucion.getValueAt(filalaMenor,Simplex.columnaMayor))));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jspRestStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspRestStateChanged
        int fi = Integer.parseInt(jspRest.getValue().toString());
        String g[] = new String[Xn];
        if (fi > Nrestricciones) {
            for (int i = Nrestricciones + 1; i <= fi; i++) {
                g[0] = "Rest " + i;
                modeloRestricciones.addRow(g);
                modeloRestricciones.setValueAt("<=", i, modeloRestricciones.getColumnCount() - 2);
            }
            Nrestricciones = fi;
        } else if (fi < Nrestricciones) {
            while (Nrestricciones != fi) {
                modeloRestricciones.removeRow(Nrestricciones);
                Nrestricciones--;
            }
        }
        jCheckBox1ActionPerformed(null);
    }//GEN-LAST:event_jspRestStateChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int s = JOptionPane.showConfirmDialog(this, "Desea salir...");
        if (s == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        guardar = true;
        jDialog1.setVisible(true);
        jFileChooser2.setApproveButtonText("Guardar Archivo");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        guardar = false;
        jDialog1.setVisible(true);
        jFileChooser2.setApproveButtonText("Abrir Archivo");
         
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jtRestriccionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRestriccionesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '-' && c != 'E' && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jtRestriccionesKeyTyped

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        String ruta;
        JFileChooser seChooser = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if (comando.equals(JFileChooser.APPROVE_SELECTION)) {
            File archivoSelecciondo = seChooser.getSelectedFile();
            ruta = archivoSelecciondo.getAbsolutePath();
            if (!guardar) {
                abrirArchivo(ruta,archivoSelecciondo.getName());
            } else {
                guardarArchivo(ruta, archivoSelecciondo.getName());                
            }
        }
        else jDialog1.dispose();
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
        if (jCheckBox1.isSelected()) {
            for (int f = 0; f < modeloRestricciones.getRowCount(); f++) {
                for (int c = 1; c < modeloRestricciones.getColumnCount(); c++) {
                    if (c != modeloRestricciones.getColumnCount() - 2) {
                        if (String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("") || String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("null")) {
                            modeloRestricciones.setValueAt("0", f, c);
                        }
                    }
                }
            }
            modeloRestricciones.setValueAt("", 0, modeloRestricciones.getColumnCount() - 1 );
        } else {
            for (int f = 0; f < modeloRestricciones.getRowCount(); f++) {
                for (int c = 1; c < modeloRestricciones.getColumnCount(); c++) {
                    if (c != modeloRestricciones.getColumnCount() - 2) {
                        if (String.valueOf(modeloRestricciones.getValueAt(f, c)).equalsIgnoreCase("0") || !isNumeric(String.valueOf(modeloRestricciones.getValueAt(f, c)))) {
                            modeloRestricciones.setValueAt("", f, c);
                        }
                    }
                }
            }
        }
        info2.setText(null);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jMenu1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu1StateChanged
if (modeloRestricciones == null) {
            jMenuItem1.setEnabled(false);
        } else {
            jMenuItem1.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1StateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       while(!todosMenor && filalaMenor>0){
           jButton4ActionPerformed(evt);
       }
       jButton5.setEnabled(false);
       limpiarUltimaCelda();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
       info2.setText(" Procesando…");
    }//GEN-LAST:event_jButton2MousePressed

    private void jCheckBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MousePressed
      info2.setText(" Procesando…"); // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MousePressed

    private void jtRestriccionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRestriccionesFocusGained
      
    }//GEN-LAST:event_jtRestriccionesFocusGained

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      int fil = jtRestricciones.getSelectedRow();
      if(fil>0){
          modeloRestricciones.removeRow(fil);
           Nrestricciones--;
          for (int i = 1; i <modeloRestricciones.getRowCount(); i++) {
              modeloRestricciones.setValueAt("Rest. "+i, i, 0);             
              jspRest.setValue(Nrestricciones);
          }
      }
      
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jtRestriccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRestriccionesMousePressed
       int fil = jtRestricciones.getSelectedRow(); 
       if(fil>0 && modeloRestricciones.getRowCount()>2)jMenuItem5.setEnabled(true);
       else jMenuItem5.setEnabled(false);
    }//GEN-LAST:event_jtRestriccionesMousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       new GuiInicio().setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void crearTablaRestricciones() {
        Xn = Integer.parseInt(String.valueOf(jspvariables.getValue()));
        Nrestricciones = Integer.parseInt(String.valueOf(jspRest.getValue()));
        Object cabeza[] = new String[Xn + 3];
        cabeza[0] = (" ");
        for (int i = 1; i <= Xn; i++) {
            cabeza[i] = ("X" + i);
        }
        cabeza[Xn + 1] = (" ");
        cabeza[Xn + 2] = (" ");

        modeloRestricciones = new DefaultTableModel(cabeza, 0) {
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                if (row == 0 && column >= modeloRestricciones.getColumnCount() - 2) {
                    return false;
                }
                return true;
            }
        };
        jtRestricciones.setModel(modeloRestricciones);
        String fila[] = new String[Xn + 3];
        for (int i = 0; i < Nrestricciones + 1; i++) {
            if (i == 0) {
                fila[0] = new String("     Z =");
            } else {
                fila[0] = new String("Rest. " + (i));
                fila[modeloRestricciones.getColumnCount() - 2] = "<=";
            }
            modeloRestricciones.addRow(fila);
        }
        agregarComboBox(modeloRestricciones.getColumnCount(), jtRestricciones);
    }

    private void Ecuaciones() {
        jtaEcuaciones.setText(null);
        int fila = modeloRestricciones.getRowCount();
        int col = modeloRestricciones.getColumnCount();
        jtaEcuaciones.append(" Z = ");
        for (int c = 1; c <col-2; c++) {
            if (Double.parseDouble(String.valueOf(modeloRestricciones.getValueAt(0, c))) >= 0) {
                 jtaEcuaciones.append(" +" + " " + modeloRestricciones.getValueAt(0, c) + "X" + c);
            } else {
                 jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(0, c) + " X" + c);
            }
        }
        jtaEcuaciones.append(" \n\n");
        for (int fil = 1; fil < fila; fil++) {
            jtaEcuaciones.append(" ");
            for (int co = 1; co < col; co++) {
                if (co == 1) {
                    jtaEcuaciones.append("" + modeloRestricciones.getValueAt(fil, co) + "X" + co);
                } else if (co == col - 2) {
                    jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co));
                } else {
                    if (co >= col - 2) {
                        jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co));
                    } else {
                        if (Double.parseDouble(String.valueOf(modeloRestricciones.getValueAt(fil, co))) >= 0) {
                            jtaEcuaciones.append(" +" + " " + modeloRestricciones.getValueAt(fil, co) + "X" + co);
                        } else {
                            jtaEcuaciones.append(" " + modeloRestricciones.getValueAt(fil, co) + " X" + co);
                        }
                    }
                }
            }
            jtaEcuaciones.append("\n");
        }
    }

    private void agregarComboBox(int co, JTable jtRestricciones) {
        String[] Condicion = {"<=", ">=", "=",">","<"};
        JComboBox jcb = new JComboBox(Condicion);
        TableColumn tc = jtRestricciones.getColumnModel().getColumn(co - 2);
        TableCellEditor tce = new DefaultCellEditor(jcb);
        
        tc.setCellEditor(tce);
        jtRestricciones.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtRestricciones.getColumnModel().getColumn(co - 1).setPreferredWidth(80);
        jtRestricciones.getColumnModel().getColumn(co - 2).setPreferredWidth(30);
        for (int i = 1; i <= co - 2; i++) {
            jtRestricciones.getColumnModel().getColumn(0).setPreferredWidth(80);
        }
        jtRestricciones.setRowHeight(25);
    }

    public void guardarArchivo(String ruta, String nom) {
        int op = 0;
        if (!ruta.substring(ruta.length() - 5, ruta.length()).equalsIgnoreCase(".sipx")) {
            ruta = ruta + ".sipx";
        }
        File f = new File(ruta);
        if (f.exists()) {
            op = JOptionPane.showConfirmDialog(this, nom + " Ya existe \n¿Desea reemplazarlo?","Guardar",JOptionPane.WARNING_MESSAGE);
        }
        if (op == 0) {
            Guardar g = new Guardar(modeloRestricciones, jcbObjetivo.getSelectedItem().toString());
            archivo.escribirFichero(ruta, g);
            this.setTitle(nom+" - Simplex");
            jDialog1.dispose();
        }

    }

    public void abrirArchivo(String ruta,String nombre) {
        File f = new File(ruta);
        ArrayList<Guardar> guardar;
        if (f.exists()) {
            try {
                jDialog1.dispose();
                guardar = archivo.leeFichero(ruta);
                guardar.get(0).armarTabla(jtRestricciones);
                jcbObjetivo.setSelectedItem(guardar.get(0).getObjetivo());
                modeloRestricciones = guardar.get(0).getModeloRestricciones();
                agregarComboBox(modeloRestricciones.getColumnCount(), jtRestricciones);
                ventanaCoeficientes.setBounds(this.getX() + 100, this.getY() + 5, ventanaCoeficientes.getWidth(), ventanaCoeficientes.getHeight());
                ventanaCoeficientes.setVisible(true);
                Xn = modeloRestricciones.getColumnCount() - 3;
                jspvariables.setValue(Xn);
                Nrestricciones = modeloRestricciones.getRowCount() - 1;
                jspRest.setValue(Nrestricciones);
                this.setTitle(nombre+" - Simplex");
                jCheckBox1.setSelected(true);
                jCheckBox1ActionPerformed(null);
                limpiar= false;
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, nombre+"\nError al leer  archivo ","Error!",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encuentra el Archivo\nCompruebe el nombre de archivo e intente de nuevo","Abrir",JOptionPane.WARNING_MESSAGE);
        }
    }
    private boolean validar() {
        String texto;
        int fila = modeloRestricciones.getRowCount();
        int colum = modeloRestricciones.getColumnCount();
        for (int i = 0; i < fila; i++) {
            for (int j = 1; j < colum; j++) {
                if (i == 0 && j >= colum - 2) 
                    break;                
                else if (j != colum - 2) {
                    texto = String.valueOf(modeloRestricciones.getValueAt(i, j));
                    if (!texto.matches("([+-]{1})?[0-9]+(\\.[0-9]+)?([Ee]{1}([-]{1})?[1-9])?")) {
                        JOptionPane.showMessageDialog(this, "Al parecer faltan o hay datos incorrectos,\nasegúrese de no escribir espacios en \nblanco o los decimales con coma…");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public Component prepareEditor (TableCellEditor editor , int row, int columna){
        return null;
        
    }
    public void limpiarUltimaCelda(){
        for (int i = 0; i < Tablon.getRowCount(); i++) {
            Tablon.setValueAt("", i, Tablon.getColumnCount()-1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSimplex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablon;
    public static javax.swing.JLabel info;
    private javax.swing.JLabel info2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jcbObjetivo;
    private javax.swing.JLabel jlPivote;
    private javax.swing.JLabel jlcolunna;
    private javax.swing.JLabel jlfila;
    private javax.swing.JSpinner jspRest;
    private javax.swing.JSpinner jspvariables;
    private javax.swing.JTable jtRestricciones;
    private javax.swing.JTextArea jtaEcuaciones;
    public static javax.swing.JTextArea jtaOperaciones;
    private javax.swing.JFrame ventanaCoeficientes;
    // End of variables declaration//GEN-END:variables

    private static boolean isNumeric(String cadena){
	try {
            Double.parseDouble(cadena);
            return true;
	} catch (NumberFormatException nfe){
            return false;
	}
}
}
