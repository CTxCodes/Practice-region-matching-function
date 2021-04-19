/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regionmatchestest;

/**
 *
 * @author cjt1496
 */
import java.util.Scanner;
public class regionMatches {
    Scanner input = new Scanner(System.in);
    String firstWord;
    String secondWord;
   
    int endingIndex;
    int count = 0;
    
    public void region_Matches_Run(){
        System.out.println("Enter the first word to compare...");
        firstWord = input.nextLine();
        System.out.println("Enter the second word to compare...");
        secondWord = input.nextLine();
      

        System.out.println("Enter the ending index to end the comparison...");
        endingIndex = input.nextInt();
       
        
        if(firstWord.regionMatches(true, 0, secondWord, 0, endingIndex)){
            System.out.println("The starting index and the ending index " + endingIndex + " of " + firstWord + " and " + secondWord + " matches!");
        } else {
             System.out.println("The starting index and the ending index " + endingIndex + " of " + firstWord + " and " + secondWord + " do not match!");
        }
        
    }
    
}
            

