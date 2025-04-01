import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder()); 
        
        int[] arr = {10, 20, 3, 4, 5, 12, 45, 89};
        
        for (int a : arr) {
            minheap.add(a);
            maxheap.add(a);
        }
        
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ");
        }
        
        while (!maxheap.isEmpty()) {
            System.out.print(maxheap.poll() + " ");
        }
    }
}
