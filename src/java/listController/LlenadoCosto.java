/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listController;

import org.zkoss.zul.Label;
import dao.AlimentosD;
import dao.BebidasD;
import dependencyInyection.Alimentos;
import dependencyInyection.Bebidas;
import org.zkoss.zul.Listbox;
import java.util.List;
import java.util.ArrayList;
import org.zkoss.zul.ListModelArray;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

/**
 *
 * @author Alejandro.Montes
 */
public class LlenadoCosto implements ILlenadoCosto {

    private ListModelArray list = new ListModelArray(1);
    private ListModelArray list2 = new ListModelArray(1);
    public void LlenadoPrecio(String bebida, String alimento, Listbox costoPrin, Listbox costoPrin2, Label costoTotal) {
        try {

            BebidasD bd = costoBebida(bebida);
            AlimentosD ad = costoAlimentos(alimento);
            llenadoTabla(bd, ad, costoPrin, costoPrin2);
            double x = ad.getCosto();
            double y = bd.getCosto();
            double res = x + y;
            costoTotal.setValue(String.valueOf(res) + " pesos");
            
        } catch (Exception ex) {
        }

    }

    private BebidasD costoBebida(String bebida) {
        List bebidInfo = new ArrayList();
        Bebidas bebid = new Bebidas();
        bebidInfo = bebid.bebidas();
        Object x;
        BebidasD bd = null;
        //Esto realmente se sustituiria por una simple busqueda a la base de datos
        for (int i = 0; i < bebidInfo.size(); ++i) {
            x = bebidInfo.get(i);
            BebidasD r = (BebidasD) x;
            if (r.getNombre().equals(bebida)) {
                bd = new BebidasD(r.getNombre(), r.getProveedor(), r.getCosto());
                list.addSelection(bd);
            }
        }
        return bd;
    }

    private AlimentosD costoAlimentos(String alimento) {
        List alimInfo = new ArrayList();
        Alimentos al = new Alimentos();
        alimInfo = al.alimentos();
        Object x;
        AlimentosD ad = null;
        //Esto realmente se sustituiria por una simple busqueda a la base de datos
        for (int i = 0; i < alimInfo.size(); ++i) {
            x = alimInfo.get(i);
            AlimentosD r = (AlimentosD) x;
            if (r.getNombre().equals(alimento)) {
                ad = new AlimentosD(r.getNombre(), r.getProveedor(), r.getCosto());
                list2.addSelection(ad);
            }
        }
        return ad;
    }

    private void llenadoTabla(final BebidasD bd, final AlimentosD ad, Listbox costoPrin, Listbox costoPrin2) {

        costoPrin.setModel(list);
        costoPrin.setItemRenderer(new ListitemRenderer() {

            public void render(Listitem item, Object o) throws Exception {

                item.appendChild(new Listcell(String.valueOf(bd.getCosto() + " pesos")));
                item.appendChild(new Listcell(bd.getNombre()));
                item.appendChild(new Listcell(bd.getProveedor()));

            }
        });
        costoPrin2.setModel(list2);
        costoPrin2.setItemRenderer(new ListitemRenderer() {

            public void render(Listitem item, Object o) throws Exception {
                item.appendChild(new Listcell(String.valueOf(ad.getCosto() + " pesos")));
                item.appendChild(new Listcell(ad.getNombre()));
                item.appendChild(new Listcell(ad.getProveedor()));
            }
        });
    }
}
