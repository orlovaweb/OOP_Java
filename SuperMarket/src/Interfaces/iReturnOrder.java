package Interfaces;

import Classes.Actor;

/**
 * Интерфейс возврата заказа посетителем
 */
public interface iReturnOrder {
  /* посетитель сделал заявку на возврат */
  void setMakeReturnOrder(boolean makeReturnOrder);

  /* забрал деньги */
  void setTakeCash(boolean takeCash);

  /* сделал ли заявку */
  boolean isMakeReturnOrder();

  /* забрал ли деньги */
  boolean isTakeCash();

  /* возврат самого посетителя */
  Actor getActor();
}
