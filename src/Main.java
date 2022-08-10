public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {

        employees = new Employee[10];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, Math.ceil(Math.random()*100000));
        employees[1] = new Employee("Sidorov Ivan Petrovich", 2, Math.ceil(Math.random()*100000));
        employees[2] = new Employee("Petrov Ivan Andreevich", 5, Math.ceil(Math.random()*100000));
        employees[3] = new Employee("Miheev Oleg Bogdanovich", 3, Math.ceil(Math.random()*100000));
        employees[4] = new Employee("Eliseev Kassian Igorevich", 4, Math.ceil(Math.random()*100000));
        employees[5] = new Employee("Ustinov Modest Maksimovich", 5, Math.ceil(Math.random()*100000));
        employees[6] = new Employee("Efimov Vol'demar Damirovich", 1, Math.ceil(Math.random()*100000));
        employees[7] = new Employee("Sharapov Ermak Valer'yanovich", 2, Math.ceil(Math.random()*100000));
        employees[8] = new Employee("Orlov Ivan Pavlovich", 3, Math.ceil(Math.random()*100000));
        employees[9] = new Employee("Kovalyov Dem'yan Melsovich", 4, Math.ceil(Math.random()*100000));


        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты сотрудников в месяц составила - " + Employee.getSum(employees));
        System.out.println("Средний размер оплаты труда сотрудников соствляет - " + Employee.averageSalary(employees));
        System.out.println();

        for (Employee e : employees) {
            System.out.println(e.getFio());
        }
        System.out.println();

        Employee.getMaxPay(employees);
        Employee.getMinPay(employees);

    }
}






