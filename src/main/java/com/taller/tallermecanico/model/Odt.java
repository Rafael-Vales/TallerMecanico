
package com.taller.tallermecanico.model;

import java.time.LocalDate;



public class Odt {
    
    public int id;
    private Cliente cliente;
    private Mecanico mecanico;
    private String descripcion;
    private String estado;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private double costoTotal;
    
    public  Odt(){}
    
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
    
    public int getId(){return id;}
    public void setId(int id) {this.id=id;}
    
    public Cliente getCliente(){return cliente;}
    public void setCliente(Cliente cliente){this.cliente=cliente;}
    
    public Mecanico getMecanico(){return mecanico;}
    public void setMecanico(Mecanico mecanico) {
    this.mecanico = mecanico;
}
    
    public String getDescripcion(){return descripcion;}
    public void setDescripcion (String descripcion){this.descripcion=descripcion;}
    
    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado=estado;}
    
    
    public LocalDate getFechaIngreso(){return fechaIngreso;}
    public void setFechaIngreso(LocalDate fechaIngreso){this.fechaIngreso=fechaIngreso;}
    
    public LocalDate getFechaEntrega(){return fechaEntrega;}
    public void setFechaEntrega(LocalDate fechaEntrega){this.fechaEntrega=fechaEntrega;}
    
    public double getCostoTotal(){return costoTotal;}
   public void setCostoTotal(double costoTotal) {
    this.costoTotal = costoTotal;
}
    
    
    
    
    
}
