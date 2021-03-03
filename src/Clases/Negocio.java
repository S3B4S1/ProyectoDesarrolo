package Clases;

import java.util.ArrayList;

public class Negocio {

    private long nit;
    private String nombre;
    private ArrayList<Servicio> servicios;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;
    private ArrayList<Persona> tecnicos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Mantenimiento> mantenimientos;
    private ArrayList<Computador> computadores;
            
            
 

    public Negocio(long nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.mantenimientos = new ArrayList<>();
        this.computadores = new ArrayList<>();
        
    }

    public long getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public ArrayList<Persona> getTecnicos() {
        return tecnicos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public void setTecnicos(ArrayList<Persona> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setMantenimientos(ArrayList<Mantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }
    
    public Computador FindPc (String Serial) throws Exception{
        for (Computador comp : computadores) {
           if( comp.getSerialEquipo().equals(Serial)){
               return comp;
           }
        }
        throw  new Exception("El computador no se encuentra registrado en la base"
                + "de datos");
    }
    
    public void addPc (Computador pc) throws Exception{
       if( computadores.contains(pc)){
           throw new Exception("El computador ya se encuentra registrado");
       }
       this.computadores.add(pc);
       
    }
    public void addCliente (Cliente cl) throws Exception{
        if( clientes.contains(cl)){
            throw new Exception("El cliente ya se encuentra registrado");
        }
        this.clientes.add(cl);
    }
    
    public List 

}
