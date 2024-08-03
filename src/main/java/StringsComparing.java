import java.util.Scanner;

/**
 * Задача 2
 * Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
 * В результате сравнения в консоль должно быть выведено одно из сообщений:
 * "Строки неидентичны" или "Строки идентичны"
 * Плюсом будет возможность для пользователя в решении первой и второй задач ввести данные самостоятельно через консоль.
 */
public class StringsComparing {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку a");
    String a = scanner.nextLine();
    System.out.println("Введите строку b");
    String b = scanner.nextLine();
    scanner.close();
    if (a.equals(b)) {
      System.out.println("Строки идентичны");
    } else {
      System.out.println("Строки неидентичны");
    }
  }

}
