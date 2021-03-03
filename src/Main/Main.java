/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Cliente;
import Clases.Computador;
import Clases.Negocio;
import Clases.TipoComputador;
import Interfaces.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author S3B4S
 */
public class Main {
    
    
      public static void main(String args[]) {
          try {
              Negocio negocio = new Negocio(1020L, "PCREADY");
              Cliente cl = new Cliente(3136433711L, "sebastianjaramillo"
                      + "24@gmail.com", 1006210148L, "Sebastian", "Jaramillo");
              
              
              Computador pc = new Computador("HP", "123456A",TipoComputador.Escritorio, cl);
          
              negocio.addCliente(cl);
              negocio.addPc(pc);
              
              java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                      new VentanaPrincipal(negocio).setVisible(true);
                  }
              });
          } catch (Exception ex) {
              Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
}
