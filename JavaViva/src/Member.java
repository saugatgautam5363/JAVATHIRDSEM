public class Member {
    protected String name;
    protected int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}
