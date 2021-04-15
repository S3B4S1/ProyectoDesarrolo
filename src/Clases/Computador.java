package Clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Computador implements Serializable {

    public static enum TipoComputador {
        Portatil, Componente, Escritorio
    }

    @Column(nullable = false, length = 50)
    private String marca;
    @Id
    @Column(nullable = false, length = 50)
    private String serialEquipo;
    @Column(nullable = false)
    private TipoComputador tipoComputador;
    @Column(nullable = false)
    private Cliente propietario;

    public Computador() {
    }
    
    public Computador(String marca, String serialEquipo, TipoComputador tipoComputador, Cliente propietario) throws Exception {
        if (serialEquipo == null || "".equals(serialEquipo.trim())) {
            throw new Exception("La serial del computador no debe estar vacia ni ser solo espacios");
        }
        if (marca == null || "".equals(marca.trim())) {
            throw new Exception("La marca del computador no debe estar vacia ni ser solo espacios");
        }
        if (tipoComputador == null) {
            throw new Exception("El computador debe debe tener un tipo");
        }
        if (propietario == null) {
            throw new Exception("El computador debe tener un propietario");
        }

        this.marca = marca;
        this.serialEquipo = serialEquipo;
        this.tipoComputador = tipoComputador;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getSerialEquipo() {
        return serialEquipo;
    }

    public TipoComputador getTipoComputador() {
        return tipoComputador;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSerialEquipo(String serialEquipo) {
        this.serialEquipo = serialEquipo;
    }

    public void setTipoComputador(TipoComputador tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "marca:   " + marca + "  serialEquipo:  " + serialEquipo + "  tipoComputador:  " + tipoComputador;
    }
}
