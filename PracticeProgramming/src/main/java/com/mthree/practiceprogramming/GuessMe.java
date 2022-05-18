/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mthree.practiceprogramming;
import java.util.Scanner;
/**
 *
 * @author stefa
 */
public class GuessMe {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int favNum = 69;
        String stringGuess;
        int guess;
        System.out.println("Pick a number m8: ");
        stringGuess = myScanner.nextLine();
        guess = Integer.parseInt(stringGuess);
        
        if(guess == favNum){
            System.out.println("Correct");
        }
        if(guess < favNum){
            System.out.println("Too Low, I chose " + favNum);
        }
        if (guess > favNum){
            System.out.println("Too High, I chose " + favNum);
        }
        
    }
}
