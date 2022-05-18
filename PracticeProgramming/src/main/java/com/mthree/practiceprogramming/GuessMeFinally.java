/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mthree.practiceprogramming;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author stefa
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringGuess;
        int guess;
        
        
        Random rand = new Random();
        
        int x = rand.nextInt(100 - -100) + -100;
        System.out.println("x is: " + x);
        while(true){
            System.out.println("Your guess: ");
            stringGuess = scan.nextLine();
            guess = Integer.parseInt(stringGuess);
            
            if(guess < x){
                System.out.println("Ha, nice try - too low! Try Again");
            }
            else if (guess > x){
                System.out.println("Too bad - too high! Try Again");
            }
            else if(guess == x){
                System.out.println("You Got it!");
                break;
            }
        }
    }
}

    
