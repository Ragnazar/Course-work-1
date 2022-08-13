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

    @Override
    public String toString() {
        return "| " + getId() + "| " + getFio() + "| " + getDepartment() + "| " + getSalary() + "|";
    }
}