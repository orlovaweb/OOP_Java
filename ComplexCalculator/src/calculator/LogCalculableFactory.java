package calculator;

// Класс Фабрика создания куляторов, усовершенствованных  Логированием 
public class LogCalculableFactory implements iCalculableFactory {
    // приватное поле - Логер
    private iLoggable logger;

    // конструктор класса
    public LogCalculableFactory(iLoggable logger) {
        this.logger = logger;
    }

    // перегрузка метода создания калькулятора
    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logger);
    }
}
