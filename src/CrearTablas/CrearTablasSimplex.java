

////PC JOEL SOPANTA *****
/////unajma EPIS



package CrearTablas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mipc
 */ 
public class CrearTablasSimplex {    
    public static void TablaSolucion(int Xn,int Nrestricciones,DefaultTableModel modeloRestricciones, JTable Tablon){          
//        info.setText(" Procesando… Espere un momento");  
          int cantidad_A =cantidad_A(modeloRestricciones);
          int cantidad_S = cantidad_S(modeloRestricciones); 
          int numeroColumnas = Xn+cantidad_A+cantidad_S;
          DefaultTableModel modeloSolucion = crearModeloTabla(numeroColumnas);
          Tablon.setModel(modeloSolucion);          
          String filas[] = new String[numeroColumnas+4];//Crear filass
          for (int i = 0; i < (Nrestricciones+4); i++) 
               modeloSolucion.addRow(filas);
          agregarLasX_S_A(Xn, cantidad_S, cantidad_A, modeloSolucion, modeloRestricciones);
          agregar_Base_Xb_Xn(modeloSolucion, modeloRestricciones);
          agregarIndices(Xn,modeloRestricciones, modeloSolucion);
          
          modeloSolucion.setValueAt("        Cj", 0, 0); 
          modeloSolucion.setValueAt("Xb  / Xj", 1, 0); 
          modeloSolucion.setValueAt("   Zj ",modeloSolucion.getRowCount()-2, 0); 
          modeloSolucion.setValueAt(" Cj - Zj", modeloSolucion.getRowCount()-1, 0);          
          modeloSolucion.setValueAt("Z = ",modeloSolucion.getRowCount()-2,modeloSolucion.getColumnCount()-3);
          ajustarTabla(Tablon, modeloSolucion);
    }
    public static void ajustarTabla( JTable Tablon, DefaultTableModel modeloSolucion ){
          Tablon.setRowHeight(25);
          Tablon.getColumnModel().getColumn(modeloSolucion.getColumnCount()-3).setPreferredWidth(35);
          Tablon.getColumnModel().getColumn(modeloSolucion.getColumnCount()-2).setPreferredWidth(70);
          Tablon.getColumnModel().getColumn(0).setPreferredWidth(50);  
    }
    public static void agregarCj(int Xn,int numeroColumnas,int cantidad_S,int cantidad_A ,DefaultTableModel modeloRestricciones,DefaultTableModel modeloSolucion){
        for (int col = 1; col <= Xn; col++) {
            modeloSolucion.setValueAt(modeloRestricciones.getValueAt(0, col), 0, col);
        }
        for (int col = Xn; col <= (Xn+cantidad_S) ; col++) {
            modeloSolucion.setValueAt("0", 0, col);
        }
        for (int col = (Xn+cantidad_S); col <= (Xn+cantidad_S+cantidad_A); col++) {
            modeloSolucion.setValueAt("M", 0, col);
        } 
    }
    public static void agregar_Base_Xb_Xn(DefaultTableModel modeloSolucion,DefaultTableModel modeloRestricciones){
        int s=1,a=1;
        int row = modeloRestricciones.getRowCount();
        int column = modeloRestricciones.getColumnCount();
        modeloSolucion.setValueAt("Base", 1, modeloSolucion.getColumnCount()-3);
        modeloSolucion.setValueAt("Xn", 1, modeloSolucion.getColumnCount()-2);
        for (int i = 1; i < row; i++){
            if(String.valueOf(modeloRestricciones.getValueAt(i, column-2)).equalsIgnoreCase("=") || String.valueOf(modeloRestricciones.getValueAt(i, column-2)).equalsIgnoreCase(">=")){
               modeloSolucion.setValueAt("A"+a, i+1, modeloSolucion.getColumnCount()-3);
               modeloSolucion.setValueAt("M", i+1, 0);
               a++;
            }
            else{ 
                modeloSolucion.setValueAt("S"+s, i+1, modeloSolucion.getColumnCount()-3);
                modeloSolucion.setValueAt("0", i+1, 0);
                s++;
            }
            modeloSolucion.setValueAt(""+modeloRestricciones.getValueAt(i, column-1), i+1, modeloSolucion.getColumnCount()-2);
        }
    }
    public static void agregarLasX_S_A(int Xn,int cantidad_S,int cantidad_A,DefaultTableModel modeloSolucion,DefaultTableModel modeloRestricciones){
        int s=1,A=1;
        for (int col = 1; col <= Xn; col++) {// Agrega las x 
          modeloSolucion.setValueAt("X"+col, 1, col);
          modeloSolucion.setValueAt(modeloRestricciones.getValueAt(0, col), 0, col);
        }        
        
        for (int col = Xn+1; col <= (Xn+cantidad_S); col++) {// agragra las s en la segunda fila
           modeloSolucion.setValueAt("S"+s, 1, col);
           modeloSolucion.setValueAt("0", 0, col);           
            s++;
        }        
        for (int col = (Xn+cantidad_S)+1; col <= (Xn+cantidad_S+cantidad_A); col++) {// agragra las A en la segunda fila
           modeloSolucion.setValueAt("A"+A, 1, col);
           modeloSolucion.setValueAt("M", 0, col);
           A++;
        }
    } 
   
    public static  DefaultTableModel crearModeloTabla(int numeroColumnas){
         DefaultTableModel modelo;
         String cabeza[]= new String[numeroColumnas+4];
         for (int i = 0; i < (numeroColumnas +4); i++) 
             cabeza[i]="<>";          
         modelo = new DefaultTableModel(cabeza,0){
             public boolean isCellEditable(int row, int column) {
                return  false;
             }
          };   
          return modelo;
    }    
    private static int cantidad_A(DefaultTableModel modeloRestricciones){
        int cantidad_A=0;
        int row = modeloRestricciones.getRowCount();
        int columna = modeloRestricciones.getColumnCount();
        String tem ;
        for (int fil = 1; fil < row; fil++) {
            tem= String.valueOf(modeloRestricciones.getValueAt(fil, columna-2));              
            if(tem.equals(">=") || tem.equals(">"))cantidad_A ++;
            else if(tem.equals("="))cantidad_A ++;
        }
        return cantidad_A;
        
    }
    private static int cantidad_S(DefaultTableModel modeloRestricciones){
        int cantidad_S=0;
        int row = modeloRestricciones.getRowCount();
        int columna = modeloRestricciones.getColumnCount();
        String tem;
        for (int fil = 1; fil < row; fil++) {
            tem = String.valueOf(modeloRestricciones.getValueAt(fil, columna-2));            
            if(tem.equalsIgnoreCase(">=") || tem.equalsIgnoreCase(">")|| tem.equalsIgnoreCase("<=") ||  tem.equalsIgnoreCase("<"))cantidad_S ++;            
        }
        return cantidad_S;
        
    }
    public static void agregarIndices(int Xn,DefaultTableModel modeloRestricciones,DefaultTableModel modeloSolucion){
        int s=1,a=1;
        int row = modeloSolucion.getRowCount();
        int columna = modeloSolucion.getColumnCount();
        for (int fil = 2; fil < row-2; fil++) {
            for (int col = 1; col < columna-3; col++) {
                modeloSolucion.setValueAt("0", fil, col);
            }
        }
        String tem;
        int index;
        for (int fil = 1; fil < modeloRestricciones.getRowCount(); fil++) {// agrgar valores de las A,S
            tem = String.valueOf(modeloRestricciones.getValueAt(fil, modeloRestricciones.getColumnCount()-2));
            for (int col = 1; col < modeloRestricciones.getColumnCount()-2; col++) {
                modeloSolucion.setValueAt(modeloRestricciones.getValueAt(fil,col), fil+1, col); 
            } 
            if(tem.equalsIgnoreCase("<=") || tem.equalsIgnoreCase("<")){
                  index = buscarIndice("S"+s, modeloSolucion);
                  modeloSolucion.setValueAt("1", fil+1, index);
                  s++;
            }
            else if(tem.equalsIgnoreCase(">=") || tem.equalsIgnoreCase(">")){
              index = buscarIndice("S"+s, modeloSolucion);
                  modeloSolucion.setValueAt("-1", fil+1, index);
                  s++;                  
                  index = buscarIndice("A"+a, modeloSolucion);
                  modeloSolucion.setValueAt("1", fil+1, index);
                  a++;                  
            }
            else if(tem.equalsIgnoreCase("=")){
                index = buscarIndice("A"+a, modeloSolucion);
                modeloSolucion.setValueAt("1", fil+1, index);
                a++;
            }
        }
    }
    private static int buscarIndice(String va,DefaultTableModel modeloSolucion){
        String tem;
        for (int col = 1; col < modeloSolucion.getColumnCount()-3; col++) {
            tem = String.valueOf(modeloSolucion.getValueAt(1, col));            
              if(tem.equalsIgnoreCase(va))return col;
        }
        return -1;
    }
}


