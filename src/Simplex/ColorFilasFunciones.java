package Simplex;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable; 
import javax.swing.table.DefaultTableCellRenderer;


public class ColorFilasFunciones  extends  DefaultTableCellRenderer{
  private JLabel componete;
    int i=0;
     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componete =  (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        if(column==0){
            componete.setBackground(new Color(255,86,86));
        } 
        if(row==0) componete.setBackground(new Color(102,204,255));
        if(row!=0 && column !=0) componete.setBackground(Color.white);
        if(isSelected) componete.setBackground(new Color(223,211,231));   
        
      return componete;
     }

}