public class main {

    public static void main(String[] args){

        int playerCount = 3;
        int round = 0;

        dice dice1 = new dice();
        dice dice2 = new dice();

        player [] playerList = new player [playerCount];

        for (int i = 0; i < playerCount; i++) {
            playerList[i] = new player(i);
        }

        while (round<1){
            //loop every player
            for (int i = 0; i < playerCount; i++) {
                playerList[i].move(dice1.roll()+dice2.roll());
            }
            round++;
        }


        System.out.println(playerList[0].getLocation());
        System.out.println(playerList[1].getLocation());
        System.out.println(playerList[2].getLocation());



    }
}
