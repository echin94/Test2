/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

/**
 *
 * @author class
 */
public class Test2 {

    public static boolean hasNumberOfSpaces(String str, int numSpaces) {
        // TODO code application logic here
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
                count++;
    }
    return count == numSpaces;
}
   public static void main(String[] args) {
       System.out.println("hasNumberOfSpaces(\"Pete\", 0" +
               hasNumberOfSpaces("Pete", 0)) ;
       System.out.println("hasNumberOfSpaces(\"LeBron James\", 0" +
               hasNumberOfSpaces("Lebron James", 1)) ;
       
       
   }
    
    
}
