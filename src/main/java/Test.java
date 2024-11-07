import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Params.ReadParams();
        // lay tham so
//        System.out.println("Params.TIERS = " + Params.TIERS);
//        System.out.println("Params.SHELVES = " + Params.SHELVES);
//        System.out.println("Params.TIERS = " + Params.SLOTS);
//        System.out.println("Params.REQUIRE_MACHANDISE = " + Params.REQUIRE_MACHANDISE);
//        System.out.println("Params.ROBOTS = " + Params.ROBOTS);
//        System.out.println("Params.CAPACITY = " + Params.CAPACITY);
//        System.out.println("Params.REQUIRE = " + Params.REQUIRE);
//        System.out.println("Params.WAREHOUSE = " + Params.WAREHOUSE);

        ArrayList<Merchandise> warehousing = WareHousing.setWareHousing();
        Merchandise counter = new Merchandise();
        counter.setPosition(new Position(0,0,-1));
        Individual individual = new Individual();
        individual.greedy(new Position(0,0,-1),warehousing);
    }
}
