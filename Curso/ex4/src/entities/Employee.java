package ex4.src.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentual){
        grossSalary += grossSalary * (percentual /100);
    }

    public String toString(){
        return name + ", " + netSalary();
    }
}
