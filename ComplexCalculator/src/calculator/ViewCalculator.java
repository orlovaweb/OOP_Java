package calculator;

import java.util.Scanner;

// Класс вывода Калькулятора комплексных чисел
public class ViewCalculator {
    // приватное поле Фабрика производства калькуляторов
    private iCalculableFactory calculableFactory;

    // конструктор класса, принимает параметром фабрику калькуляторов
    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    // метод запуска работы калькулятора
    public void run() {
        while (true) {
            // получаем первый аргумент для вычислений
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент: ");
            // С помощью фабрики калькуляторов создаем Калькулятор
            iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                // Выбираем действие
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                // Если выбрали *
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                // Если выбрали +
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                // Если выбрали /
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    calculator.divide(arg);
                    continue;
                }
                // Если выбрали =
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат: ");
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            System.out.println("======================================================================");
            System.out.println("                            До свидания!");
            System.out.println("======================================================================");
            break;
        }

    }

    // Метод вывода сообщения и получения ответа от пользователя
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    // Метод вывода сообщения и получения комплексного числа
    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        System.out.println("\nВведите действительную часть: ");
        double real = Float.parseFloat(in.nextLine());
        System.out.println("Введите мнимую часть: ");
        double imaginary = Float.parseFloat(in.nextLine());
        return new ComplexNumber(real, imaginary);
    }
}
