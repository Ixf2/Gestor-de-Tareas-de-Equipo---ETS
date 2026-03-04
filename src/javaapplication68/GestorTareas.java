/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication68;

/**
 * Gestión de la lista de tareas
 * Permite añadir nuevas tareas y mostrar todas las tareas
 * 
 * Utiliza ArrayList para almacenar el objeto Tarea
 * 
 * @author Joana y Juan Antonio
 * @version 1.0
 * @since 2026
 * 
 */
import java.util.ArrayList;

public class GestorTareas {
    /**
     * Lista las atareas de el objeto tarea
     */
    private ArrayList<Tarea> tareas;

    /**
     * Constructor de la clase
     * Inicia la lista vacía
     */
    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    /**
     * Añade una nueva tarea a la lista
     * @param descripcion  texto descriptivo de la tarea
     */
    public void añadirTarea(String descripcion) {
        Tarea nueva = new Tarea(descripcion);
        tareas.add(nueva);
    }
    
    /**
     * Muestra todas la tareas almacenadas en la Arraylist
     * Indica si vada tarea está completa o pendiente
     * 
     */
     public void mostrarTareas() {
        for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);

            if (t.isCompletada()) {
                System.out.println((i + 1) + ". " + t.getDescripcion() + " [COMPLETADA]");
            } else {
                System.out.println((i + 1) + ". " + t.getDescripcion() + " [PENDIENTE]");
            }
        }
    }

    
    
    
    
}
