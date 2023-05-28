package calculator;

/**
 * Класс Калькулятор косплексных чисел, имплементирует поведение из интерфейса
 * iCalculable
 */
public final class ComplexCalculator implements iCalculable {
    // приватное поле - начальное значение калькулятора - первый аргемент для
    // вычисления
    private ComplexNumber primaryArg;

    // конструктор класса, принимает параметром первый аргемент для вычисления
    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    // перегрузка метода сложения
    @Override
    public iCalculable sum(ComplexNumber arg) {
        primaryArg.realPart += arg.realPart;
        primaryArg.imaginaryPart += arg.imaginaryPart;
        return this;
    }

    // перегрузка метода умножения
    @Override
    public iCalculable multi(ComplexNumber arg) {
        ComplexNumber resultMultiply = new ComplexNumber(0, 0);
        resultMultiply.realPart = primaryArg.realPart * arg.realPart - primaryArg.imaginaryPart * arg.imaginaryPart;
        resultMultiply.imaginaryPart = primaryArg.realPart * arg.imaginaryPart
                + primaryArg.imaginaryPart * arg.realPart;
        primaryArg.realPart = resultMultiply.realPart;
        primaryArg.imaginaryPart = resultMultiply.imaginaryPart;
        return this;
    }

    // перегрузка метода деления
    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber resultMultiply = new ComplexNumber(0, 0);
        resultMultiply.realPart = (primaryArg.realPart * arg.realPart + primaryArg.imaginaryPart * arg.imaginaryPart)
                / (arg.realPart * arg.realPart + arg.imaginaryPart * arg.imaginaryPart);

        resultMultiply.imaginaryPart = (primaryArg.imaginaryPart * arg.realPart
                - primaryArg.realPart * arg.imaginaryPart)
                / (arg.realPart * arg.realPart + arg.imaginaryPart * arg.imaginaryPart);

        primaryArg.realPart = Math.round(resultMultiply.realPart * 100.0) / 100.0;
        primaryArg.imaginaryPart = Math.round(resultMultiply.imaginaryPart * 100.0) / 100.0;
        ;
        return this;
    }

    // перегрузка метода получения результата
    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }

}
