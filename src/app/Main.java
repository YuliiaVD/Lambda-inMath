package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    static MathOperation mathOperation;
    static StringManipulator stringManipulator;
    static int a;
    static int b;
    static int res;
    static String data;
    static String res2;
    static int res3;
    static int res4;


    public static void main(String[] args) {
        //через анонімний клас створюємо об'єкт інтерфейсу MathOperation, який виконує операцію додавання
        a = 10;
        b = 20;
        mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        res = mathOperation.operate(a, b);
        System.out.println("1) The result is " + res);

        //через лямбда-вираз, реалізуємо функціональний інтерфейс StringManipulator
        data = "Lambda in Math";
        stringManipulator = data -> "2) Result is " + data.toUpperCase();
        res2 = stringManipulator.dataHandler(data);
        System.out.println(res2);

        //Використання посалання на метод, щоб передати метод countUppercase
        //як аргумент функції Function<String, Integer>
        Function<String, Integer>  countUpperCharacter = StringListProcessor::countUppercase;
        res3 = countUpperCharacter.apply(data);
        System.out.println("3) Result is " + res3);

        //Використовуємо інтерфейс Supplier<T>, для рандомного генерування числа
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1,100);
        res4 = randomSupplier.get();
        System.out.println("4) Result is; " + res4);


    }

}
