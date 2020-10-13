/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequential_search;

/**
 *
 * @author PeckT
 */
public class Sequential_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[]={3,7,3,1,8,0,6,4,7,8};
        System.out.print(search(array,1));
         System.out.print(search(array,8));
          System.out.print(search(array,10));
    }
    public static int search(int list1[], int key){
    for (int k=0;k<list1.length;k++)
    {
        if(list1[k]==key)    
        return k;
    }
    return -1;
    }
}
