package Classes;

/**
 * Класс покупателя по акции дочерний от Покупатель
 */
public class SelloutClient extends Actor {
  /* название акции */
  public String nameOfSellout;
  /* порядковый номер участника в акции */
  private static Integer count;

  static {
    count = 0;
  }

  /**
   * перегрузка конструктора
   * 
   * @param name          имя клиента
   * @param nameOfSellout название акции
   */
  public SelloutClient(String name, String nameOfSellout) {
    super(name);
    this.nameOfSellout = nameOfSellout;
    count++;
  }

  /* переопределение получения имени клиента */
  @Override
  public String getName() {
    return super.name;
  }

  /* получение порядкового номера клиента в акции */
  public int getCount() {
    return count;
  }

  /* переопределение метода сделал ли заказ клиент */
  @Override
  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  /* переопределение метода забрал ли заказ клиент */
  @Override
  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  /* переопределение метода сделать заказ */
  @Override
  public void setMakeOrder(boolean makeOrder) {
    super.isMakeOrder = makeOrder;
  }

  /* переопределение метода забрать заказ */
  @Override
  public void setTakeOrder(boolean pickUpOrder) {
    super.isTakeOrder = pickUpOrder;
  }

  /* переопределение метода получить клиента */
  @Override
  public Actor getActor() {
    return this;
  }

  /* переопределение метода сделал ли заявку */
  @Override
  public boolean isMakeReturnOrder() {
    return super.isMakeReturnOrder;
  }

  /* переопределение метода забрал ли деньги */
  @Override
  public boolean isTakeCash() {
    return super.isTakeCash;
  }

  /* переопределение метода сделал заявку на возврат */
  @Override
  public void setMakeReturnOrder(boolean makeReturnOrder) {
    super.isMakeReturnOrder = makeReturnOrder;
  }

  /* переопределение метода забрать деньги */
  @Override
  public void setTakeCash(boolean takeCash) {
    super.isTakeCash = takeCash;
  }
}
