
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
public class sabado_lab3_3 {
    public static void main (String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String store = "";
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        System.out.print("Enter month: ");
        
        try {
            store = read.readLine();
        }
        catch(IOException e) {
            System.out.println(e);
        }
        
        int month = Integer.parseInt(store);
        
        System.out.print("Enter day: ");
        
        try {
            store = read.readLine();
        }
        catch(IOException e) {
            System.out.println(e);
        }
        
        int day = Integer.parseInt(store);
        
        if (day <= 0 || day > 31 || month > 12 || month <= 0) {
            System.out.println("Invalid day or month!");
            return;
        }
        
        String sign;
        sign =    month == 1 ? (day < 20 ? "Capricorn" : "Aquarius")
                : month == 2 ? (day < 19 ? "Aquarius" : "Pisces")
                : month == 3 ? (day < 21 ? "Pisces" : "Aries")
                : month == 4 ? (day < 20 ? "Aries" : "Taurus")
                : month == 5 ? (day < 21 ? "Taurus" : "Gemini")
                : month == 6 ? (day < 21 ? "Gemini" : "Cancer")
                : month == 7 ? (day < 23 ? "Cancer" : "Leo")
                : month == 8 ? (day < 23 ? "Leo" : "Virgo")
                : month == 9 ? (day < 23 ? "Virgo" : "Libra")
                : month == 10 ? (day < 23 ? "Libra" : "Scorpio")
                : month == 11 ? (day < 22 ? "Scorpio" : "Sagittarius")
                : month == 12 ? (day < 19 ? "Sagittarius" : "Capricorn")
                : "Aquarius";
        
        System.out.println ("Zodiac sign for " + months[month - 1] +  " " + day + " is " + sign);
    }
}
