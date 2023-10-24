/* @author David Alexander Romero*/
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.ModeloConversor;
import vista.vistaConversor;

public final class controladorConversor implements ActionListener {
       vistaConversor vistaConversor;
       ModeloConversor  modeloConversor;

    public controladorConversor(vistaConversor vistaConversor, ModeloConversor modeloConversor) {
        this.vistaConversor = vistaConversor;
        this.modeloConversor = modeloConversor;
        registrarControlador();
    }

    public controladorConversor(vistaConversor vistaConversor) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }     
    
    public void registrarControlador(){
    vistaConversor.getButtonPeceta().addActionListener(this);
    vistaConversor.getButtonEuro().addActionListener(this);
    vistaConversor.getButtonLimpiar().addActionListener(this);
    }
    
    private void aPesetas() {    
        try{
            Double euros = Double.parseDouble(vistaConversor.getTxtMoneda().getText());
            Double pesetas = modeloConversor.aPesetas(euros);
            vistaConversor.getTxtMoneda().setText(pesetas.toString());
            }catch(NumberFormatException cp){
            JOptionPane.showMessageDialog (null, "por favor digite solo numeros ");
      }
    }
    
    private void aEuros() {  
     try  {   
           Double pesetas = Double.parseDouble(vistaConversor.getTxtMoneda().getText());
           Double euros = modeloConversor.aEuros(pesetas);
           vistaConversor.getTxtMoneda().setText(euros.toString());
           }catch(NumberFormatException cp) {
           JOptionPane.showMessageDialog (null, "por favor digite solo numeros ");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vistaConversor.getButtonPeceta() == e.getSource()){
           aPesetas();
        }
        else  if(vistaConversor.getButtonEuro() == e.getSource()){
           aEuros();
        }
    }
}



    