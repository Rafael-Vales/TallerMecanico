
package com.taller.tallermecanico.model;


public class Mecanico {
    
    public int id;
    public String nombre;
    public int dni;
    public String especialidad;
    public Double sueldo;
    
    public Mecanico(){}
    
    public Mecanico(int id, String nombre, int dni, String especialidad, double sueldo){
        
        this.id=id;
        this.nombre=nombre;
        this.dni=dni;
        this.especialidad=especialidad;
        this.sueldo=sueldo;
    }
    
    
    public int getId(){return id;}
    public void setId(int id) {this.id=id;}
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    
    public int getDni(){return dni;}
    public void setDni(int dni){this.dni=dni;}
    
    public String getEspecialidad(){return especialidad;}
    public void setEspecialidad(String especialidad){this.especialidad=especialidad;}
    
    public Double getSueldo(){return sueldo;}
    public void setSueldo(Double sueldo){this.sueldo=sueldo;}
    
    
     @Override
    public String toString() {
        return id + " - " + nombre + " - " + dni+ " - " + especialidad+ " - " + sueldo;
    }
    
}
