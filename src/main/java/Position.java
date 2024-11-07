public class Position {
    private int shelf;
    private int tier;
    private int slot;
    public int x;
    public int y;
    @Override
    public String toString() {
        return "{ "+shelf+" "+tier+" "+slot+" ~ "+ x + " "+ y+ " }";
    }

    public Position() {
    }

    public Position(int shelf, int tier, int slot) {
        this.shelf = shelf;
        this.tier = tier;
        this.slot = slot;
        y = slot ;
        if(shelf %2 != 0)
            x = 2*shelf -1;
        else
            x = 2*shelf;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }


}
