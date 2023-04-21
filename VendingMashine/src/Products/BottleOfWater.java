package Products;

/*
 * Класс Бутылка воды дочерний от Продуктов
 */
public class BottleOfWater extends Product {

    private int volume;

    /*
     * Перегрузка конструктора
     * 
     * @param name название
     * 
     * @param price цена
     * 
     * @param volume объем бутылки
     */
    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    /* Получение объема */
    public int getVolume() {
        return volume;
    }

    /* Установить объем */
    public void setVolume(int volume) {
        this.volume = volume;
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
                '}';
    }

}
