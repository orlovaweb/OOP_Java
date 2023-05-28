package calculator;
/**
 * Класс Комплексное число, два поля - действительная и мнимая часть
 */
public class ComplexNumber {
  public double realPart;
  public double imaginaryPart;
// конструктор класса, принимает два параметра - действительная и мнимая часть
  public ComplexNumber(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }
// перегрузка метода вывода комплексного числа
  @Override
  public String toString() {
    if (this.realPart == 0)
      return this.imaginaryPart + "i";
    if (this.imaginaryPart == 0)
      return this.realPart + "";
    if (this.imaginaryPart < 0)
      return this.realPart + "" + this.imaginaryPart + "i";
    return this.realPart + "+" + this.imaginaryPart + "i";
  }

}
