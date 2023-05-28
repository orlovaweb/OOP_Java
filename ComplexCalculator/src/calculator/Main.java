package calculator;

// Основной класс Main, точка входа в программу
public class Main {
    public static void main(String[] args) {
        // создаем фабрику калькуляторов
        iCalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        // создаем экземпляр Вывод калькулятора, передавая параметром фабику
        // калькуляторов
        ViewCalculator view = new ViewCalculator(calculableFactory);
        System.out.println("======================================================================");
        System.out.println("                    Калькулятор комплексных чисел");
        System.out.println("======================================================================");
        view.run();
    }
}
