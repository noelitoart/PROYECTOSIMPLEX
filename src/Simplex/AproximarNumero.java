/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplex;

/**
 *
 * @author Mipc
 */
public class AproximarNumero {
    static  String tem;
    public static  String valorAprocimado(String cadena){// retorna el valor reducido, despues del . retorna tres sifras+E^n
      String f ="";
      for (int k = 0; k < cadena.length(); k++) {
         char c =cadena.charAt(k);
         if(c=='.'){ 
               f=f+'.'; 
               k++;           
               if(k<cadena.length() && cadena.charAt(k)!='E'){
                  f=f+cadena.charAt(k);
                  k++;
               }
               if(k<cadena.length() && cadena.charAt(k)!='E'){
                  f=f+cadena.charAt(k);
                  k++;
               }
               if(k<cadena.length() && cadena.charAt(k)!='E'){
                  f=f+cadena.charAt(k);
                  k++;
               }
               f=f+contieneE(cadena);
               break;          
         }
         else f=f+cadena.charAt(k);         
        }
        return f;

}
  public static String  contieneE(String cadena){
      char c;
      for (int i = 0; i < cadena.length(); i++) {
          c= cadena.charAt(i);
          if(c=='e' || c=='E'){
              return cadena.substring(i, cadena.length()); 
          }
      }
        return "";
  }
    
}

