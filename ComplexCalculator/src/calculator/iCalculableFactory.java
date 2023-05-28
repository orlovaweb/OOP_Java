package calculator;
// Интерфейс, описывающий поведение Фабрики калькуляторов
public interface iCalculableFactory {
    iCalculable create(ComplexNumber primaryArg);
}
