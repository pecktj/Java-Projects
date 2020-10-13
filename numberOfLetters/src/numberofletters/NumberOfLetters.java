/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofletters;

/**
 *
 * @author PeckT
 */
public class NumberOfLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name = "Hello world";
int sum=0;
for (int i=0; i<name.length(); i++){
if (Character.isLetter(name.charAt(i))){
sum=sum+1;}
}
System.out.print(sum);
    }
    
}
