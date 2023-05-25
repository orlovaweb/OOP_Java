/**
 * Класс Круг имплементирует только поведение из интерфейса для вычисления площади 
 */
public class Circle implements iArea {
  // приватное поле радиус
  private double radius;
  // конструктор класса
  public Circle(double radius) {
    this.radius = radius;
  }
  // перегрузка метода нахождения площади
  @Override
  public double area() {
    return 2 * 3.14 * radius;
  }
}