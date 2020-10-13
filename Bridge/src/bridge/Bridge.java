/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;
import java.io.File;
import java.util.*;
/**
 *
 * @author PeckT
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File file=new File("stuff.txt");
        try{
           Scanner sc=new Scanner (file);
           int countries=sc.nextInt();
           for (int i=1; i<=3; i++)
           {
               int home=sc.nextInt();
               int destination=sc.nextInt();
               int torists=sc.nextInt(); 
               int cities=sc.nextInt();
               int bridges=sc.nextInt();
               int all[]=new int[bridges+1];
               int connect[][]= new int[cities+1][cities+1];
               int low=0;
               for (int l=1; l<=cities;l++)
               {
                  for (int n=1; n<=cities;n++)
                  {
                      connect[l][n]=0;     
                  }
               }
               for (int l=1;l<=bridges;l++)
               {
                   int one=sc.nextInt();
                   int two=sc.nextInt();
                   all[l]=sc.nextInt();
                   connect[two][one]=all[l];
                   connect[one][two]=all[l];
               }
               
               
                for (int l=1; l<=cities;l++)
               {
                  for (int n=1; n<=cities;n++)
                  {
                      System.out.print(connect[l][n] + " ");
                  }
                  System.out.println();
               }
                System.out.println();
                
                System.out.println(fact(cities));
                
               
           }
           
        }
        catch(Exception ex){
            
        }
    }
    public static int fact(int p){
        if (p==1){
            return 1;
        }
        return p*fact(p-1);
    }
     static int maxSize(int destination, int current, List<Integer> visited, int[][] arr, int currentmin)
    {
        if (current == destination)
        {
            return currentmin;
        }
        else
        {
          for (int i=0; i<arr[0].length; i++)
          {
                  
          }
        }
    return 0;
    }
}



