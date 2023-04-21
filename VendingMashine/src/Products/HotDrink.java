package Products;

/*
 * Класс Горячие напитки дочерний от Продуктов
 */
public class HotDrink extends Product {

    private int volume;
    private int temperature;

    /*
     * Перегрузка конструктора
     * 
     * @param name название
     * 
     * @param price цена
     * 
     * @param volume объем напитка
     * 
     * @param tempetature температура напитка
     */
    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    /* Получение объема */
    public int getVolume() {
        return volume;
    }

    /* Получение температуры */
    public int getTemperature() {
        return temperature;
    }

    /* Установить объем */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /* Установить температуру */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }

}
