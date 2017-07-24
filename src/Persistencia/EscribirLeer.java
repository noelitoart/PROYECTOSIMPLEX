/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Simplex.Guardar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mipc
 */
public class EscribirLeer{
    
    public void escribirFichero(String fichero, Object o){ 
        try{
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero)); 
           oos.writeObject(o);            
           oos.close();
        } catch (Exception e){
           JOptionPane.showMessageDialog(null,"Ocurrio un error al escribir el primer dato del archivo","Error!",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
        }
    }
    public ArrayList  leeFichero(String fichero) throws IOException{
        File archivoEntrada;
        FileInputStream canalEntrada = null;
        ObjectInputStream objetoEntrada = null;
        ArrayList<Guardar> auxi= new ArrayList<Guardar>();
        boolean fin = true;
	try{
		 archivoEntrada=new File(fichero);
		canalEntrada = new FileInputStream(archivoEntrada);
		 objetoEntrada = new ObjectInputStream(canalEntrada);
		do{
			try{
			auxi.add((Guardar) objetoEntrada.readObject());
			}catch(IOException | ClassNotFoundException exc){
				fin=false;
			}
		}while (fin==true);
		objetoEntrada.close();	
		canalEntrada.close();
//		archivoEntrada.delete();
	}catch (IOException e) {
//                objetoEntrada.close();	
//		canalEntrada.close();
		System.out.println("Error al extraer");
//                 JOptionPane.showMessageDialog(null,"No se pudo cargar el archivo  ...");
	}
      
        return auxi;
        
    } 
}
