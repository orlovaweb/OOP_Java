//класс Квадрат наследник от класса Фигура
public class Square extends Shape {
  // контруктор класса
  public Square(int sideLength) {
      setWidth(sideLength);
      setHeight(sideLength);
  }
}
