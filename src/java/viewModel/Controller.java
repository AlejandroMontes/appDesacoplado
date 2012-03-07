/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package viewModel;

import org.zkoss.zul.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import listController.LlenadoCosto;
import listController.LlenadoTablas;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Listbox;

/**
 *
 * @author Alejandro.Montes
 */
public class Controller extends GenericForwardComposer implements IController {

    private org.zkoss.zul.Window winModal;
    private Listbox bebiList;
    private Listbox aliList;
    private Listbox costoPrin;
    private Listbox costoPrin2;
    private Label costoTotal;

    public void onCreate$winModal() {
        try {
            winModal.onModal();
        } catch (InterruptedException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenadoTablas render = new LlenadoTablas();
        render.llenadoBebidas(bebiList);
        render.llenadoAlimentos(aliList);
    }

    public void onSelect$bebiList() {
        llenadoPrec();
    }

    public void onSelect$aliList() {
        llenadoPrec();
    }

    public void llenadoPrec() {
        try {
            String bebida = bebiList.getSelectedItem().getLabel();
            String alimento = aliList.getSelectedItem().getLabel();
            LlenadoCosto precio = new LlenadoCosto();
            precio.LlenadoPrecio(bebida, alimento, costoPrin, costoPrin2, costoTotal);
            costoPrin.setVisible(true);
            costoPrin2.setVisible(true);
           
        } catch (Exception ex) {
        }

    }

   
}
