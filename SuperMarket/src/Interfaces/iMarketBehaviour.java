package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Поведение магазина
 */
public interface iMarketBehaviour {
    /* клиент пришел в магазин */
    void acceptToMarket(iActorBehaviour actor);

    /* клиент ушел из магазина */
    void releaseFromMarket(List<Actor> actors);

    /* обновить */
    void update();
}
