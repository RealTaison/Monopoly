public class player {

    int id;
    static int wallet = 1500;
    static int location = 0;
    static boolean inJail = false;
    static int jailCounter = 0;

    player(int id){
        this.id = id;
    }

    public static void addMoney(int amount){
        wallet += amount;
    }

    public static void spendMoney(int amount){
        wallet -= amount;
    }

    public static int getWallet(){
        return wallet;
    }

    public static void move(int steps){
        location += steps;
        if (location == 30){
            inJail = true;
        }
        if (location >= 40){
            addMoney(200);
            resetLocation();
        }
    }

    public static int getLocation(){
        return location;
    }

    public static void resetLocation(){
        location -= 40;
    }

    public static boolean checkJail(){
        return inJail;
    }

    public static int getJailCounter(){
        return jailCounter;
    }

    public static void addJail(){
        jailCounter++;
    }
}
