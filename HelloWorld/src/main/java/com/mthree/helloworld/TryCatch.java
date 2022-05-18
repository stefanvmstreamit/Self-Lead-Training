/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class TryCatch {
    public static void main(String[] args) {
        boolean isValid = false;
        Scanner myScanner = new Scanner(System.in);
        do{
            try{
                System.out.println("Please enter a whole number: ");
                
                String input = myScanner.nextLine();
                int number = Integer.parseInt(input);
            } catch(NumberFormatException ex){
                System.out.println("That was not a whole number");
            }
        } while(!isValid);
    }
}
