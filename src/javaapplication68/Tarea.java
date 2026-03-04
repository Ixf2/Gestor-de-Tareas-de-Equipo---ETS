/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication68;

/**
 *
 * @author Joana y Juan Antonio
 * @version 1.0
 * @since 2026
 * 
 */
public class Tarea {
/**
 * Descripción de la tarea
 */    
    private String descripcion;
    /**
     * Estado d ela tarea (booleano)
     */
    private boolean completada;

    /**
     * Contructor que crea una nueva tarea
     * La tarea se crea inicialmente como pendiente
     * @param descripcion descripción de la tarea
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    /**
     * Devuelve la descripción de la tarea
     * @return descripción de la tarea
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Indica si la tarea está completada
     * @return true si la tarea está completada, fales si está pendiente
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Marca la tarea como completada
     */
    public void completar() {
        completada = true;
    }
}
