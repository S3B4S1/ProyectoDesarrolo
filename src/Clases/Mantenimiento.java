package Clases;

import java.time.LocalDateTime;

public class Mantenimiento {

    private Consumo consumo;
    private Computador computador;
    private Persona tecnico;
    private LocalDateTime fecha;

    public Mantenimiento(Consumo consumo, Computador computador, Persona tecnico, LocalDateTime fecha) {
        this.consumo = consumo;
        this.computador = computador;
        this.tecnico = tecnico;
        this.fecha = LocalDateTime.now();
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public Computador getComputador() {
        return computador;
    }

    public Persona getTecnico() {
        return tecnico;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public void setTecnico(Persona tecnico) {
        this.tecnico = tecnico;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
