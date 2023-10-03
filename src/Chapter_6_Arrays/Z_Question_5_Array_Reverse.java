package Chapter_6_Arrays;

public class Z_Question_5_Array_Reverse {
    public static void main(String[] args) {

        int arr[]={4,5,6,3,42,4};

//        int n=Math.floorDiv(arr.length,2);

        int leghth=arr.length/2;
        int l=arr.length;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<leghth;i++){

            int temp;
            temp=arr[i];
            arr[i]=arr[l-1-i];;
            arr[l-1-i]=temp;
        }

        System.out.println("\nReverse array.....");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
