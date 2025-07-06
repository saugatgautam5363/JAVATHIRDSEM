public class Membership {
    public static void main(String[] args) {
        GoldMember gold = new GoldMember("Saugat", 101, 15.0);
        GeneralMember general = new GeneralMember("Santosh", 102, 200);

        System.out.println("Gold Member: ");
        gold.displayInfo();

        System.out.println("\nGeneral Member: ");
        general.displayInfo();
    }
}
