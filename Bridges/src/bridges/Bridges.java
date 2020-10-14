package bridges;
import java.util.*;
import java.io.*;
/**
 *
 * @author tipeck
 */
public class Bridges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file=new File("file.txt");
        try{
           Scanner sc=new Scanner (file);
           int countries=sc.nextInt();
           for (int a = 0; a < countries; a++)
           {
              int home=sc.nextInt();
              int destination=sc.nextInt();
              int tourists=sc.nextInt(); 
              int cities=sc.nextInt();
              int numbridges=sc.nextInt();
           
              int bridges[][] = new int[numbridges + 1][numbridges + 1];
           for (int b = 0; b < numbridges; b++)
           {
               int first = sc.nextInt();
               int second = sc.nextInt();
               int size = sc.nextInt();
               bridges[first][second] = size;
               bridges[second][first] = size;
           }
             List<Integer> visited = new ArrayList<Integer>();
             visited.add(home);
             int max = 0;
             System.out.println("Result" + maxSize(destination,home,visited, bridges,Integer.MAX_VALUE));
               
               
               
               
           }
               
             
           
        }
        catch(Exception ex){
            
        }
    }
    static int maxSize(int destination, int current, List<Integer> visited, int[][] arr, int currentmin)
    {
        if (current == destination)
        {
            return currentmin;
        }
        else
        {
            visited.add(current);
        
            int max = 0;
            for (int i = 1; i < arr.length; i++)
            {
                if (arr[current][i] != 0)
                {
                    boolean good = true;
                    for (int j = 0; j < visited.size(); j++)
                    {
                        if (i == visited.get(j))
                        {
                            good = false;
                        }
                    }
                    if (good)
                    {
                        List<Integer> newList = new ArrayList<Integer>();
                        for (Integer bu : visited)
                        {
                            newList.add(bu);
                        }
                        int newcurrentmin = currentmin;
                        if (arr[current][i] < currentmin)
                        {
                            newcurrentmin = arr[current][i];
                        }
                        int check = maxSize(destination, i, newList, arr, newcurrentmin);
                        if (check > max)
                        {
                            max = check;
                        }
                    }
                }
            }
            return max;
        }
    }
}
