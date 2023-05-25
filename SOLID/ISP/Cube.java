/**
 * Класс куб имплементирует поведение из интерфейсов для вычисления площади и объема
 */
public class Cube implements iArea,iVolume {
  // приватное поле сторона
  private int edge;
  // конструктор класса
  public Cube(int edge) {
    this.edge = edge;
  }
  // перегрузка метода нахождения площади
  @Override
  public double area() {
    return 6 * edge * edge;
  }
  // перегрузка метода нахождения объема
  @Override
  public double volume() {
    return edge * edge * edge;
  }
}
