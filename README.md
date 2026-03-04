# Gestor de Tareas (Java)

Aplicación de consola en Java que permite gestionar una lista simple de tareas.  
El programa permite **añadir tareas** y **listar las tareas existentes** utilizando un menú interactivo en la terminal.

Este proyecto ha sido desarrollado como práctica de **trabajo colaborativo con Git y GitHub**, aplicando control de versiones, ramas de desarrollo y documentación con **JavaDoc**.

---

# Estructura del Proyecto

El programa está compuesto por tres clases principales:

### `Tarea.java`
Representa una tarea individual.

Atributos:
- `descripcion` → texto que describe la tarea.
- `completada` → indica si la tarea está terminada o no.

Incluye:
- Constructor
- Getters y setters
- Métodos para marcar la tarea como completada o pendiente
- Método `toString()` para mostrar la tarea correctamente.

---

### `GestorTareas.java`
ArrayList<> Tarea

Métodos principales:

**añadirTarea(String descripcion)**  
Añade una nueva tarea a la lista.

**mostrarTareas()**  
Recorre el ArrayList e imprime todas las tareas en pantalla.

---

### `Main.java`
Contiene el menú interactivo que permite al usuario utilizar el programa.

Opciones disponibles:
1. Añadir tarea

2. Listar tareas

3. Salir


El usuario introduce opciones por teclado y el programa ejecuta la acción correspondiente.

---

# Ejemplo de uso

--- Gestor de Tareas ---

Añadir tarea

Listar tareas

Salir
Elige una opción: 2

 Estudiar Git
---

# Tecnologías utilizadas

- Java
- NetBeans
- Git
- GitHub
- JavaDoc

---

# Control de versiones

Durante el desarrollo se han utilizado diferentes ramas:


main
develop
feature-registro
feature-listado


Flujo de trabajo utilizado:

1. Desarrollo de funcionalidades en ramas `feature`
2. Integración en `develop`
3. Verificación del funcionamiento
4. Fusión final en `main`

---

# Documentación

El proyecto incluye documentación generada con **JavaDoc**, ubicada en la carpeta:


/javadoc


La documentación describe las clases y métodos principales del programa.

---

# Autores
Joana Ramírez y Juan Antonio
Proyecto desarrollado como práctica de **Entornos de Desarrollo**  
Ciclo Formativo: **DAM**


iona la lista de tareas.

Utiliza:
