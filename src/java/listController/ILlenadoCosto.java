/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listController;

import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;

/**
 *
 * @author Alejandro.Montes
 */
public interface ILlenadoCosto {
    
    public void LlenadoPrecio(String bebidas, String alimentos, Listbox costoPrin, Listbox costoPrin2, Label costoTotal);
    
}
