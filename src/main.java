public class main {

    public static void main(String[] args){

        int playerCount = 3;
        int round = 0;

        dice dice1 = new dice();
        dice dice2 = new dice();

        player [] playerList = new player [playerCount];
        location [] map = new location[39];
        for (int i = 0; i < 40; i++) {
            switch (i){
                case 0:
                    map[i] = new location ("Start",i,5, 0);
                    break;
                case 1:
                    map[i] = new location ("Chek Lap Kok",i,1, 60);
                    break;
                default:
                    //map[i] = new location(i,5,0);
            }
        }


        for (int i = 0; i < playerCount; i++) {
            playerList[i] = new player(i);
        }

        while (round<1){
            //loop every player
            for (int i = 0; i < playerCount; i++) {
                playerList[i].move(dice1.roll()+dice2.roll());
                //user input

            }
            round++;
        }





    }
}
