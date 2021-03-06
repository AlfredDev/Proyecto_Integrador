/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodri
 * @author Jose Alfredo Garcia Cortes
 */

public class ModeloTProductosVenta extends AbstractTableModel{
    private List <Object[]> dato = new ArrayList<>();
    private String encabezado[] = new String[]{
    "Nombre","Precio","Cantidad"};
    private Class tipos[] = new Class[]{
    String.class,Double.class,Integer.class};
    
     public void setDatos(List<Object[]> d){
        dato = d;
    }
     @Override
    public Class getColumnClass(int c){return tipos[c];}
    
    @Override
    public int getRowCount(){return dato.size();}
    
    @Override
    public int getColumnCount(){return tipos.length;}
    
    @Override
    public Object getValueAt(int r,int c){return dato.get(r)[c];}
    
    @Override
    public String getColumnName(int col){
        return encabezado[col];
    }
    
}