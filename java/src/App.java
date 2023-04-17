import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(arrayOfMultiples(7,5)));
        System.out.println(Arrays.toString(arrayOfMultiples(12,10)));
        System.out.println(Arrays.toString(arrayOfMultiples(17,6)));
    }
  
    public static int[] arrayOfMultiples(int num, int length){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = num * (i + 1);
        }
        return arr;
    }
}
