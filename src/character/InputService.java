package character;

import java.util.Scanner;

public class InputService {

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подходящее число: ");
        Integer result = null;
        while (result == null) {
            try {
                result = scanner.nextInt();
            } catch (NumberFormatException nfe) {
                System.out.println("Ошибка! Введите число:");
            }
        }
        return result;
    }

    public static String inputNickname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя Героя: ");
        String name = null;
        while (name == null) {
            try {
                name = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Введите имя Героя: ");
            }
        }
        return name;
    }
}
