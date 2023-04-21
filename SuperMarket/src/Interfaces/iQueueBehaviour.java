package Interfaces;

/**
 * Интерфейс поведение очереди
 */
public interface iQueueBehaviour {
  /* попасть в очередь */
  void takeInQueue(iActorBehaviour actor);

  /* убрать из очереди */
  void releaseFromQueue();

  /* сделать заказ */
  void takeOrder();

  /* забрать заказ */
  void giveOrder();
}
