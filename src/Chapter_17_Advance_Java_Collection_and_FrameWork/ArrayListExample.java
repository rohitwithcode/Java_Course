package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>(5);

        arrayList2.add(34);
        arrayList2.add(45);
        arrayList2.add(56);
        arrayList2.add(67);

        arraylist1.add(3);
        arraylist1.add(4);
        arraylist1.add(5);
        arraylist1.add(6);
        arraylist1.add(4);
        arraylist1.add(6);
        arraylist1.add(0,5);
        arraylist1.add(0,90);

//        arraylist1.addAll(arrayList2);
        arraylist1.addAll(0,arrayList2);

//        arraylist1.clear();

//        System.out.println(arraylist1.contains(68));
//        System.out.println(arraylist1.clone());

//        System.out.println(arraylist1.indexOf(67));
        System.out.println(arraylist1.indexOf(6));
        System.out.println(arraylist1.lastIndexOf(6));
        System.out.println(arraylist1.remove(6));
        arraylist1.set(2,345);

//        arrayList2.ensureCapacity(10);

        System.out.println(arraylist1.equals(arrayList2));
//        arraylist1.forEach(element-> System.out.println());
//        arraylist1.forEach(System.out::println);

        for (int i=0;i<arraylist1.size();i++){
            System.out.print(arraylist1.get(i)+",");
        }

//        for (int i:arraylist1){
//            System.out.println(i);
//        }
    }
}
