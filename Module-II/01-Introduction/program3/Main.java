
class Employee {
    int empId;
    String name;
    long salary;

    void details() {
        System.out.println("Employee Id :" + empId + "\t Name :" + name + "\t Salary :" + salary);
    }

}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 1234;
        e1.name = "Kiran";
        e1.salary = 6336372727L;

        e1.details();

    }
}

// Employee Id :1234 Name :Kiran Salary :6336372727
