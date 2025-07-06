public class GeneralMember extends Member {
    private int rewardPoints;

    public GeneralMember(String name, int memberId, int rewardPoints) {
        super(name, memberId);
        this.rewardPoints = rewardPoints;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("General Member Reward Points: " + rewardPoints);
    }
}
