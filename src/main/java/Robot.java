import java.util.ArrayList;

public class Robot {
    String nameRobot;
    int capacity = Params.CAPACITY;
    ArrayList<Merchandise> shoppingCart = new ArrayList<>();
    public Robot(String nameRobot) {
        this.nameRobot = nameRobot;
    }

    @Override
    public String toString() {
        return "{"+nameRobot + " " + shoppingCart+"}";
    }

}
