/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyInyection;

import dao.BebidasD;
import java.util.List;
/**
 *
 * @author Alejandro.Montes
 */
public class Bebidas implements IBebidas{

    public List bebidas() {
        java.util.List bebidInfo = new java.util.ArrayList();
               
        bebidInfo.add(new BebidasD("CocaCola", "CocaCola", 8));
        bebidInfo.add(new BebidasD("Pepsi", "Pepsi", 7));
        bebidInfo.add(new BebidasD("Fresca", "CocaCola", 8));
        bebidInfo.add(new BebidasD("Mirinda", "Pepsi", 7));
        bebidInfo.add(new BebidasD("Sprite", "CocaCola", 8));
        bebidInfo.add(new BebidasD("Barrilito", "Pascual", 6));
        bebidInfo.add(new BebidasD("Jugo de Mango", "Del Valle", 9));
        bebidInfo.add(new BebidasD("Jugo de Naranja", "Del Valle", 9));
        bebidInfo.add(new BebidasD("Jugo de Manzana", "Del Valle", 9));
        
        return bebidInfo;
    }
    
}
