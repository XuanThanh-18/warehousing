import java.util.ArrayList;

public class Individual {
    ArrayList<Merchandise> require = Params.REQUIRE;
    ArrayList<Robot> robots ;

    public Individual() {
        robots = new ArrayList<>();
        Robot robot1 = new Robot("1");
        Robot robot2 = new Robot("2");
        robots.add(robot1);
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot1);
    }
    public float greedy(Position positionCurrent,ArrayList<Merchandise> warehousing){
        System.out.println("require = " + require);
        System.out.println("robots = " + robots);
        for(int i=0;i<robots.size();i++){
            robots.get(i).shoppingCart.add(require.get(i));
        }

        return 0;
    }
}
