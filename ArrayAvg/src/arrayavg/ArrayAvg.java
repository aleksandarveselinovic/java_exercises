/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayavg;

/**
 *
 * @author aveselinovic
 */
public class ArrayAvg {
    
    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        
        double numbers[] = {10.5, 10.6, 10.7, 10.8, 10.9};
        double result = 0;
        int i;
        int numbersArrayLength = numbers.length;
        
        for (i = 0 ; i < numbersArrayLength; i++){
            
            result+=numbers[i]/ numbersArrayLength;
        }
        System.out.println("Array length is: " + numbersArrayLength);
        System.out.println("Average value of the array's elements is: " + result);
                
    }
    
}