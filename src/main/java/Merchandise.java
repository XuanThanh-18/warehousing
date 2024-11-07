public class Merchandise {
    public final int K=Params.SLOTS;
    public final float LAYERDISTANCE = 0.5f;
    private String name;
    private int quantity;
    private Position position = new Position();

    public float distanceTo(Merchandise other){
        if( (this.position.getShelf() == other.position.getShelf()) && (this.position.getSlot() == other.position.getSlot()))
            return LAYERDISTANCE * (Math.abs(this.position.getTier() - other.position.getTier()));
        return Math.min(this.position.x + other.position.x, 2*(K+2) - (this.position.x + other.position.x)) + Math.abs(this.position.y - other.position.y) + LAYERDISTANCE*(this.position.getTier() + other.position.getTier() -2);
    }

    public Merchandise(String name, int quantity,Position position) {
        this.name = name;
        this.quantity = quantity;
        this.position = position;
    }

    public Merchandise(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Merchandise() {
    }

    @Override
    public String toString() {
        return "{"+ name+" "+quantity +"~" + position.getShelf() + " " + position.getTier() + " "+ position.getSlot()+ "} ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
