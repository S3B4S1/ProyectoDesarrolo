package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mantenimiento {

    private ArrayList<Consumo> consumos = new ArrayList<>();
    private ArrayList<Servicio> servicios = new ArrayList<>();
    private Computador computador;
    private Persona tecnico;
    private LocalDate fecha;

    public Mantenimiento(Computador computador, Persona tecnico) {
        this.computador = computador;
        this.tecnico = tecnico;
        this.fecha = LocalDate.now();
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<Consumo> consumos) {
        this.consumos = consumos;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Persona getTecnico() {
        return tecnico;
    }

    public void setTecnico(Persona tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void addServicio(Servicio ser) {
        this.servicios.add(ser);
    }

    public void addConsumo(Consumo cons) {
        this.consumos.add(cons);
    }

    public String Servicios() {

        String servicio = "";

        for (Servicio ser : this.servicios) {
            servicio += ser.toString() + ", ";
        }

        return servicio;
    }
}
