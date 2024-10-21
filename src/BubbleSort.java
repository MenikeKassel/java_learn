import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {123,23,34,2435,45,656,7,65};
        int temp;
        for (int i = 0; i < arr.length - 1 ; i++){
            for(int j = 1; j < arr.length - i ; j++){
                temp = arr[j-1];
                System.out.println("temp" + temp);
                if(temp > arr[j]){
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
                System.out.println(Arrays.toString(arr));

            }

       }

    }
}
