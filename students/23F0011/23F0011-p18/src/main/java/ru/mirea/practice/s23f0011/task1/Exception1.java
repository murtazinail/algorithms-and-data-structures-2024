package ru.mirea.practice.s23f0011.task1;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }
}

/*
- Это означает, что в строке 5 файла Exception1.java произошло деление на ноль, что привело к исключению ArithmeticException.

Объяснение:
- В Java исключения - это события, которые прерывают нормальное выполнение программы.
- Когда происходит исключение, Java ищет соответствующий обработчик (блок catch).
- Если обработчик не найден, программа прекращает работу с сообщением об ошибке.
 */