// Класс автомобиль
public class Car {
  private iEngine engine;
  // конструктор класса
  public Car(iEngine engine) {
    this.engine = engine;
  }
  // Метод Автомобиль завелся, в котором запускаем двигатель
  public void start() {
    this.engine.start();
  }
}


