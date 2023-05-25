  // Класс Фигура
  public class Shape {
    // ширина
    protected int width;
    // длина
    protected int height;
    // установить ширину
    public void setWidth(int width) {
      this.width = width;
    }
    // установить длину
    public void setHeight(int height) {
      this.height = height;
    }
    // высчитать площадь
    public int area() {
        return this.width * this.height;
    }
}



