import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        Set<Integer> j = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            j.add(num);
            if(deque.size()==m){
                int count = j.size();
                if(max<count)  max=count ;
                int target = deque.removeFirst();
                if(!deque.contains(target)) j.remove(target);
            }
        }
        System.out.println(max);
    }
}
