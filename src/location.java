public class location {

    private String name;
    private int id;
    //1 = land, 2 = chance, 3 = tax, 4 = chance
    private int type;
    private int ownership;
    private int price;

    public location(String name,int id, int type, int price){
        this.name = name;
        this.id = id;
        this.type = type;
        this.ownership = -1;
        this.price = price;
    }

    public void transfer(int owner){
        ownership = owner;
    }

    location chekLapKok = new location("Chek Lap Kok",1, 1, 60);

}
