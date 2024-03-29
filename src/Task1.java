import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            //array[i] = scanner.nextInt();                // инициализация массива через консоль
            array[i] = (int)((Math.random() * 100) - 1);       // инициализация массива рандомными числами
        }
//        Task1
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }

        System.out.println(" ");

        for (int i = arrayLength - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
//        Task23
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] >= max) {
                maxIndex = i;
                max = array[i];
            }
            if (array[i] <= min) {
                minIndex = i;
                min = array[i];
            }
        }
        System.out.println("Max elem: " + max + " index of max elem: " + maxIndex);
        System.out.println("Min elem: " + min + " index of min elem: " + minIndex);

        //Task4
        int countZero = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == 0) {
                countZero++;
            }
        }
        if (countZero > 0){
            System.out.println("В массиве " + countZero + " нулевых элементов");
        } else {
            System.out.println("В массиве нет нулевых элементов");
        }

        //Task5

        int elem = 0;
        for (int i = 0; i < arrayLength / 2; i++) {
            elem = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = elem;
        }

    }
}
