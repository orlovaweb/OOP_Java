package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения посетителя
 */
public interface iActorBehaviour {
    /* посетитель сделал заказ */
    void setMakeOrder(boolean makeOrder);

    /* забрал заказ */
    void setTakeOrder(boolean pickUpOrder);

    /* сделал ли заказ */
    boolean isMakeOrder();

    /* забрал ли заказ */
    boolean isTakeOrder();

    /* возврат самого посетителя */
    Actor getActor();
}
