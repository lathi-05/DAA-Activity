import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);        
    int n = sc.nextInt();  
    ArrayList<Integer>[] arr = new ArrayList[n];

    for (int i = 0; i < n; i++) {
        int m = sc.nextInt();  
        arr[i] = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            int value = sc.nextInt();
            arr[i].add(value);
        }
    }

    int mn = sc.nextInt();  

    for (int i = 0; i < mn; i++) {
        int val1 = sc.nextInt()-1;  
        int val2 = sc.nextInt()-1;  

        if (val1 < 0 || val1 >= n || val2 < 0 || val2 >= arr[val1].size()) {
            System.out.println("ERROR!");
        } else {
            System.out.println(arr[val1].get(val2));
        }
    }
    
