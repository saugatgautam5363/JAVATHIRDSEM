public class Employee {
    protected String name;
    protected String ID;
    protected double salary;

    public Employee(String name,String ID,double salary){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee ID     : "+ID);
        System.out.println("Employee Name   : "+name);
        System.out.println("Employee salary : "+salary);
    }
}
