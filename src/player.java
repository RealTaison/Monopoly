public class player {

    private int id;
    private int wallet;
    private int location;
    private boolean inJail;
    private int jailCounter;

    public player(int id){
        this.id = id;
        this.wallet = 1500;
        this.location = 0;
        this.inJail = false;
        this.jailCounter = 0;
    }

    public void addMoney(int amount){
        wallet += amount;
    }

    public void spendMoney(int amount){
        wallet -= amount;
    }

    public int getWallet(){
        return wallet;
    }

    public void move(int steps){
        location = location + steps;
        if (location == 30){
            inJail = true;
        }
        if (location >= 40){
            addMoney(200);
            resetLocation();
        }
    }

    public int getLocation(){
        return location;
    }

    public void resetLocation(){
        location -= 40;
    }

    public boolean checkJail(){
        return inJail;
    }

    public int getJailCounter(){
        return jailCounter;
    }

    public void addJail(){
        jailCounter++;
    }

}