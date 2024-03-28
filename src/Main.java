import java.util.Arrays;


//Задача которую делалали на заятии (готовая)
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 6, 7, 5};
        int n = 8;
        Arrays.sort(arr);
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                num = arr[i] - 1;
                break;
            }
        }

        if (arr[arr.length - 1] != n) {
            num = n;
        }

        System.out.println(num);
    }
}