package com.taller.tallermecanico.model;

import java.time.LocalDate;

/**
 * Representa una Orden de Trabajo (ODT) en el sistema de taller mecánico.
 * Una ODT vincula un cliente, un mecánico y los detalles del trabajo incluyendo descripción,
 * estado, fechas y costo total. Esta es la entidad principal que rastrea las órdenes de trabajo
 * en el taller.
 * 
 * @author rafaelvales
 */
public class Odt {
    
    /** El identificador único de la orden de trabajo. */
    public int id;
    
    /** El cliente asociado a esta orden de trabajo. */
    private Cliente cliente;
    
    /** El mecánico asignado a esta orden de trabajo. */
    private Mecanico mecanico;
    
    /** Descripción del trabajo a realizar o problema a resolver. */
    private String descripcion;
    
    /** Estado actual de la orden de trabajo (ej: "Pendiente", "En Proceso", "Completado"). */
    private String estado;
    
    /** Fecha en que se recibió la orden de trabajo. */
    private LocalDate fechaIngreso;
    
    /** Fecha de entrega esperada o real del trabajo completado. */
    private LocalDate fechaEntrega;
    
    /** Costo total de la orden de trabajo. */
    private double costoTotal;
    
    /**
     * Constructor por defecto que crea una instancia vacía de Odt.
     */
    public  Odt(){}
    
    /**
     * Construye una Odt con la información especificada.
     *
     * @param id el identificador único de la orden de trabajo
     * @param cliente el cliente asociado a esta orden de trabajo
     * @param mecanico el mecánico asignado a esta orden de trabajo
     * @param descripcion descripción del trabajo a realizar
     * @param estado estado actual de la orden de trabajo
     * @param fechaIngreso fecha en que se recibió la orden de trabajo
     * @param fechaEntrega fecha de entrega esperada o real
     * @param costoTotal costo total de la orden de trabajo
     */
   public Odt(int id, Cliente cliente, Mecanico mecanico, String descripcion, String estado, LocalDate fechaIngreso, LocalDate fechaEntrega, double costoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.costoTotal = costoTotal;
    }
    
    /**
     * Obtiene el identificador único de la orden de trabajo.
     *
     * @return el ID de la orden de trabajo
     */
    public int getId(){return id;}
    
    /**
     * Establece el identificador único de la orden de trabajo.
     *
     * @param id el ID de la orden de trabajo a establecer
     */
    public void setId(int id) {this.id=id;}
    
    /**
     * Obtiene el cliente asociado a esta orden de trabajo.
     *
     * @return el cliente asociado a esta orden de trabajo
     */
    public Cliente getCliente(){return cliente;}
    
    /**
     * Establece el cliente asociado a esta orden de trabajo.
     *
     * @param cliente el cliente a asociar con esta orden de trabajo
     */
    public void setCliente(Cliente cliente){this.cliente=cliente;}
    
    /**
     * Obtiene el mecánico asignado a esta orden de trabajo.
     *
     * @return el mecánico asignado a esta orden de trabajo
     */
    public Mecanico getMecanico(){return mecanico;}
    
    /**
     * Establece el mecánico asignado a esta orden de trabajo.
     *
     * @param mecanico el mecánico a asignar a esta orden de trabajo
     */
    public void setMecanico(Mecanico mecanico) {
    this.mecanico = mecanico;
}
    
    /**
     * Obtiene la descripción del trabajo a realizar.
     *
     * @return la descripción del trabajo
     */
    public String getDescripcion(){return descripcion;}
    
    /**
     * Establece la descripción del trabajo a realizar.
     *
     * @param descripcion la descripción del trabajo a establecer
     */
    public void setDescripcion (String descripcion){this.descripcion=descripcion;}
    
    /**
     * Obtiene el estado actual de la orden de trabajo.
     *
     * @return el estado de la orden de trabajo
     */
    public String getEstado(){return estado;}
    
    /**
     * Establece el estado actual de la orden de trabajo.
     *
     * @param estado el estado de la orden de trabajo a establecer
     */
    public void setEstado(String estado){this.estado=estado;}
    
    
    /**
     * Obtiene la fecha en que se recibió la orden de trabajo.
     *
     * @return la fecha de recepción
     */
    public LocalDate getFechaIngreso(){return fechaIngreso;}
    
    /**
     * Establece la fecha en que se recibió la orden de trabajo.
     *
     * @param fechaIngreso la fecha de recepción a establecer
     */
    public void setFechaIngreso(LocalDate fechaIngreso){this.fechaIngreso=fechaIngreso;}
    
    /**
     * Obtiene la fecha de entrega esperada o real.
     *
     * @return la fecha de entrega
     */
    public LocalDate getFechaEntrega(){return fechaEntrega;}
    
    /**
     * Establece la fecha de entrega esperada o real.
     *
     * @param fechaEntrega la fecha de entrega a establecer
     */
    public void setFechaEntrega(LocalDate fechaEntrega){this.fechaEntrega=fechaEntrega;}
    
    /**
     * Obtiene el costo total de la orden de trabajo.
     *
     * @return el costo total
     */
    public double getCostoTotal(){return costoTotal;}
    
    /**
     * Establece el costo total de la orden de trabajo.
     *
     * @param costoTotal el costo total a establecer
     */
   public void setCostoTotal(double costoTotal) {
    this.costoTotal = costoTotal;
}
    
    
    
    
    
}
