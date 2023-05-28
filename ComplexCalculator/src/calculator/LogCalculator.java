package calculator;

// Класс Калькулятор, усовершенствованный добавлением Логирования, имплементирует поведение из iCalculable
public class LogCalculator implements iCalculable {
    // приватные поля Декоратор - тип Калькулятор, и Логгер
    private iCalculable decorated;
    private iLoggable logger;

    // конструктор класса, принимает параметры - актуальный калькулятор и класс для
    // Логгирования
    public LogCalculator(iCalculable decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    // перегрузка метода сложения
    @Override
    public iCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + " Начало вызова метода sum с параметром " + arg);
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    // перегрузка метода умножения
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + " Начало вызова метода multi с параметром " + arg);
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    // перегрузка метода деления
    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора " + firstArg + " Начало вызова метода divide с параметром " + arg);
        iCalculable result = decorated.divide(arg);
        logger.log(String.format("Вызова метода divide произошел"));
        return result;
    }

    // перегрузка метода вывода
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log("Получение результата = " + result);
        return result;
    }
}
