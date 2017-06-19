/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplex;

import static Simplex.AproximarNumero.valorAprocimado;
import static Guis.GuiSimplex.info;
import static Guis.GuiSimplex.jtaOperaciones;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


/** 
 *
 * @author Mipc
 */
public class Simplex {
    
    public static int columnaMayor,filalaMenor,ntablones=1;
    public static  double pivote;
    private static int posicioSubstringAnteM;// Dice  la posición desde donde se va obtener el número (Substring) que está delante la M e
    public static  boolean todosMenor=false; 
    public static void calcularZj(DefaultTableModel modeloSolucion){
      int fila = modeloSolucion.getRowCount();
      int colum = modeloSolucion.getColumnCount();
      double suamMs = 0.0, sumaNumeros = 0;
      double  xb,x;
      String valor;
      for (int col = 1; col < colum-1; col++) {
            if(col!=colum-3){
                suamMs = 0.0;
                sumaNumeros =0.0;
                for (int fil = 2; fil <fila-2; fil++) {
                    valor = String.valueOf(modeloSolucion.getValueAt(fil, 0));
                    if(contieneM(valor)){
                        suamMs = suamMs+Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(fil, col)));
                    }
                    else{
                       xb = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(fil, 0)));
                       x = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(fil, col)));
                       sumaNumeros = sumaNumeros+(xb*x); 
                    }
                }
                if(sumaNumeros==0 && suamMs==0)
                    modeloSolucion.setValueAt("0", fila-2, col);
                else if(sumaNumeros==0)
                    modeloSolucion.setValueAt(""+suamMs+"M", fila-2, col);
                else if(suamMs==0)
                    modeloSolucion.setValueAt(sumaNumeros, fila-2, col);
                else{
                    if(sumaNumeros>0)
                       modeloSolucion.setValueAt(""+suamMs+"M+"+sumaNumeros, fila-2, col);                     
                    else modeloSolucion.setValueAt(""+suamMs+"M"+sumaNumeros, fila-2, col);
                }
            }
        }  
     }
    public static void calcularCj_Zj(DefaultTableModel modeloSolucion){
        int fila = modeloSolucion.getRowCount();
        int colum = modeloSolucion.getColumnCount();
        String aux1,aux2;
        double zj,cj;
        for (int col = 1; col < colum-3; col++) {
            aux1=String.valueOf(modeloSolucion.getValueAt(0, col));
            aux2=String.valueOf(modeloSolucion.getValueAt(fila-2, col));
            double auxiliar;
            if(!contieneM(aux1) && !contieneM(aux2)){
                cj = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(0, col)));
                zj = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(fila-2, col)));
                if((cj-zj)==0)modeloSolucion.setValueAt(0, fila-1, col);
                else modeloSolucion.setValueAt((cj-zj), fila-1, col);
            }            
            else if(!contieneM(aux1) && contieneM(aux2)){
               cj = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(0, col)));
               cj = cj+(-1.0D*subnumero(aux2));
               
               auxiliar=(-1.0D*subNumeroAnteM(aux2));
               if(cj==0) modeloSolucion.setValueAt(""+auxiliar+"M", fila-1, col);
               else if(auxiliar>0) modeloSolucion.setValueAt(""+cj+"+"+auxiliar+"M", fila-1, col); 
               else modeloSolucion.setValueAt(""+cj+""+auxiliar+"M", fila-1, col); 
            }
            else if(contieneM(aux1) && !contieneM(aux2)){
                zj = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(fila-2, col)))*-1.0D;
                if(zj==0)modeloSolucion.setValueAt(aux1, fila-1, col);
                else if(subNumeroAnteM(aux1)>0)modeloSolucion.setValueAt(+zj+"+"+aux1, fila-1, col);
                else modeloSolucion.setValueAt(""+zj+""+aux1, fila-1, col);
            }
            else if(contieneM(aux1) && contieneM(aux2)){
                double multiM = 1-(subNumeroAnteM(aux2));
                double num = -1.0D*subnumero(aux2);
                if(multiM == 0 && num == 0)modeloSolucion.setValueAt(0, fila-1, col);
                else if(multiM == 0) modeloSolucion.setValueAt(num, fila-1, col);
                else if(num == 0) modeloSolucion.setValueAt(multiM+"M", fila-1, col);                
                else if(multiM > 0) modeloSolucion.setValueAt(""+num+"+"+multiM+"M", fila-1, col);
                else modeloSolucion.setValueAt(""+num+""+multiM+"M", fila-1, col);
            }
        }
    }
    public static void mayorFilaCj_Zj(DefaultTableModel modeloSolucion){
       int fila = modeloSolucion.getRowCount();
       int colum = modeloSolucion.getColumnCount();
       todosMenor = true;
       String tem;       
       double mayor =-100,M=11000000455D,aux1,aux2,y = 0;
        posicioSubstringAnteM = 0;
        for (int f = 1; f < colum-3; f++) {           
               tem = String.valueOf(modeloSolucion.getValueAt(fila-1,f)); 
               if(contieneM(tem)){
                  aux1 = numero(tem);
                  aux2 = aux(tem);
                  y = aux1+(aux2*M);                  
               }
               else{
                   y = Double.parseDouble(tem);
               }
               if(y > mayor){
                   mayor = y;
                   columnaMayor = f;
               }
        if(y>0) todosMenor = false;// se comprueba si todos los numeros no son menores que cero
        }
    }
    public static void menorFilaCj_Zj(DefaultTableModel modeloSolucion){
       int fila = modeloSolucion.getRowCount();
       int colum = modeloSolucion.getColumnCount();       
       String tem;       
       double menor = Double.MAX_VALUE,M = 11000670008.9D,aux1,aux2,y = 0;
        posicioSubstringAnteM=0; 
        todosMenor =true;
        for (int f = 1; f < colum-3; f++) {           
               tem = String.valueOf(modeloSolucion.getValueAt(fila-1,f)); 
               if(contieneM(tem)){
                  aux1 = numero(tem);
                  aux2 = aux(tem);
                  y = aux1+(aux2*M);                  
               }
               else{
                   y = Double.parseDouble(tem);
               }
               if(y <  menor){
                   menor = y;
                   columnaMayor = f;
               }
               if(y < 0) todosMenor = false;
            }
    }
    public static void CalcularXn_Mayor(DefaultTableModel modeloSolucion){
       int fila = modeloSolucion.getRowCount();
       int colum = modeloSolucion.getColumnCount(); 
       double  xn, x;
            for (int i = 2; i < fila-2; i++) {
                xn = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(i, colum-2)));
                x = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(i, columnaMayor)));
                if(x==0){
                  modeloSolucion.setValueAt("∞", i, colum-1);  
                }
                else{
                 modeloSolucion.setValueAt((xn/x), i, colum-1);    
                }
            }
    }
    public static void Menor(DefaultTableModel modeloSolucion){
       int fila = modeloSolucion.getRowCount();
       int colum = modeloSolucion.getColumnCount(); 
       double menor = Double.MAX_VALUE, tem=0;
       filalaMenor=0;
       for (int i = 2; i < fila-2; i++) {                          
            if(!String.valueOf(modeloSolucion.getValueAt(i, colum-1)).equalsIgnoreCase("∞")){
               tem = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(i, colum-1)));                
               if(tem>0D){ 
                   if(menor>tem){ 
                       menor = tem;                   
                       filalaMenor = i;
                   }
               }
            } 
        }
    }    
    private static double numero(String va){
        String p="";
        for (int i = 1; i < va.length(); i++) {            
           if(va.charAt(i)=='-'||va.charAt(i)=='+' && (va.charAt(i-1)!='E')){ 
               if(va.charAt(i-1)!='E'){
                   posicioSubstringAnteM=i;
                   p = va.substring(0, i); 
                   return Double.parseDouble(p);
               }
           }
        }
        posicioSubstringAnteM=00;
        return 0;        
    }
    public static  void Convertir0Pivote(DefaultTableModel modeloSolucion){
        String x,s,xb;
        int colum = modeloSolucion.getColumnCount();
        double aux;
        x = String.valueOf(modeloSolucion.getValueAt(1, columnaMayor));
        s = String.valueOf(modeloSolucion.getValueAt(filalaMenor, colum-3));
        xb = String.valueOf(modeloSolucion.getValueAt(0, columnaMayor));
        modeloSolucion.setValueAt(s, 1, columnaMayor);        
        modeloSolucion.setValueAt(x, filalaMenor, colum-3);
        modeloSolucion.setValueAt(xb, filalaMenor, 0);
        pivote= Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(filalaMenor, columnaMayor)));
        jtaOperaciones.append("\n  --Tablon "+ntablones+"--\n\n");
        ntablones++;
        jtaOperaciones.append("> (1/"+valorAprocimado(String.valueOf(pivote))+")F"+(filalaMenor-1+"\n"));
        for (int co = 1; co < colum-1; co++) {
            if(co!=colum-3){
              aux = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(filalaMenor, co)));
              aux = aux/pivote;
              modeloSolucion.setValueAt(aux, filalaMenor, co);
            }
        }
    }   
        
    public static void Gauss(DefaultTableModel  modeloSolucion){
         int fila =  modeloSolucion.getRowCount();
         int colum =  modeloSolucion.getColumnCount(); 
         double f1,valor, f2 ;
         info.setText("");
         info.setBackground(new Color(240,240,240));       
         for (int f = 2; f < fila-2; f++) {
                valor  = Double.parseDouble(String.valueOf(modeloSolucion.getValueAt(f, columnaMayor)));                 
                if(f!=filalaMenor){
                    if(valor==1)
                         jtaOperaciones.append("> F"+(f-1)+"-F"+(filalaMenor-1)+"\n");
                    else if(valor!=0)
                      jtaOperaciones.append("> F"+(f-1)+"-("+valorAprocimado(String.valueOf(valor))+")F"+(filalaMenor-1)+"\n");
                      for (int col = 1; col < colum-1; col++) {                    
                            if(col!=colum-3){                       
                                f1  = Double.parseDouble(String.valueOf( modeloSolucion.getValueAt(filalaMenor, col)));
                                f2  = Double.parseDouble(String.valueOf( modeloSolucion.getValueAt(f, col)));
                                double g = f1*valor;                        
                                 modeloSolucion.setValueAt((f2)-g, f,col);
                            }
                      }
                 }
         }
    }                      
    public  static  double aux(String va){
        if(va.substring(posicioSubstringAnteM, va.length()-1).equalsIgnoreCase("+"))return 1;
        else if(va.substring(posicioSubstringAnteM, va.length()-1).equalsIgnoreCase("-")) return -1;
        else if(va.substring(posicioSubstringAnteM, va.length()-1).length() == 0) return 1;
        return Double.parseDouble(String.valueOf(va.substring(posicioSubstringAnteM, va.length()-1)));
    }
    private static double subNumeroAnteM(String v){
        String tem;
        for (int i = 0; i < v.length(); i++) {
            if(v.charAt(i)=='M'){
                tem = v.substring(0, i);
                if(tem.length()>0)
                    return Double.parseDouble(tem);
            }
        }
        return 1;
    }
    private static  double subnumero(String va){
        String sub="";
        for (int i = 0; i < va.length(); i++) {
            if(va.charAt(i)=='M'){
                sub = va.substring(i+1, va.length());
                if(sub.length()>0) return ((Double.parseDouble(sub))); 
            }
        }
        return 0;
    }
    public static boolean contieneM(String valor){
        String c;
        for (int i = 0; i < valor.length(); i++) {
            c=String.valueOf(valor.charAt(i));
            if(c.equalsIgnoreCase("M"))
               return true;            
        }
        return false;
    }

   
}


