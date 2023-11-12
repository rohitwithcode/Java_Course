package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        HashSet<Integer> hashSet1=new HashSet<>(6,0.6f);
        HashSet<Integer> hashSet2=new HashSet<>(10);
        HashSet<Integer> hashSet3=new HashSet<>(hashSet2);

        hashSet.add(1);
        hashSet.add(26);
        hashSet.add(23);
        hashSet.add(42);
        hashSet.add(58);
        System.out.println(hashSet);

//        hashSet.clear();
//        System.out.println(hashSet);

//        hashSet.clone();
//        System.out.println(hashSet);

        System.out.println(hashSet.contains(4));
        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet.remove(1));
        System.out.println(hashSet);

        int s=hashSet.size();
        System.out.println("The size of the hashSet : "+s);




    }
}
