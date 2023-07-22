package HWJD3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Employee> list = new ArrayList<>();
        Employee one  = new Employee("Ivan", "manager", "1234567", 300, 30);
        Employee two  = new Employee("Sergey", "driver", "0992568576", 250, 45);
        Employee three  = new Employee("Gregor", "inquisirot", "666666666", 800, 60);
        Employee four  = new Employee("Velisarius", "AdeptusMechanicus", "01010101010", 820, 100);
        Employee five  = new Employee("lucius", "swordmaster", "000000000000", 8, 38);
        Boss boss  = new Boss("Emperor", "EmperorOfHumanKind", "WarpDeacon", 0, 1000);
        list.add(boss);
        list.add(five);
        list.add(four);
        list.add(three);
        list.add(two);
        list.add(one);

        Employee.salaryIncreseAll(list, 5000, 45 );

        Employee.midArithmetic(list);
    }
}