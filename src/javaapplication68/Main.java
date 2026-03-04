/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication68;

/**
 * Clase que ejecuta el programa de gestión de tareas.
 * Menú interactivo para el usuario pueda añadir y listar tareas
 * @author Joana y Juan Antonio
 * @version 1.0
 * @since 2026
 * 
 */
import java.util.Scanner;
public class Main {

   
    /**
     * Método principal para iniciar programa
     * Menú gestión de tareas
     * @param  args argumentos de línea de comandos
    */
   public static void main(String[] args) {

       try (Scanner sc = new Scanner(System.in)) {
           GestorTareas gestor = new GestorTareas();
           int opcion;
           
           do {
               System.out.println("\n1. Añadir tarea");
               System.out.println("2. Listar tareas");
               System.out.println("0. Salir");
               System.out.print("Elige una opción: ");
               
               opcion = sc.nextInt();
               sc.nextLine();
               
               switch (opcion) {
                   
                   case 1 -> {
                       System.out.print("Introduce la descripción de la tarea: ");
                       String descripcion = sc.nextLine();
                       gestor.añadirTarea(descripcion);
                       System.out.println("Tarea añadida.");
                   }
                       
                   case 2 -> gestor.mostrarTareas();
                       
                   case 0 -> System.out.println("Saliendo del programa.");
                       
                   default -> System.out.println("Opción no válida.");
               }
               
           } while (opcion != 0);
       }
    }
    
}
