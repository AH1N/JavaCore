package HWJD3;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Employee {
    public String name;
    public String position;
    public String phoneNumber;
    public Integer salary;
    public Integer age;

    public Employee(String name, String position, String phoneNumber , int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public String printEmployee(){
        return String.format("Имя: %s%nДолжность: %s%nНомер телефона: %s%nЗарплата: %d%nВозраст: %d%n",
                this.name, this.position, this.phoneNumber, this.salary, this.age);
    }
    public void salaryIncreseIf(int ifAge, int salaryUp){
        if(this.age >= ifAge){
            setSalary(this.salary + salaryUp);
            System.out.println("Этот " + this.name + " " + this.position + " "
                    + "получил повышение зарплаты" + " на-->" + salaryUp);

        }else{
            System.out.println("Этот " + this.name + " " + this.position + " " + "Слишком молодой");
        }
    }
    public static void salaryIncreseAll(ArrayList<Employee> EmployeeList, int salaryUp, int age){
        for (Employee emp: EmployeeList) {
            emp.salaryIncreseIf(age, salaryUp);
        }
    }
    public static void midArithmetic(ArrayList<Employee> EmployeeList) {
        int countSalary = 0;
        int countAge = 0;
        for (Employee emp: EmployeeList) {
            countSalary += emp.getSalary();
            countAge += emp.getAge();
        }
        System.out.println("Средняя зарплата сотрудников-->" + (countSalary/EmployeeList.size()));
        System.out.println("Средний возраст сотрудников-->" + (countAge/EmployeeList.size()));
    }
}
