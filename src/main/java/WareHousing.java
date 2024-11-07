import java.util.ArrayList;

public class WareHousing {

    public static ArrayList<Merchandise> setWareHousing(){
        ArrayList<Merchandise> warehousing = new ArrayList<>() ;
        ArrayList<Merchandise> listMerchandise = Params.WAREHOUSE;
        Merchandise counter = new Merchandise("Counter",0,cellPositionInShelf(0));
        for(int i=0;i<listMerchandise.size();i++){
            Merchandise merchandise = new Merchandise();
            merchandise.setName(listMerchandise.get(i).getName());
            merchandise.setQuantity(listMerchandise.get(i).getQuantity());
            Position position = cellPositionInShelf(i+1);
            merchandise.setPosition(position);
            warehousing.add(merchandise);
        }
        System.out.println("warehousing = " + warehousing);
        return warehousing;
    }
    public static Position cellPositionInShelf(int i){
//        int shelf ;
//        shelf= i % (Params.TIERS * Params.SLOTS) == 0 ? i / (Params.TIERS * Params.SLOTS) : i / (Params.TIERS * Params.SLOTS) + 1;
//        int tier;
//        int temp = i % (Params.TIERS * Params.SLOTS);
//        if(temp==0) tier=Params.TIERS;
//        else tier = temp % Params.SLOTS == 0 ? temp / Params.SLOTS  : ((temp / Params.SLOTS) +1)  ;
//        int slot = temp % Params.SLOTS == 0 ? Params.SLOTS : temp % Params.SLOTS;
        int shelf = (i-1) / (Params.TIERS * Params.SLOTS);
        int tier = (i - (shelf * Params.TIERS * Params.SLOTS) - 1) / Params.SLOTS;
        int slot = i - shelf * Params.TIERS * Params.SLOTS - tier * Params.SLOTS -1 ;

        Position position = new Position(shelf,tier,slot);
        return position;
    }
    public static int cellPositionInWarehouse(int shelf, int tier, int slot){
        return shelf * (Params.SLOTS * Params.TIERS) + tier * Params.SLOTS + slot +1 ;
    }
}
