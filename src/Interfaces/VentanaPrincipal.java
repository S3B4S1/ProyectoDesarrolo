/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Negocio;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

/**
 *
 * @author Shadow
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Negocio negocio;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Negocio negocio) {
        this.negocio = negocio;
        initComponents();
        menuNuevaFactura.addActionListener(new ActionListener() {
            private VentanaFacturacion ventanaFacturacion = null;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ventanaFacturacion == null) {
                    ventanaFacturacion = new VentanaFacturacion();
                    jDesktopPane1.add(ventanaFacturacion);
                }
                ventanaFacturacion.setVisible(true);
            }
        });
        menuAsignarInsumos.addActionListener(new ActionListener() {
            private VentanaAsignacionConsumos ventanaAsignacionConsumos = null;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ventanaAsignacionConsumos == null) {
                    ventanaAsignacionConsumos = new VentanaAsignacionConsumos();
                    jDesktopPane1.add(ventanaAsignacionConsumos);
                }
                ventanaAsignacionConsumos.setVisible(true);
            }
        });

        menuAsignarTecnico.addActionListener(new ActionListener() {
            private VentanaAsignacionTecnico ventanaAsignacionTecnico = null;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ventanaAsignacionTecnico == null) {
                    ventanaAsignacionTecnico = new VentanaAsignacionTecnico();
                    jDesktopPane1.add(ventanaAsignacionTecnico);
                }
                ventanaAsignacionTecnico.setVisible(true);
            }
        });
        menuNuevoIngreso.addActionListener(new ActionListener() {
            private VentanaMantenimiento ventanaMantenimiento = null;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ventanaMantenimiento == null) {
                    ventanaMantenimiento = new VentanaMantenimiento(negocio);
                    jDesktopPane1.add(ventanaMantenimiento);

                }
                ventanaMantenimiento.setVisible(true);

            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuSolicitudes = new javax.swing.JMenu();
        menuNuevoIngreso = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        menuAsignarTecnico = new javax.swing.JMenuItem();
        menuAsignarInsumos = new javax.swing.JMenuItem();
        menuFacturacion = new javax.swing.JMenu();
        menuNuevaFactura = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1043, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        menuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuSolicitudes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuSolicitudes.setText("Solicitudes");
        menuSolicitudes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuNuevoIngreso.setText("Generar un Mantenimiento");
        menuSolicitudes.add(menuNuevoIngreso);

        menuPrincipal.add(menuSolicitudes);

        menuMantenimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuMantenimiento.setText("Mantenimiento");
        menuMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuAsignarTecnico.setText("Asignar Tecnico");
        menuMantenimiento.add(menuAsignarTecnico);

        menuAsignarInsumos.setText("Asignar Consumos");
        menuMantenimiento.add(menuAsignarInsumos);

        menuPrincipal.add(menuMantenimiento);

        menuFacturacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuFacturacion.setText("Facturacion");
        menuFacturacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuNuevaFactura.setText("Generar Factura");
        menuFacturacion.add(menuNuevaFactura);

        menuPrincipal.add(menuFacturacion);

        menuAyuda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuPrincipal.add(menuAyuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem menuAsignarInsumos;
    private javax.swing.JMenuItem menuAsignarTecnico;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuFacturacion;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenuItem menuNuevaFactura;
    private javax.swing.JMenuItem menuNuevoIngreso;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuSolicitudes;
    // End of variables declaration//GEN-END:variables
}
