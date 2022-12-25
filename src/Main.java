import java.util.Arrays;

public class Main {
    static final int N = 10;

    public static void main(String[] args) {
        System.out.println("Курсовая работа");
        Employee[] employees = new Employee[N];
        employees[0] = new Employee("Иванов ", "Иван ", "Иванович ", 1, 44000);
        employees[1] = new Employee("Кобец ", "Сергей ", "Игоревич ", 2, 33000);
        employees[2] = new Employee("Лавров ", "Михаил ", "Александрович ", 3, 47000);
        employees[3] = new Employee("Дудун ", "Олег ", "Андреевич ", 4, 33000);
        employees[4] = new Employee("Макрин ", "Максим ", "Борисович ", 5, 65000);
        employees[5] = new Employee("Медведев ", "Юрий ", "Михайлович ", 1, 62000);
        employees[6] = new Employee("Силуянов ", "Константин ", "Игоревич ", 2, 95000);
        employees[7] = new Employee("Лаврентьев ", "Михаил ", "Федорович ", 3, 73000);
        employees[8] = new Employee("Старшинов ", "Алексей ", "Евгеньевич ", 4, 43000);
        employees[9] = new Employee("Грачев ", "Станислав ", "Александрович ", 5, 45000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println((employees[i]));

        }


        for (int i = 0; i < employees.length; i++) {
            Employee.sumSalary(employees[i].getSalary());

        }


        System.out.println();

        System.out.println("Сумму затрат на зарплаты " + Employee.sum);
        System.out.println("Подсчитали среднее значение зарплат: " + Employee.averageSalary(Employee.sum));


    }


    public static void printInfo(Employee surname, Employee name, Employee middleName, Employee department, Employee salary, Employee id) {
        System.out.println("Сотрудники" + surname.getSurname() + "" + name.getName() + "" + middleName.getMiddleName() + "" + department.getDepartment() + "" + salary.getSalary() + "" + id.getId());
    }
}