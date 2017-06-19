/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplex;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mipc
 */
public class ColorFilas extends  DefaultTableCellRenderer{
    private JLabel componete;
    int i=0; 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componete =  (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);         
        if(row >= 2 && row < table.getRowCount()-2 && column>0 && column<table.getColumnCount()-3 ) {
            componete.setBackground(Color.WHITE);
        }
        else if(column>=table.getColumnCount()-3  && column<table.getColumnCount()-1                
                && row>=table.getRowCount()-2  && row<table.getRowCount()-1){
             componete.setBackground(new Color(5,230,5));    
        }
        else if(column==table.getColumnCount()-1) componete.setBackground(new Color(61,175,215));
        else componete.setBackground(new Color(238,79,111));            
        if(isSelected){
          componete.setBackground(new Color(223,211,231));   
        }
//        if(row==0 && column==0)
//            componete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon1.png")));
//        else   componete.setIcon(null);
        
        return componete;
    }
}
