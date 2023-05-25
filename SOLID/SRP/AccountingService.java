/*
 * Класс бухгалтерии
 */
public class AccountingService{
  // налоговая ставка для расчета зп
  private double tax_rate;
// конструктор класса
  public AccountingService(double tax_rate) {
    this.tax_rate = tax_rate;
  }
  // метод вычисления чистой зп работника, принимает параметром ставку сотрудника
  public int calculateNetSalary(int baseSalary) {
    int tax = (int) (baseSalary * 0.25);
    return baseSalary - tax;
  }
}