
package com.taller.tallermecanico.model;


public class Cliente {
    private int id;
    private String nombre;
    private String telefono;
    private String vehiculo;
    
    public Cliente(){}

    public Cliente(int id, String nombre, String telefono, String vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.vehiculo= vehiculo;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getVehiculo(){return vehiculo;}

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setVehiculo(String vehiculo){this.vehiculo=vehiculo;}
    

    @Override
    public String toString() {
        return id + " - " + nombre + " - " + telefono+ " - " + vehiculo;
}

}
