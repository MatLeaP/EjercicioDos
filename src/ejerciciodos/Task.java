/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Task {
    
    private int contador = 0;
    private int id;
    private String name;
    private String description;
    private List<Task> taskList = new ArrayList<>();
    
    public Task(){
        
    }
    
    public Task(String name, String description, String date){
        
        this.name = name;
        this.description = description;
        
    }
    
    
    public void newTask() {
        String message;
        
    do {
        Task task = new Task();
        task.name = JOptionPane.showInputDialog("Ingrese el título de la nueva tarea");
        task.description = JOptionPane.showInputDialog("Ingrese la descripción de la tarea");

        if (task.name != null && !task.name.isEmpty() && task.description != null && !task.description.isEmpty()) {
            task.id = contador + 1;
            taskList.add(task);
            contador ++;
        } else {
            JOptionPane.showMessageDialog(null, "El título, la descripción y la fecha no pueden estar vacíos. La tarea no se ha creado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        message = JOptionPane.showInputDialog("¿Desea agregar otra tarea? (Sí/No)");
    } while (!message.equals("no"));
}

    
    public void showTask(){
        
        if(taskList != null){
            StringBuilder taskDetails = new StringBuilder("Lista de tareas:\n");
            taskList.forEach(task -> {
            taskDetails.append("ID: ").append(task.id).append(", Nombre de la tarea: ").append(task.name).append(", Descripción de la tarea: ").append(task.description).append("\n");});
            JOptionPane.showMessageDialog(null, taskDetails.toString());
        }else{
            JOptionPane.showMessageDialog(null, "No hay tareas para realizar");
        }
        

    
    }
    
}
