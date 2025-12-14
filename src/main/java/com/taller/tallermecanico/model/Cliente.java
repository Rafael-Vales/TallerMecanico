package com.taller.tallermecanico.model;

/**
 * Representa un cliente en el sistema de taller mecánico.
 * Esta clase encapsula la información del cliente incluyendo identificación,
 * datos de contacto e información del vehículo.
 * 
 * @author rafaelvales
 */
public class Cliente {
    /** El identificador único del cliente. */
    private int id;
    
    /** El nombre completo del cliente. */
    private String nombre;
    
    /** El número de teléfono del cliente. */
    private String telefono;
    
    /** El vehículo asociado al cliente. */
    private String vehiculo;
    
    /**
     * Constructor por defecto que crea una instancia vacía de Cliente.
     */
    public Cliente(){}

    /**
     * Construye un Cliente con la información especificada.
     *
     * @param id el identificador único del cliente
     * @param nombre el nombre completo del cliente
     * @param telefono el número de teléfono del cliente
     * @param vehiculo el vehículo asociado al cliente
     */
    public Cliente(int id, String nombre, String telefono, String vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.vehiculo= vehiculo;
    }

    /**
     * Obtiene el identificador único del cliente.
     *
     * @return el ID del cliente
     */
    public int getId() { return id; }
    
    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    public String getNombre() { return nombre; }
    
    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return el número de teléfono del cliente
     */
    public String getTelefono() { return telefono; }
    
    /**
     * Obtiene el vehículo asociado al cliente.
     *
     * @return el vehículo del cliente
     */
    public String getVehiculo(){return vehiculo;}

    /**
     * Establece el identificador único del cliente.
     *
     * @param id el ID del cliente a establecer
     */
    public void setId(int id) { this.id = id; }
    
    /**
     * Establece el nombre del cliente.
     *
     * @param nombre el nombre del cliente a establecer
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono el número de teléfono del cliente a establecer
     */
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    /**
     * Establece el vehículo asociado al cliente.
     *
     * @param vehiculo el vehículo del cliente a establecer
     */
    public void setVehiculo(String vehiculo){this.vehiculo=vehiculo;}
    

    /**
     * Devuelve una representación en cadena del cliente.
     * El formato es: "id - nombre - telefono - vehiculo"
     *
     * @return una representación en cadena del cliente
     */
    @Override
    public String toString() {
        return id + " - " + nombre + " - " + telefono+ " - " + vehiculo;
}

}
