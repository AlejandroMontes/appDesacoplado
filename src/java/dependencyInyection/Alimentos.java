/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyInyection;

import dao.AlimentosD;
import java.util.List;
/**
 *
 * @author Alejandro.Montes
 */
public class Alimentos implements IAlimentos{
    
    public List alimentos() {
    java.util.List alimInfo = new java.util.ArrayList();
               
        alimInfo.add(new AlimentosD("Hamburguesa", "CarsJunior", 120));
        alimInfo.add(new AlimentosD("Ensalada", "Vips", 45));
        alimInfo.add(new AlimentosD("Chuletas Empanizadas", "Carnitas Mora", 80));
        alimInfo.add(new AlimentosD("Albondigas", "California", 70));
        alimInfo.add(new AlimentosD("Consome de Pollo", "Super Pollo", 50));
        alimInfo.add(new AlimentosD("Corte de Arrachera", "AppleBee's", 220));
        alimInfo.add(new AlimentosD("Casuela de Mariscos", "Fragua", 135));
        alimInfo.add(new AlimentosD("Papas a la Francesa", "MCDonnal's", 35));
        alimInfo.add(new AlimentosD("Pizzas", "Dominos", 85));
        
        return alimInfo;
    }

    
    
    
    
}
