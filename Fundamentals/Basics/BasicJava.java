import java.util.ArrayList;

public class BasicJava {

    public static void print255(){
        for(int i = 1; i <= 255; i++)
            System.out.println(i);
    }
    public static void printOdd255(){
        for(int i = 1; i <= 255; i++)
        if(i % 2 != 0)
            System.out.println(i);
    }
    public static int sigma255(){
        int sum = 0;
        for(int i = 1; i <= 255; i++)
            sum += i;
            return(sum);
    }
    public static void iterateArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void findMax(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length;i++)
        if (arr[i]> max)
            max = arr[i];
        System.out.println(max);
    }

    public static void odds(){
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        for (int i = 0; i <= 255; i++){
            if(i % 2 != 0)
                arr.add(i);
        }
        System.out.println(arr);
    }
}