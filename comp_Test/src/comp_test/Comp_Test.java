/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp_test;

/**
 *
 * @author PeckT
 */
public class Comp_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String str1=new String("f");
        String str2=new String("girl");
        StringBuffer test=new StringBuffer("reverse");
        int yo[]={1,2,9,4,80};
        int place=0;
        for(int i=0;i<5;i++)
        {
        place=(Math.max(yo[i],place));
        }
        System.out.println(place);
        test=test.reverse();
        String reverse=new String(test);
        System.out.print(reverse);
        if(Character.isLetter(str1.charAt(0)))
        {
            System.out.println("noice");
        }
        try
        {
        int array[]={1,2,2};
           for(int i=0;i<5;i++)
        {
        array[i]=0;
            
        }
        }
        catch(Exception IndexOutOfBounds)
        {
       System.out.print("fail");
        }
    }
    
}
