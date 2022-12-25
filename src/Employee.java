import java.util.Objects;

public class Employee {
    private final String  name;
    private final String surname;
    private final String middleName;
    private int department;
    private double salary;
    private int id;
    static int count=0;
    static double sum=0;


    public Employee(String surname, String name, String middleName, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id =count;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
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

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Сумму затрат на зарплаты
    public static double sumSalary(double salary) {
        sum+=salary;
        return sum;
    }

    public static double averageSalary(double averageSum) {
        averageSum=sum/count;
        return averageSum;
    }
    public static double maxSalary(double[] arr) {
        double max= arr[0];
        for (int j =1; j < arr.length-1; j++) {
            if (arr[j] > max) {
                max=arr[j];
            }
        }
        return max;
    }
    @Override
    public String toString() {
        return surname + "" + name + "" + middleName + " из отдела №: " + department + " зп " + salary + " ID " + id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName, department, salary, id);
    }
}
