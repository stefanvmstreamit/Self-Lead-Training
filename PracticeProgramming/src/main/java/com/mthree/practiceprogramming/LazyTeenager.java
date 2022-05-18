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
public class LazyTeenager {
    public static void main(String[] args) {
        Random rand  = new Random();
        int x = rand.nextInt(10 + 1);
        System.out.println("x is " + x);

        /*int i = 1;
      
    while (i<8){  
        System.out.println("Clean your room (x" + i + ")");
        
        if(i == 1 && x == 1){
            System.out.println("FINE I WILL CLEAN MY ROOM");
           break;
        }
        if(i == 2 && x <=2){
            System.out.println("FINE I WILL CLEAN MY ROOM");
            break;
        }
        if(i == 3 && x <=3){
            System.out.println("FINE I WILL CLEAN MY ROOM");
            break;
        }
        if(i == 4 && x <=4){
            System.out.println("FINE I WILL CLEAN MY ROOM");
            break;
        }
        if(i == 5 && x <=5){
            System.out.println("FINE I WILL CLEAN MY ROOM");
            break;
        }
        if(i == 6 && x <=6){
            System.out.println("FINE I WILL CLEAN MY ROOM");
            break;
        }
        if(i == 7){
            System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
            break;
        }*/
         for (int i = 1; i<8; i++){
             System.out.println("Clean your room (x" + i + ")");
              if(x <= i && i != 7){
                 System.out.println("FINE I WILL CLEAN MY ROOM");
                 break;
              }
              else if (i == 7){
                  System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
              }
          }  
            
        }
    }
        
             
             
             

       
       
               
       
        
        
     
        
        


