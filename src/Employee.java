public class Employee {

    //Поля
    private final String fio;
    private int department;
    private int salary;
    private final int id;
    private static int counter = 1;

    //Конструктор
    public Employee(String fio, int department, int salary) {

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

    public int getSalary() {
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

    public static int getSum(Employee[] employees) {
        int sum = 0;
        for (Employee value : employees) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    public static double averageSalary(Employee[] employees){
        return Math.ceil((double) getSum(employees)/employees.length);
    }

    @Override
    public String toString() {
        return "| " + getId() + "| " + getFio() + "| " + getDepartment() + "| " + getSalary() + "|";
    }
}