//Timothy Peck
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;
//imports for the scanner file class
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author PeckT
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       String test="";
     //first, when ready from a file using a scanner you need a try and a catch
        try{
            //variables for the file and scanner are made to read the file
        File file=new File("clock.txt");
        Scanner sc= new Scanner(file);
        //this array was made to get each number of the time in the array
        //(hour, hour, minute, minute, second, second)
         int[] time=new int[6];
      //this while reads line by line and stops when the file has no more lines 
         while(sc.hasNextLine()) {
           
             //this reads one entire line of the file for example 23:15:21
                   test=sc.next();
                   int m=0;
             // the for loop and if go through each character of the line and
             //if its a digit place it in the array
             //this was to eliminate the colons from the time
              for (int i=0; i<8; i++){     
             if(Character.isDigit(test.charAt(i)))
             {
                
                 time[m]=Integer.parseInt(test.substring(i, i+1));
                   System.out.print(time[m]);
                 m++;
              
               
             }
             }
              //now that the numbers are in the array I used a case to go line
              //by line of the clock and place the ones accordingly 
              System.out.println();
             for ( int j=0; j<4; j++){
                 
                 switch (j){
                     case 0:
                        //these for loops in the case will send each array
                        //number to the method to sort the ones and directly 
                        //print them out in the loop. This creates line one of
                        //the binary clock, for example will be 000000 for both 
                         for (int i=0; i<6; i++){
                         System.out.print(line1(time[i]));
                         }
                      System.out.println();
                      break;
                     case 1:
                         //creates line 2 sends to line 2 method
                          for (int i=0; i<6; i++){
                         System.out.print(line2(time[i]));
                         }
                      System.out.println();
                      break;
                     case 2:
                          //creates line 3 sends to line 3 method
                          for (int i=0; i<6; i++){
                         System.out.print(line3(time[i]));
                         }
                      System.out.println();
                      break;
                      case 3:
                           //creates line 4 sends to line 4 method
                          for (int i=0; i<6; i++){
                         System.out.print(line4(time[i]));
                         }
                      System.out.println();
                      break;
                 }
            }
             //for neatness
              System.out.println();
         }
        }catch (FileNotFoundException e) {
               e.printStackTrace();
       }
    }
    //for line one 1's could only be placed if the number is 
    //an 8 or a 9 so i checked those two numbers 
    //if it wasn't those two numbers a 0 would be returned, 
    //this is the same concept for the other line
    //but just with different number checks
    public static int line1 (int a){
       if ( a==9 || a==8)
           return 1;
           return 0;
    }
     public static int line2 (int a){
         if (a==7 || a==6 || a==5 ||a==4)
             return 1;
             return 0;
     }
        public static int line3 (int a){
         if (a==6 || a==3 || a==2)
             return 1;
             return 0;
        }
        public static int line4 (int a){
         if (a==9 || a==7 || a==5 || a==3 || a==1)
             return 1;
             return 0;
        }
}
