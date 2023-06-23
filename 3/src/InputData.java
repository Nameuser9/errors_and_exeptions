import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println(" запрашиваю у пользователя следующие данные, разделенные пробелом:\n" +
                    "Фамилия Имя Отчество датарождения номертелефона пол");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } if (arrayData.length < 6) {
                System.out.println("данных мало");
            }
            else{
                System.out.println("данных много");
            }
        }

    }
}
