import java.util.Scanner;

public class HardTask {
    public static void main(String[] args) {
        // Если массив [9, 9, 9]  мы не можеем сделать задание в этом же массиве,
        // необходимо создавать новый массив с большим числом эленментов
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
//        int[] array = {9, 9, 9, 5};


        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * 11) - 1);
            System.out.print(array[i] + " ");
        }

        int arrayIsFull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 9){
                arrayIsFull++;
            }
        }

        int[] newArray;
        // Проверяем или исходный массив вместит новое число
        if (arrayIsFull == array.length) {
            newArray = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
        }
        else {
            newArray = array;
        }

        newArray[newArray.length - 1] = newArray[newArray.length - 1] + 1;

        for (int i = newArray.length - 1; i > 0; i--) {
            if (newArray[i] == 10) {
                newArray[i] = 0;
                newArray[i - 1] = newArray[i - 1] + 1;
            }
        }
        System.out.println(" ");
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }
}
