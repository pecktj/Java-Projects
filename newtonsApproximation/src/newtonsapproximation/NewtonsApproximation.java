/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonsapproximation;

/**
 *
 * @author PeckT
 */
public class NewtonsApproximation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(squareRoot(8));
    }
   static double squareRoot(double num){
        double guess=1;
        double guess2=1;
        do {
            guess=guess2;
            guess2=((num/guess)+guess)/2;
        }while((Math.abs(guess-guess2))>.0000000001);
        return guess2;
    }
}
