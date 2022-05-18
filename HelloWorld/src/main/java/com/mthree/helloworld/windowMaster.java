/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.helloworld;
import java.util.Scanner;


/**
 *
 * @author stefa
 */
public class windowMaster {
    public static void main(String[] args) {
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        String stringCostOfArea;
        String stringCostOfPerimeter;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float costOfArea;
        float costOfPerimeter;
        Scanner myScanner = new Scanner(System.in);
        
        boolean isValid = false;
        
        do{
            try{
                
        System.out.println("Please enter the height of the window (in feet): ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter the width of the window (in feet): ");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter the price of the window area: ");
        stringCostOfArea = myScanner.nextLine();
        System.out.println("Please enter the price of the window perimeter: ");
        stringCostOfPerimeter = myScanner.nextLine();
         
        
        
        
        //Convert
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        costOfArea = Float.parseFloat(stringCostOfArea);
        costOfPerimeter = Float.parseFloat(stringCostOfPerimeter);
           
        
        //Calculate area
        areaOfWindow = height * width;
        
        //Calculate Perimiter
        perimeterOfWindow = 2 * (height + width);
        
        //Hardcocded total costs
        cost = ((costOfArea * areaOfWindow)+ (costOfPerimeter * perimeterOfWindow)); 
        
        //Display
        System.out.println("Window Height = " + height);
        System.out.println("Window Width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window Perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = $" + cost);
        }catch(NumberFormatException ex){
                System.out.println("Please enter a valid float number");
           }
           isValid = true;
        }while(!isValid);
    }
}
