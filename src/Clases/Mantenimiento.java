package Clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mantenimiento implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @Column(nullable = true)
    private ArrayList<Consumo> consumos = new ArrayList<>();
    @Column(nullable = false)
    private ArrayList<Servicio> servicios = new ArrayList<>();
    @Column(nullable = false)
    private Computador computador;
    @Column(nullable = false)
    private Persona tecnico;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private int costoConsumos = 0;
    @Column(nullable = false)
    private int costoServicios = 0;
    @Column(nullable = false)
    private int CostoTotalMant;

    public Mantenimiento() {
    }

    public Mantenimiento(Computador computador, Persona tecnico) throws Exception {
        if (computador == null) {
            throw new Exception("El mantenimiento debe poseer un computador");
        }
        if (servicios.size() == 0){
            throw new Exception("El mantenimiento debe poseer servicios");
        }

        this.computador = computador;
        this.tecnico = tecnico;
        this.fecha = LocalDate.now();
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }

    public void setCostoConsumos(int costoConsumos) {
        this.costoConsumos = costoConsumos;
    }

    public void setCostoServicios(int costoServicios) {
        this.costoServicios = costoServicios;
    }

    public void setCostoTotalMant(int CostoTotalMant) {
        this.CostoTotalMant = CostoTotalMant;
    }

    public void setConsumos(ArrayList<Consumo> consumos) {
        this.consumos = consumos;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
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

    public int getCostoConsumos() {

        int a = 0;

        for (Consumo con : this.consumos) {
            a += con.getCostoTotalCons();
        }
        return costoConsumos = a;
    }

    public int getCostoServicios() {

        int a = 0;

        for (Servicio ser : this.servicios) {
            a += ser.getCosto();
        }
        return costoServicios = a;
    }

    public int getCostoTotalMant() {
        return CostoTotalMant = getCostoConsumos() + getCostoServicios();
    }
}
