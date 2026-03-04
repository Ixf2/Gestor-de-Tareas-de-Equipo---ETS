/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication68;

/**
 *
 * @author Joana
 */
import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void añadirTarea(String descripcion) {
        Tarea nueva = new Tarea(descripcion);
        tareas.add(nueva);
    }
    
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
