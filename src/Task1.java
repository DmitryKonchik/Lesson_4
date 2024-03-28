import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            //array[i] = scanner.nextInt();                // инициализация массива через консоль
            array[i] = (int)(Math.random() * 100);       // инициализация массива рандомными числами
        }
    }
}
