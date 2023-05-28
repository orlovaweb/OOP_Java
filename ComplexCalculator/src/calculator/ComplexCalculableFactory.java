package calculator;

/**
 * Класс Фабрика Калькуляторов комплексных чисел, имплементирует поведение из
 * iCalculableFactory
 */
public class ComplexCalculableFactory implements iCalculableFactory {
    // перегрузка метода создания калькулятора
    @Override
    public iCalculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}
