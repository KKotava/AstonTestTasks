import java.util.Scanner;

/**
 * Задача 1
 * Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
 * - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
 * "a > b", "a < b" или "a = b";
 * - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
 * Плюсом будет возможность для пользователя в решении первой и второй задач ввести данные самостоятельно через консоль
 */
public class NumbersComparing {

  public static void main(String[] args) {
    int temp;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите целое число a");
    int a = scanner.nextInt();
    System.out.println("Введите целое число b");
    int b = scanner.nextInt();
    scanner.close();
    if (a > b) {
      System.out.println("a > b");
    } else if (a < b) {
      System.out.println("a < b");
    } else {
      System.out.println("a = b");
    }
    temp = a + b;
    System.out.println("a + b = " + temp);
    temp = a - b;
    System.out.println("a - b = " + temp);
    if (a != b) {
      temp = b - a;
      System.out.println("b - a = " + temp);
    }
    temp = a * b;
    System.out.println("a * b = " + temp);
    if (b != 0) {
      temp = a / b;
      System.out.println("a / b = " + temp);
    }
    if (a != 0) {
      temp = b / a;
      System.out.println("b / a = " + temp);
    }
  }
}
