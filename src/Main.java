public class Main {
    static Employee[] employees = new Employee[10];

    public static double getSum() {
        double sum = 0;
        for (Employee value : employees) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    public static void getMaxPay() {
        String expensiveEmployee = "";
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                expensiveEmployee = employee.getFio();
            }
        }
        System.out.println("Сотрудник с самой высокой зарплатой - " + expensiveEmployee);
    }

    public static void getMinPay() {
        String cheapEmployee = " ";
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                cheapEmployee = employee.getFio();
            }
        }
        System.out.println("Сотрудник с самой низкой зарплатой - " + cheapEmployee);
    }

    public static double averageSalary() {
        return Math.ceil(getSum() / employees.length);
    }

    public static void main(String[] args) {


        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, Math.ceil(Math.random() * 100000));
        employees[1] = new Employee("Sidorov Ivan Petrovich", 2, Math.ceil(Math.random() * 100000));
        employees[2] = new Employee("Petrov Ivan Andreevich", 5, Math.ceil(Math.random() * 100000));
        employees[3] = new Employee("Miheev Oleg Bogdanovich", 3, Math.ceil(Math.random() * 100000));
        employees[4] = new Employee("Eliseev Kassian Igorevich", 4, Math.ceil(Math.random() * 100000));
        employees[5] = new Employee("Ustinov Modest Maksimovich", 5, Math.ceil(Math.random() * 100000));
        employees[6] = new Employee("Efimov Vol'demar Damirovich", 1, Math.ceil(Math.random() * 100000));
        employees[7] = new Employee("Sharapov Ermak Valer'yanovich", 2, Math.ceil(Math.random() * 100000));
        employees[8] = new Employee("Orlov Ivan Pavlovich", 3, Math.ceil(Math.random() * 100000));
        employees[9] = new Employee("Kovalyov Dem'yan Melsovich", 4, Math.ceil(Math.random() * 100000));


        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты сотрудников в месяц составила - " + getSum());
        System.out.println("Средний размер оплаты труда сотрудников соствляет - " + averageSalary());
        System.out.println();

        for (Employee e : employees) {
            System.out.println(e.getFio());
        }
        System.out.println();

        getMaxPay();
        getMinPay();

    }
}






