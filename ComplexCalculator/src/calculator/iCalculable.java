package calculator;

// Интерфейс, описывающий поведение калькулятора
public interface iCalculable {
    // метод сложения
    iCalculable sum(ComplexNumber arg);

    // метод умножения
    iCalculable multi(ComplexNumber arg);

    // метод деления
    iCalculable divide(ComplexNumber arg);

    // метод получения результата
    ComplexNumber getResult();
}
