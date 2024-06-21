
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arvin
 */
public class sabado_lab3_1 {
    
    public static void main (String[] args) {
        //initialize average
        //ask input for the three exams
        //calculate average
        //display average
        //if average >= 60: display ":-)", else display ":-("
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String store = "";
        float average = 0f;
        
        System.out.print("Enter score for exam 1: ");
        
        try {
            store = reader.readLine();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
        average += Float.parseFloat(store);
        
        System.out.print("Enter score for exam 2: ");
        
        try {
            store = reader.readLine();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
        average += Float.parseFloat(store);
        
        System.out.print("Enter score for exam 3: ");
        
        try {
            store = reader.readLine();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
        average += Float.parseFloat(store);
        
        average = average / 3f;
        
        System.out.print("Exam average score: " + average);
        
        String rating = average >= 60 ? " :-)" : " :-(";
        
        System.out.println(rating);
        
    }
}
