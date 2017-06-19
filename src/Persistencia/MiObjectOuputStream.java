/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.IOException;
import java.io.ObjectOutputStream; 
import java.io.OutputStream;

/**
 *
 * @author Mipc
 */
public class MiObjectOuputStream  extends ObjectOutputStream{
   /** Constructor que recibe OutputStream */
    public MiObjectOuputStream(OutputStream out) throws IOException
    {
        super(out);
    }

    /** Constructor sin parámetros */
    protected MiObjectOuputStream() throws IOException, SecurityException
    {
        super();
    }

    /** Redefinición del método de escribir la cabecera para que no haga nada. */
    protected void writeStreamHeader() throws IOException
    {
    } 
}