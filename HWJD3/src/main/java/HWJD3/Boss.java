package HWJD3;

import java.util.ArrayList;

public class Boss extends Employee {

    public Boss(String name, String manager, String phoneNumber, int salary, int age) {
        super(name, manager, phoneNumber, salary, age);
    }
    @Override
    public void salaryIncreseIf(int ifAge, int salaryUp) {
        System.out.println("Этот " + this.name + "является Начальником --> " + "Никакого повышения этому дармоеду ");
    }

}
