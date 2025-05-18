import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] prefixSum = new int[n];

        prefixSum[0] = sc.nextInt();
        for(int i=1; i<n; i++){
            int temp = sc.nextInt();
             prefixSum[i] = prefixSum[i-1] + temp;
        }
        
        int count = 0;
        for(int end = n-1; end >= 0; end--){
            for(int start = 0; start <= end ; start++){
                int sum = 0;
                if(start == 0)
                     sum = prefixSum[end];
                else
                     sum = prefixSum[end] - prefixSum[start - 1];

                if(sum < 0)
                    count++;
            }
        }
           
        System.out.println(count);
    }
}
