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
            } else {
                System.out.println("данных не столько сколько нужно");
            }
        }

    }
}
