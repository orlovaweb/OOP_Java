package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс Покупатель имплементирует интерфейс поведения посетителя,
 * возврата посетителя
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /* имя покупателя */
    protected String name;
    /* забрал ли заказ покупатель */
    protected boolean isTakeOrder;
    /* сделал ли заказ покупатель */
    protected boolean isMakeOrder;
    /* забрал ли деньги покупатель */
    protected boolean isTakeCash;
    /* сделал ли заказ возврата */
    protected boolean isMakeReturnOrder;

    /* Перегрузка конструктора */
    public Actor(String name) {
        this.name = name;
    }

    /* объявление метода получения имени покупателя */
    public abstract String getName();

}
