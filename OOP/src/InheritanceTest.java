public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Suman","1FD",450000);
        employee.display();
        System.out.println("---------------");

        Manager manager = new Manager("saugat","AF1",10000000,"IT");
        manager.display();
        manager.manageTeam();

    }
}
