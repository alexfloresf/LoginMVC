
import Controlador.ControladorLogin;
import Modelo.EmpleadoDAO;
import Vista.JFLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFLogin vistaL = new JFLogin();
        EmpleadoDAO modeloL = new EmpleadoDAO();
        ControladorLogin controladorL = new ControladorLogin(vistaL, modeloL);
        vistaL.setVisible(true);
        vistaL.setLocationRelativeTo(null);
        
        
        
    }
    
}
