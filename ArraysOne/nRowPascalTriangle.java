
import java.util.*;

public class tUf {
    public static int nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int)res;
    }

    public static void pascalTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            System.out.print(nCr(n-1,i-1)+" ");
        }
        
    }

    public static void main(String[] args) {
        int n = 5; // row number
        
        pascalTriangle(n);
        
        //System.out.println("The element at position (r,c) is: " + element);
    }
}  
        
