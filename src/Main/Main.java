package Main;

import Clases.Cliente;
import Conection.Connection_Class;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Clases.Computador;
import Clases.Consumo;
import Clases.Mantenimiento;
import Clases.Negocio;
import Clases.Persona;
import Clases.Producto;
import Clases.Servicio;
import Interfaces.VentanaPrincipal;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) {

        Connection_Class cn = new Connection_Class();
        Statement st;
        ResultSet rs;
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from productos");
            while (rs.next()) {
                System.out.println(rs.getInt("Cod_producto") + " " + rs.getString("Nombre") + " " + rs.getLong("Precio"));
            }
            cn.con.close();
        } catch (SQLException e) {
        }
     
        try {
            Negocio negocio = new Negocio(1020L, "PCREADY");
            
              Cliente cl = new Cliente(11111111, "sebastian", "Jaramillo", 3136433711L, "sebastian@gmail.com");
              Cliente cl2 = new Cliente(11111112, "Joan", "Rosero", 3206545212L, "joan@gmail.com");
              
              Computador pc = new Computador("Hp", "123456A",Computador.TipoComputador.Portatil, cl);
              Computador pc1 = new Computador("Asus", "123456B",Computador.TipoComputador.Escritorio, cl2);
              
            //  Persona t1 = new Persona(1234567, "Tecnico", "1", "3125469878");
             // Persona t2 = new Persona(1234568, "Tecnico", "2", "3654449878");
             // Persona t3 = new Persona(1234569, "Tecnico", "3", "3122229878");
              
              Servicio s1 = new Servicio(1111, "Instalacion Windows 10", 50000);
              
              Producto p1 = new Producto(11111, "Windows 10", 100000);
              
              Consumo co1 = new Consumo(1, s1, p1);
              
              Mantenimiento m1 = new Mantenimiento(pc1, null);
              
              negocio.addProducto(p1);
              
              m1.addServicio(s1);
              
              
            
              
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
