public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[3];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 10000);
        employees[1] = new Employee("Sidorov Ivan Petrovich", 2, 12000);
        employees[2] = new Employee("Petrov Ivan Andreevich", 5, 22000);

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        System.out.println(Employee.getSum(employees));
        System.out.println(Employee.averageSalary(employees));




        }
    }




