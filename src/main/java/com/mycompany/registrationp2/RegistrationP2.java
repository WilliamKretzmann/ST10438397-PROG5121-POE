package com.mycompany.registrationp2;

import javax.swing.JOptionPane;

public class RegistrationP2 {
    public static void main(String[] args) {
     int option;
     int taskAmount;
     int taskNumber = 0;
     int total = 0;
       int taskDuration;
     String TaskName = null;
     String taskStatus;
     String taskDescription = null;
     String name = null;
     
     JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
     
     option = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one of the following options: \n"
             + "Option1, to add a task.\n"
             + "Option2, to view the report\n"
             + "Option3, to quit the program"));
     
     
     if (option == 1) 
     {
         
         taskAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to enter?"));
         while (taskNumber < taskAmount) 
         {
             
             TaskName = JOptionPane.showInputDialog(null, "Please enter the tasks name that shall perform");
             taskDescription = JOptionPane.showInputDialog(null, "Please enter the tasks description");
             while (taskDescription.length() > 50)
             
             {
                 taskDescription = JOptionPane.showInputDialog(null, "Please enter a task equal to or less than 50 characters");
             }
             
             taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the estimated duration of the task in hours"));
             JOptionPane.showMessageDialog(null, Task.createTaskID(TaskName, taskNumber, name));
             taskStatus = JOptionPane.showInputDialog("Please enter the task status for the current task: " +
                     "\n To do" +
                     "\n Done" +
                     "\n Doing");
       
               JOptionPane.showMessageDialog(null,Task.printTaskDetails(taskStatus, name, TaskName, taskDuration, taskDescription));
             
             taskNumber++;
             
             JOptionPane.showMessageDialog(null, Task.returnTotalHours(total, taskDuration));
         }
         
             option = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one of the following options provided: \n"
                     +"Option 1, to add task.\n"
                     +"Option 2, to view report\n"
                     +"Option 3, to quit"));
             
                        JOptionPane.showMessageDialog(null, "Task successfully created");
         }
     
             if (option == 2){
                 JOptionPane.showMessageDialog(null, "Will be created soon");
                 option = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one of the following options: \n"
                   + "Option 1, to add task.\n"
                     + "Option 2, to view report\n"
                     + "Option 3, to quit"));      

             }
             
     if (option == 3)
     {
         JOptionPane.showMessageDialog(null, "Thank you for using EasyKanban, goodbye");
     }
    }
}
