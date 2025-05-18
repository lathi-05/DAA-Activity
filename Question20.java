import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
    StringTokenizer st=new StringTokenizer(str," ,.!?_'@+");
    int count=st.countTokens();
    System.out.println(count);
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
        scan.close();
    }
    }
}
