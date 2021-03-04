/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Cliente;
import Clases.Computador;
import Clases.Consumo;
import Clases.Mantenimiento;
import Clases.Negocio;
import Clases.Persona;
import Clases.Producto;
import Clases.Servicio;
import Clases.TipoComputador;
import Interfaces.VentanaPrincipal;
import java.time.LocalDate;
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
              
              Persona t1 = new Persona(1234567, "Tecnico", "1");
              Persona t2 = new Persona(1234568, "Tecnico", "2");
              Persona t3 = new Persona(1234569, "Tecnico", "3");
              
              Servicio s1 = new Servicio(1111, "Instalacion Windows 10", 50000);
              
              Producto p1 = new Producto(11111, "Windows 10", 100000);
              
              Consumo co1 = new Consumo(1, s1, p1);
              
              Mantenimiento m1 = new Mantenimiento(pc1, null);
              
              m1.addServicio(s1);
              
              t1.setEstaDisp(Persona.EstaDisp.Si);
              t2.setEstaDisp(Persona.EstaDisp.No);
              t3.setEstaDisp(Persona.EstaDisp.Si);
              
              
              negocio.addMantenimiento(m1);
              
              negocio.addTecnico(t1);
              negocio.addTecnico(t2);
              negocio.addTecnico(t3);
              negocio.addServicio(s1);

              negocio.addCliente(cl);
              negocio.addCliente(cl2);
              negocio.addPc(pc);
              negocio.addPc(pc1);
              
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
