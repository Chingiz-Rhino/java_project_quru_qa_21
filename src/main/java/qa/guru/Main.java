package qa.guru;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных
        boolean varBoolean = true;

        byte varByte = 0; // -128 ... 127
        short varShort = 0; // -32768 ... 32767
        int varInt = 0; // -2147483648 ... 2147483647
        long varLong = 0; // -9223372036854775808 ... 9223372036854775807
        char varChar = 'a'; //

        float varFloat = 0.0F; //
        double varDouble = 0.0; //

        //ДЗ
        //0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        //https://javarush.com/groups/posts/2136-ustroystvo-vejshestvennihkh-chisel
        //1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
       // 2) попробовать вычисления комбинаций типов данных (int и double)

        // Проверка перегрузки
        byte a = -128;
        a -= 2;
        System.out.println("Перегрузка byte: " + a);
        short b = -32768;
        b += 5;
        System.out.println("Перегрузка short: " + b);
        int c = 123456;
        c -= 10;
        System.out.println("Перегрузка int: " + c);
        long d = 1234455768;
        d -= 15;
        System.out.println("Перегрузка long: " + d);
        char e = 'a';
        e +=1244;
        System.out.println("Перегрузка char: " + e);

        // Математические операции
        int plus = 30;
        int mathPlus = plus + 20;
        System.out.println("Математическая операция 'Плюс': " + mathPlus );
        int minus = 30;
        int mathMinus = minus - 20;
        System.out.println("Математическая операция 'Минус': " + mathMinus );
        int multiplication = 10;
        int mathMultiplication = multiplication * 10;
        System.out.println("Математическая операция 'Умножение': " + mathMultiplication );
        int division = 30;
        int mathDivision = division / 6;
        System.out.println("Математическая операция 'Деление': " + mathDivision );
        int remainder = 30;
        int mathRemainder = remainder % 7;
        System.out.println("Математическая операция 'Остаток от деления': " + mathRemainder );

        // Инкремент и декремент
        int increment = 10;
        int decrement = 11;
        increment--;
        decrement++;
        System.out.println("Инкремент: " + increment);
        System.out.println("Декремент: " + decrement);

       // Логические операции
        int first = 5;
        int second = 10;

        System.out.println("first == second: " + (first == second));
        System.out.println("first > second: " + (first > second));
        System.out.println("first < second: " + (first < second));
        System.out.println("first != second: " + (first != second));
        System.out.println("first >= second: " + (first >= second));
        System.out.println("first <= second: " + (first <= second));

        // Проверка комбинаций типов данных int и double
        int checkInt = 20;
        double checkDouble = 2.5;
        System.out.println("Проверка сложения int и double: " + (checkInt+checkDouble));
        System.out.println("Проверка вычитания int и double: " + (checkInt-checkDouble));
        System.out.println("Проверка умножения int и double: " + (checkInt*checkDouble));
        System.out.println("Проверка деления int и double: " + (checkInt/checkDouble));
        System.out.println("Проверка остатка int и double: " + (checkInt%checkDouble));


    }
}