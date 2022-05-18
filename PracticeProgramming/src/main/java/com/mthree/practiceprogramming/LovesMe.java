/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mthree.practiceprogramming;
import java.util.Random;
/**
 *
 * @author stefa
 */
public class LovesMe {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(89 - 13) + 13;
        System.out.println("x is: " + x);
        int petals = 0;
        boolean flip = true;
        System.out.println("Well Here goes nothing");
        
        do
        {
            
            if(flip == true){
                System.out.println("It Loves me NOT");
                petals++;
                
                
            }
            if(flip == false){
                System.out.println("It Loves me");
                petals++;
        }
            flip = !flip;
            }while(petals < x);
        
        if(flip == true){
            System.out.println("I KNEW It Loves me");
        }
        else{
            System.out.println("DAMN IT");
        }
    }
}

    
