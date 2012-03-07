/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listController;

import dao.AlimentosD;
import dao.BebidasD;
import dependencyInyection.Alimentos;
import dependencyInyection.Bebidas;
import org.zkoss.zul.ListModelArray;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

/**
 *
 * @author Alejandro.Montes
 */
public class LlenadoTablas implements ILlenadoTablas {

    public void llenadoAlimentos(Listbox alimentos) {
        java.util.List alimInfo = new java.util.ArrayList();
        Alimentos al = new Alimentos();
        alimInfo = al.alimentos();

        ListModelArray list = new ListModelArray(alimInfo);
        alimentos.setModel(list);
        alimentos.setItemRenderer(new ListitemRenderer() {

            public void render(Listitem item, Object data) throws Exception {
                if (data == null) {
                    return;
                }
                AlimentosD r = (AlimentosD) data;
                item.appendChild(new Listcell(r.getNombre()));
            }
        });

    }

    public void llenadoBebidas(Listbox bebidas) {
        java.util.List bebidInfo = new java.util.ArrayList();
        Bebidas bebid = new Bebidas();
        bebidInfo = bebid.bebidas();

        ListModelArray list = new ListModelArray(bebidInfo);
        bebidas.setModel(list);
        bebidas.setItemRenderer(new ListitemRenderer() {

            public void render(Listitem item, Object data) throws Exception {
                if (data == null) {
                    return;
                }
                BebidasD r = (BebidasD) data;
                item.appendChild(new Listcell(r.getNombre()));
            }
        });

    }
}
