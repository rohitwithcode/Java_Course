package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque1=new ArrayDeque<>(5);

        arrayDeque1.add(10);
        arrayDeque1.add(20);
        arrayDeque1.add(30);
        arrayDeque1.add(40);
        arrayDeque1.add(50);

        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.add(5);

        arrayDeque.addAll(arrayDeque1);
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.isEmpty());
        System.out.println(arrayDeque.offer(60)); //Inserts the specified element at the end of this deque.
        System.out.println(arrayDeque.offerFirst(0));
        System.out.println(arrayDeque.offerLast(70));
        // Print the arrayDeque
        System.out.println(arrayDeque);

        System.out.println("The First element of the arrayDeque : "+arrayDeque.peek()); //Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.
        System.out.println("The First element of the arrayDeque : "+arrayDeque.peekFirst());
        System.out.println("The Last element of the arrayDeque : "+arrayDeque.peekLast());


        System.out.println("The arrayDeque after the remove first element : "+arrayDeque.poll()); //Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
        System.out.println(arrayDeque);
        System.out.println("The arrayDeque after the remove first element : "+arrayDeque.pollFirst());
        System.out.println(arrayDeque);
        System.out.println("The arrayDeque after the remove Last element : "+arrayDeque.pollLast());
        System.out.println(arrayDeque);

        System.out.println("The arrayDeque after the remove first element : "+arrayDeque.remove()); //Retrieves and removes the head of the queue represented by this deque.
        System.out.println(arrayDeque);
        System.out.println("The arrayDeque after the remove first element : "+arrayDeque.remove(5)); //Removes a single instance of the specified element from this deque.
        System.out.println(arrayDeque);
        System.out.println("The arrayDeque after the remove Last element : "+arrayDeque.removeAll(arrayDeque1));
        System.out.println(arrayDeque);
    }
}
