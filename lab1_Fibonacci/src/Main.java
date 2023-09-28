import java.util.Scanner; // Імпорт бібліотеки Scanner для зчитування введених даних з консолі.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створення об'єкту Scanner для зчитування введених користувачем даних з консолі.

        System.out.print("Введіть значення m: "); // Виведення повідомлення для користувача.
        int m = scanner.nextInt(); // Зчитування цілого числа з консолі та збереження його в змінну m.

        System.out.print("Введіть значення n: "); // Виведення повідомлення для користувача.
        int n = scanner.nextInt(); // Зчитування цілого числа з консолі та збереження його в змінну n.

        System.out.print("Введіть значення k: "); // Виведення повідомлення для користувача.
        int k = scanner.nextInt(); // Зчитування цілого числа з консолі та збереження його в змінну k.

        boolean result = Fibonacci.checkExample(m, n, k); // Виклик методу checkExample класу Fibonacci з передачею введених значень m, n, та k.

        if (result) {
            System.out.println("Рівність справджується."); // Виведення результату на консоль у разі true.
        } else {
            System.out.println("Рівність не справджується."); // Виведення результату на консоль у разі false.
        }
    }
}
