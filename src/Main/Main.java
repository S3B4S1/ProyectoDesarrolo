/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Cliente;
import Clases.Computador;
import Clases.Negocio;
import Clases.Servicio;
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
                      + "24@gmail.com", 1006210148L, "sebastian", "Jaramillo");
              Cliente cl2 = new Cliente(3024261052L, "JoanRosero"
                      + "@gmail.com", 1006210148L, "Joan", "Rosero");
              
              Computador pc = new Computador("Hp", "123456A",TipoComputador.Portatil, cl);
              Computador pc1 = new Computador("Asus", "123456B",TipoComputador.Escritorio, cl2);
              Servicio sv = new Servicio(10, "Mantenimiento General", 60000);
              Servicio sv1 = new Servicio(20, "Instalacion de sistema operativo", 20000);
              Servicio sv2 = new Servicio(30, "Diagnostico de daños", 50000);
              Servicio sv3 = new Servicio(40, "Cambio de componentes", 25000);
              negocio.addCliente(cl);
              negocio.addCliente(cl2);
              negocio.addPc(pc);
              negocio.addPc(pc1);
              negocio.addServicio(sv1);
              negocio.addServicio(sv2);
              negocio.addServicio(sv3);
              negocio.addServicio(sv);
             
          
              
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
