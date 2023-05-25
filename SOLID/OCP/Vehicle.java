/*
 * Класс транспортное средство
 */
public class Vehicle {
  // характеристики максимальная скорость и тип 
  int maxSpeed;
  String type;
  double ratio;
// конструктор класса, принимает параметры значения характеристик
  public Vehicle(int maxSpeed, String type, double ratio) {
  this.maxSpeed = maxSpeed;
  this.type = type;
  this.ratio = ratio;
  }
  //получение макс. скорости
  public int getMaxSpeed() {
    return this.maxSpeed;
  }
  // получение типа транспортного средства
  public String getType() {
    return this.type;
  }
  //получение допустимой скорости
  public double getAllowedSpeed(){
    return this.maxSpeed * this.ratio;
  }

}