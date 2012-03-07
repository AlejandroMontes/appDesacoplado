/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Alejandro.Montes
 */
public interface IAlimentosD {
    
    public double getCosto();
    public void setCosto(double costo);
    public String getNombre();
    public void setNombre(String nombre);
    public String getProveedor();
    public void setProveedor(String proveedor);
}
