/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosimplex;


import Guis.GuiInicio;
/**
 *
 * @author MIPC
 */
public class Proyectosimplex {

    /** una prueba  desdepues de arreglar  aulgunos errores 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menu principal
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                  new GuiInicio().setVisible(true);
            }
        });
    }
}
