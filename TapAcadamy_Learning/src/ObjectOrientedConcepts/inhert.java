package ObjectOrientedConcepts;

import java.util.*;
class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary){
    	this.name = name;
    	this.salary = salary;
    }
    // Getters and Setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public double getAnnualSalary() {
        return salary * 12; // Example calculation
    }
}

class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double salary, double bonus){
    	super(name, salary);
    	this.bonus = bonus;
    }
    // Getters and Setters
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    @Override
    public double getAnnualSalary() {
        return (super.getAnnualSalary() + bonus);
    }
}

class Engineer extends Employee {
    private double overtime;

    // Constructor
    public Engineer(String name, double salary, double overtime) {
    	super(name, salary);
    	this.overtime = overtime;
    }
    // Getters and Setters
    public void setOvertime(double overtime){
        this.overtime = overtime;
    }
    public double getOvertime(){
        return overtime;
    }
    @Override
    public double getAnnualSalary() {
        return (super.getAnnualSalary() + overtime);
    }
}

public class inhert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input
        // Create appropriate Employee object based on input
        // Print the annual salary
        String str = null;
        String name;
        double salary;
        double bonus; 
        double overtime;
        String typeOfEmp = sc.nextLine();
        Employee e;
        if(typeOfEmp.equals("Manager")) {
        	str = sc.nextLine();
        	
        	String arr[] = str.split(",");
        	name = arr[0];
        	salary = Double.parseDouble(arr[1]);
        	bonus = Double.parseDouble(arr[2]);
        	
        	e = new Manager(name, salary, bonus);
        	System.out.println("Annual Salary of Manager: "+e.getAnnualSalary());
        }
        else if(typeOfEmp.equals("Engineer")) {
        	str = sc.nextLine();
   
        	String arr[] = str.split(",");
        	name = arr[0];
        	salary = Double.parseDouble(arr[1]);
        	overtime = Double.parseDouble(arr[2]);
        	
        	e = new Engineer(name, salary, overtime);
        	System.out.println("Annual Salary of Engineer: "+e.getAnnualSalary());
        }
        else {
        	System.out.println("Wrong Input");
        }
    }
}
