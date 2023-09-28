class Fibonacci {
    // Клас для обчислення чисел Фібоначчі та перевірки рівності

    // Метод для обчислення числа Фібоначчі за індексом
    public static int FibonacciNum(int index) {
        // Перевіряємо, чи індекс не менший або рівний 0
        if (index <= 0) {
            return 0; // Якщо так, повертаємо 0
        } else if (index == 1) {
            return 1; // Якщо індекс рівний 1, повертаємо 1
        } else {
            int prev = 0; // Ініціалізуємо попереднє число Фібоначчі
            int curr = 1; // Ініціалізуємо поточне число Фібоначчі
            int result = 0; // Ініціалізуємо змінну для збереження результату

            // Обчислюємо числа Фібоначчі для вказаного індексу
            for (int i = 2; i <= index; i++) {
                result = prev + curr; // Обчислюємо наступне число Фібоначчі
                prev = curr; // Оновлюємо попереднє число
                curr = result; // Оновлюємо поточне число
            }
            return result; // Повертаємо обчислений результат
        }
    }

    // Метод для перевірки рівності
    public static boolean checkExample(int m, int n, int k) {
        // Обчислюємо значення на лівій стороні рівності
        int left = FibonacciNum(m) * FibonacciNum(n + k) - FibonacciNum(k) * FibonacciNum(n + m);

        // Обчислюємо значення на правій стороні рівності
        int right = (int) Math.pow(-1, k) * FibonacciNum(m - k) * FibonacciNum(n);

        // Порівнюємо ліву та праву сторони рівності та повертаємо результат порівняння
        return left == right;
    }
}