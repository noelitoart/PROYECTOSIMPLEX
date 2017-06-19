/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplex;

import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mipc
 */
public class Guardar implements Serializable {     
    private String objetivo;
    private int filas=0;
    private int columnas=0;
    private DefaultTableModel modeloRestricciones=null;
    private String[][] CoeficientesyZ=null;
    public Guardar( DefaultTableModel modeloRestricciones, String objetivo) { 
        this.filas = modeloRestricciones.getRowCount();
        this.columnas = modeloRestricciones.getColumnCount();
        CoeficientesyZ = new String[filas][columnas];
        this.objetivo = objetivo;
        CrearMatrizCoeficientesyZ(modeloRestricciones);
    }
   public void CrearMatrizCoeficientesyZ(DefaultTableModel modeloRestricciones){
       for (int f = 0; f < filas; f++){
           for (int C = 0; C < columnas; C++) {
               CoeficientesyZ[f][C]= String.valueOf(modeloRestricciones.getValueAt(f,C));
           }
       }
   }
    public DefaultTableModel getModeloRestricciones() {
        return modeloRestricciones;
    }

    public String getObjetivo() {
        return objetivo;
    }
    
    public void armarTabla(JTable tabla){
        Object cabeza[]= new String[columnas];
        cabeza[0]=(" ");
        for (int i = 1; i <=columnas-3; i++) 
            cabeza[i]=("X"+i);            
        cabeza[columnas-1]=(" ");cabeza[columnas-2]=(" "); 
        modeloRestricciones = new DefaultTableModel(cabeza,0){       
            public boolean isCellEditable(int row, int column) {
                       if(column == 0) return false;
                       if(row == 0 && column >= modeloRestricciones.getColumnCount()-2)
                           return  false;
                return true;          
              }
         };
        tabla.setModel(modeloRestricciones);
        String fila[]= new String[columnas];
        for (int f = 0; f < filas; f++) {            
           for (int C = 0; C < columnas; C++) {
             fila[C]= CoeficientesyZ[f][C];  
           }
           modeloRestricciones.addRow(fila);
           
       }
        modeloRestricciones.setValueAt("", 0, columnas-2);
        modeloRestricciones.setValueAt("", 0, columnas-1);
    }
}
