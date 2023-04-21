package Classes;

/**
 * Класс покупателя особенного дочерний от Покупатель
 */
public class SpecialClient extends Actor {
    /* инкапсулированный номер клиента */
    private int idVIP;

    /**
     * перегрузка конструктора
     * 
     * @param name  имя клиента
     * @param idVIP идентификационный номер клиента
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    /* переопределение получения имени клиента */
    @Override
    public String getName() {
        return super.name;
    }

    /* получения идентификационного номера клиента */
    public int getIdVIP() {
        return idVIP;
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