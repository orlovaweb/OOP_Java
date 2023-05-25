/**
 * Создаем работника
 * 
 */
public class Employee {
  // поле имя
  private String name;
  // поле дата рождения
  private Date dob;
  // поле зарплатная ставка
  private int baseSalary;
  // бухгалтерия
  private AccountingService accountingService;

  // конструктор класса
  public Employee(String name, Date dob, int baseSalary, AccountingService accountingService) {
    this.name = name;
    this.dob = dob;
    this.baseSalary = baseSalary;
    this.accountingService = accountingService;
  }
  // вывод данных о сотруднике
  public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
  }
  //вывод зп "на руки"
  public String getNetSalary() {
    return accountingService.calculateNetSalary(this.baseSalary);
  }
}