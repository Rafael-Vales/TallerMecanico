package com.taller.tallermecanico.model;

/**
 * Representa un mecánico en el sistema de taller mecánico.
 * Esta clase encapsula la información del mecánico incluyendo identificación,
 * datos personales, especialización e información salarial.
 * 
 * @author rafaelvales
 */
public class Mecanico {
    
    /** El identificador único del mecánico. */
    public int id;
    
    /** El nombre completo del mecánico. */
    public String nombre;
    
    /** El número de identificación nacional (DNI) del mecánico. */
    public int dni;
    
    /** El área de especialización del mecánico. */
    public String especialidad;
    
    /** El salario del mecánico. */
    public Double sueldo;
    
    /**
     * Constructor por defecto que crea una instancia vacía de Mecanico.
     */
    public Mecanico(){}
    
    /**
     * Construye un Mecanico con la información especificada.
     *
     * @param id el identificador único del mecánico
     * @param nombre el nombre completo del mecánico
     * @param dni el número de identificación nacional del mecánico
     * @param especialidad el área de especialización del mecánico
     * @param sueldo el salario del mecánico
     */
    public Mecanico(int id, String nombre, int dni, String especialidad, double sueldo){
        
        this.id=id;
        this.nombre=nombre;
        this.dni=dni;
        this.especialidad=especialidad;
        this.sueldo=sueldo;
    }
    
    
    /**
     * Obtiene el identificador único del mecánico.
     *
     * @return el ID del mecánico
     */
    public int getId(){return id;}
    
    /**
     * Establece el identificador único del mecánico.
     *
     * @param id el ID del mecánico a establecer
     */
    public void setId(int id) {this.id=id;}
    
    /**
     * Obtiene el nombre del mecánico.
     *
     * @return el nombre del mecánico
     */
    public String getNombre(){return nombre;}
    
    /**
     * Establece el nombre del mecánico.
     *
     * @param nombre el nombre del mecánico a establecer
     */
    public void setNombre(String nombre){this.nombre=nombre;}
    
    /**
     * Obtiene el número de identificación nacional del mecánico.
     *
     * @return el DNI del mecánico
     */
    public int getDni(){return dni;}
    
    /**
     * Establece el número de identificación nacional del mecánico.
     *
     * @param dni el DNI del mecánico a establecer
     */
    public void setDni(int dni){this.dni=dni;}
    
    /**
     * Obtiene el área de especialización del mecánico.
     *
     * @return la especialización del mecánico
     */
    public String getEspecialidad(){return especialidad;}
    
    /**
     * Establece el área de especialización del mecánico.
     *
     * @param especialidad la especialización del mecánico a establecer
     */
    public void setEspecialidad(String especialidad){this.especialidad=especialidad;}
    
    /**
     * Obtiene el salario del mecánico.
     *
     * @return el salario del mecánico
     */
    public Double getSueldo(){return sueldo;}
    
    /**
     * Establece el salario del mecánico.
     *
     * @param sueldo el salario del mecánico a establecer
     */
    public void setSueldo(Double sueldo){this.sueldo=sueldo;}
    
    
    /**
     * Devuelve una representación en cadena del mecánico.
     * El formato es: "id - nombre - dni - especialidad - sueldo"
     *
     * @return una representación en cadena del mecánico
     */
     @Override
    public String toString() {
        return id + " - " + nombre + " - " + dni+ " - " + especialidad+ " - " + sueldo;
    }
    
}
