/*Write a program to implement a basic queue data structure.*/
import java.util.*;

public class Test {
    private static class MyQueue {
        private Queue<Integer> queue;
        
        public MyQueue() {
            queue = new LinkedList<>();
        }
        
        public void enqueue(int x) {
            queue.offer(x);
        }
        
        public int dequeue() {
            if (isEmpty())
                throw new NoSuchElementException();
            return queue.poll();
        }
        
        public int peek() {
            if (isEmpty())
                throw new NoSuchElementException();
            return queue.peek();
        }
        
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}

/*
Space Complexity: O(n) - The space used is proportional to the number of elements in the queue.
*/