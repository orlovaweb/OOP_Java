package calculator;
// Класс Вывод Логов в консоль, имплементирует поведение из iLoggable
public class ConsoleLogger implements iLoggable {
// перегрузка метода вывода Логов в консоль
    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}
