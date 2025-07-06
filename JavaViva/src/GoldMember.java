public class GoldMember extends Member {
    private double discount;

    public GoldMember(String name, int memberId, double discount) {
        super(name, memberId);
        this.discount = discount;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gold Member Discount Rate: " + discount );
    }
}
