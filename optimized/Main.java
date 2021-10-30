
import java.lang.*;
import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int numberOfRuns= obj.nextInt();
    
        for(int j = 1; j <= numberOfRuns; j++ ) {        
            
            int n = obj.nextInt();
            int k = obj.nextInt();    
                
            int lastMan = lastMan(n,k);
            
            System.out.println("Case " + j +": " +lastMan);
        }
    
    }

    static int lastMan(int n, int k){
    //base case
    if (n == 1)
        return 1;
    else
        //recursive case: solve the problem for n-1 people
        // and maintain circularity + 1 indexing
        return (lastMan(n-1, k)+ k-1 ) % n + 1 ;
    }
}

