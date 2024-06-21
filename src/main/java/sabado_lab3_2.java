
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
public class sabado_lab3_2 {
    
    public static float interest(float account, float rate) {
        return account * rate;
    }
    
    public static void main (String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String store = "";
        boolean run = true;
        float annualBalance = 0f, monthlyBalance = 0f, dailyBalance = 0f, rate = 0f;
        
        while (run) {
            System.out.print("\nEnter account balance: ");
            try {
                store = read.readLine();
            }
            catch (IOException e) {
                System.out.println(e);
            }
            
            annualBalance = Float.parseFloat(store);
            monthlyBalance = Float.parseFloat(store);
            dailyBalance = Float.parseFloat(store);
            
            System.out.print("Enter interest rate (in percent %): ");
            
            try {
                store = read.readLine();
            }
            catch (IOException e) {
                System.out.println(e);
            }
            
            rate = Float.parseFloat(store) / 100f;
            
            for (int x = 1; x <= 10; x++) {
                annualBalance += interest(annualBalance, rate);
            }
            
            for (int x = 1; x <= 120; x++) {
                monthlyBalance += interest(monthlyBalance, rate / 12);
            }
            
            for (int x = 1; x <= 3650; x++) {
                dailyBalance += interest(dailyBalance, rate / 365);
            }
            
            System.out.println("\nAfter 10 years:\nAnnuual: " + annualBalance);
            System.out.println("Monthly: " + monthlyBalance);
            System.out.println("Daily: " + dailyBalance);
            
            System.out.print("\nCalculate again? (Y for yes, anything for no): ");
            
            try {
                store = read.readLine();
            }
            catch (IOException e) {
                System.out.println(e);
            }
            
            run = "y".equals(store.toLowerCase());
        }
        
    }
}
