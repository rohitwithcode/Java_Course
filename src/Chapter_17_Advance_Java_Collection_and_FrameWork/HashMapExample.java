package Chapter_17_Advance_Java_Collection_and_FrameWork;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        HashMap<Integer,Integer> hashMap1=new HashMap<>(10);

        hashMap.put(1,23);
        hashMap.put(2,45);
        hashMap.put(3,46);
        hashMap.put(4,67);

        System.out.println(hashMap);

//        hashMap.clear();
//        System.out.println(hashMap);

//        hashMap.clone();
//        System.out.println(hashMap);

        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.containsValue(45));
    }
}
