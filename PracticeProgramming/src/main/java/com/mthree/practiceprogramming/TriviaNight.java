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
public class TriviaNight {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        
        
        
        int correctGuess = 0;
        
        System.out.println("Its Trivia Night! Are you ready?!");
        
        System.out.println("FIRST QUESTTION");
        
        System.out.println("What is the lowest Level Programming Language?");
        System.out.println("1) Source code                  2) Assembly Language");
        System.out.println("3) C#                           4) Machine Code");
        
        System.out.println("Your Answer");
        String stringAnswer1 = myScanner.nextLine();
        int answer1 = Integer.parseInt(stringAnswer1);
        if(answer1 == 4){
            correctGuess += 1;
        }
        System.out.println("Second QUESTTION");
        
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper                  2) Alan Turing");
        System.out.println("3) Charles Babbage               4) Larry PAge");
        
        System.out.println("Your Answer");
        String stringAnswer2 = myScanner.nextLine();
        int answer2 = Integer.parseInt(stringAnswer2);
        if(answer2 == 2){
            correctGuess += 1;
        }
        System.out.println("Third QUESTTION");
        
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity                  2)Battlestar Galactica");
        System.out.println("3) The USS Enterprise        4) Millenium Flacon");
        
        System.out.println("Your Answer");
        String stringAnswer3 = myScanner.nextLine();
        int answer3 = Integer.parseInt(stringAnswer3);
        if(answer3 == 3){
            correctGuess += 1;
        }
        
        System.out.println("You Guessed " + correctGuess + " right");
    }
}
