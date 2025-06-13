public class Manager extends Employee {
    protected String department;

    public Manager(String name, String ID, double salary,String department) {
        super(name, ID, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department : "+department);
    }
    public void manageTeam(){
        System.out.println(name + " is managing the " + department + " team.");
    }
}
