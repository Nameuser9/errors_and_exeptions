import java.util.Scanner;
import java.io.FileNotFoundException;
public class main {
    public static void main (String args[]) {

        }


public static float numberExeption(){
    Scanner scanner = new Scanner(System.in);
    while (true) {
        try {
            System.out.println("введите число");
            String input = scanner.nextLine();
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("введено не число");
        }
        scanner.close();
    }
}
public class Task2{
    public static void main(String[] args) throws Exception {

        try {
        int[] intArray = new int[10];
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        }
    }


    public class Task03 {

        public static void main(String[] args) throws Exception {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }
        }

        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
            System.out.println(a + b);
        }

    }}}





