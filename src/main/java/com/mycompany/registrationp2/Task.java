
package com.mycompany.registrationp2;

import javax.swing.JOptionPane;

public class Task {
    public static boolean checkTaskDescription (String description){
        if (description.length() <= 50){
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            return true;
        }
        else
        {
            System.out.println("Please enter a task description less than 50 characters");
            return false;
        }
        
    }
    public static String createTaskID (String taskName, int taskNumber, String name){
        taskName = taskName.substring(0,2);
        name = name.substring(name.length() - 3);
        return taskName.toUpperCase() + ":" + taskNumber + ":" + name.toUpperCase();
    } 

    public static boolean checktaskDescription(String this_is_a_valid_task_description) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Object printTaskDetails(String taskStatus, String name, String TaskName, int taskDuration, String taskDescription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Task(String testTask, String task_description, int i, String to_do, int i0, String william, String kretzmann) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        public String printTaskDetails (String taskStatus, String surname, String name, int taskNumber, String taskDescription, int taskDuration, String taskName){
            return taskStatus + "\n" + name +
                    surname + "\n" + "Task number: " + taskNumber + "\n" +
                    taskName + "\n" + taskDescription + "\n" + "Task ID: " +
                    createTaskID (taskName, taskNumber, name) + "\n" + "Task duration: " + taskDuration;
        }
        public static int returnTotalHours (int total, int taskDuration){
            total = total + taskDuration;
            return total;
    }
    
}
