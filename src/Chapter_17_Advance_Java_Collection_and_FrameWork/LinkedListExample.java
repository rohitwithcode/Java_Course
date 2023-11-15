package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1=new LinkedList<>();
        LinkedList<Integer> linkedList2=new LinkedList<>();

        linkedList2.add(34);
        linkedList2.add(45);
        linkedList2.add(56);
        linkedList2.add(67);

        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(6);
        linkedList1.add(4);
        linkedList1.add(6);
        linkedList1.add(0,90);
        linkedList1.addLast(45);
        linkedList1.addFirst(456);
        linkedList1.set(2,345);
        linkedList1.add(0,5);

//        linkedList1.addAll(linkedList2);
        linkedList1.addAll(0,linkedList2);

//        linkedList1.clear();
        System.out.println(linkedList1.contains(68));
//        System.out.println(linkedList1.clone());
//        System.out.println(linkedList1.remove(6));
//        System.out.println(linkedList1.indexOf(67));
//        linkedList1.forEach(element-> System.out.println());
//        linkedList1.forEach(System.out::println);

        System.out.println(linkedList1.indexOf(6));
        System.out.println(linkedList1.lastIndexOf(6));
        System.out.println(linkedList1.equals(linkedList2));
        System.out.println(linkedList1.element()); // it gives first element of the list
        System.out.println("First element of the linked-list1 : "+linkedList1.getFirst());
        System.out.println("First element of the linked-list1 : "+linkedList1.getLast());

        linkedList1.offer(450); // Adds the specified element as the tail (last element) of this list.
        linkedList1.offerLast(4500); //Inserts the specified element at the end of this list.
        linkedList1.offerFirst(3000); //Inserts the specified element at the front of this list.

        for (int i:linkedList1){
            System.out.print(i+",");
        }
        System.out.println("");
        Integer peek = linkedList1.peek();//Retrieves, but does not remove, the head (first element) of this list.
        System.out.println("First element of the linked-list : "+peek);
        System.out.println("The First element of the linked-list : "+linkedList1.peekFirst()); //Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        System.out.println("The Last element of the linked-list : "+linkedList1.peekLast());

        System.out.println("The list below after the remove first element of the list : "+linkedList1.poll());
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }
        System.out.println("");
        System.out.println("The List of after the remove another time first element of the list : "+linkedList1.pollFirst());
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }
        System.out.println("");
        System.out.println("The List of after the remove  Last element of the list : "+linkedList1.pollLast());
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }

        System.out.println("");
        System.out.println("The List of after the remove first element of the list : "+linkedList1.remove()); //Retrieves and removes the head (first element) of this list.
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }
        System.out.println("");
        System.out.println("The List of after the remove specified element of the list : "+linkedList1.remove(2));
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }


        System.out.println("");
        System.out.println("The List of after the remove  first element from the list2 : "+linkedList1.remove(3)); //Removes the first occurrence of the specified element from this list, if it is present.
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }

        System.out.println("");
        System.out.println("The List of after the remove first element of the list : "+linkedList1.removeFirst());
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }

        System.out.println("");
        System.out.println("The List of after the remove First element of the list : "+linkedList1.removeFirstOccurrence(linkedList2));
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }

        System.out.println("");
        System.out.println("The List of after the remove Last element of the list : "+linkedList1.removeLast());
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }
        System.out.println("");
        System.out.println("The List of after the remove Last element of the list2 : "+linkedList1.removeLastOccurrence(linkedList2));
        for (int i=0;i<linkedList1.size();i++){
            System.out.print(linkedList1.get(i)+",");
        }
    }
}
