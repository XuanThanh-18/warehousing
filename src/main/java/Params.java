import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Params {
    //ke hang
    static int SHELVES ;
    // tang
    static int TIERS;
    // o hang
    static int SLOTS;
    // so luong robots
    static int ROBOTS;
    // dung luong cua robot
    static int CAPACITY ;
    static int REQUIRE_MACHANDISE;
    // so luong o hang
    static int COUNT ;
    static ArrayList<Merchandise> WAREHOUSE  ;
    static ArrayList<Merchandise> REQUIRE;
    public static void ReadParams(){
        String pathname = "src/main/resources/data test small.txt";
        ArrayList<Merchandise> warehouse = new ArrayList<>();
        ArrayList<Merchandise> require = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(pathname))) {
            String line ;
            String name;
            int quantity;
            ArrayList<Merchandise> merchandises = new ArrayList<>();
            while((line = br.readLine()) != null){
                String[] parts = line.split(" ");
                if(parts.length > 2){
                    SHELVES = Integer.parseInt(parts[0]);
                    TIERS = Integer.parseInt(parts[1]);
                    SLOTS = Integer.parseInt(parts[2]);
                    REQUIRE_MACHANDISE = Integer.parseInt(parts[3]);
                    ROBOTS = Integer.parseInt(parts[4]);
                    CAPACITY = Integer.parseInt(parts[5]);
                    COUNT = TIERS * SHELVES * SLOTS;
                }else{
                    name = parts[0];
                    quantity = Integer.parseInt(parts[1]);
                    Merchandise merchandise = new Merchandise(name,quantity);
                    merchandises.add(merchandise);
                }
            }
            for(int i=0;i<COUNT;i++){
                warehouse.add(merchandises.get(i));
            }
            for(int i=SLOTS*SHELVES*TIERS;i<merchandises.size();i++){
                require.add(merchandises.get(i));
            }
            if(require.size()!=REQUIRE_MACHANDISE){
                System.out.println("Input is wrong");
            }
            WAREHOUSE = warehouse;
            REQUIRE = require;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
