/*@author david*/
package Main;

import Controlador.controladorConversor;
import Modelo.ModeloConversor;
import vista.vistaConversor;

public class MainEjecucion {
    public static void main(String[] args){
    vistaConversor vistaConversor = new vistaConversor();
    ModeloConversor modeloConversor = new ModeloConversor();
    controladorConversor controladorConversor = new controladorConversor(vistaConversor,modeloConversor);
    vistaConversor.setVisible(true);
    vistaConversor.setTitle("Conversor"); 
    }
    
   
}

