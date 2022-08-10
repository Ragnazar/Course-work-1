public class Employee {

    //Поля
    private final String fio;
    private int department;
    private double salary;
    private final int id;
    private static int counter = 1;

    //Конструктор
    public Employee(String fio, int department, double salary) {

        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    //Геттеры
    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    //Сеттеры

    public void setDepartment(int dept) {
        department = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static double getSum(Employee[] employees) {
        double sum = 0;
        for (Employee value : employees) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    public static void getMaxPay(Employee[] employees) {

        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }

        }
        for (Employee employee : employees) {
            if (maxSalary == employee.getSalary()) {
                System.out.println("Сотрудник с самой высокой зарплатой - " + employee.getFio());
            }
        }
    }

    public static void getMinPay(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }

        }
        for (Employee employee : employees) {
            if (minSalary == employee.getSalary()) {
                System.out.println("Сотрудник с самой низкой зарплатой - " + employee.getFio());
            }
        }
    }

    public static double averageSalary(Employee[] employees) {
        return Math.ceil(getSum(employees) / employees.length);
    }

    @Override
    public String toString() {
        return "| " + getId() + "| " + getFio() + "| " + getDepartment() + "| " + getSalary() + "|";
    }
}