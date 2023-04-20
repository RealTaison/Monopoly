import java.util.Random;

public class dice {

    public static int roll(){
        return (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
    }
}
