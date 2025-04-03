public class SetScorer {

    public int[] games = {0,0};
    public void gamesWon(int i) {
        games[i-1]++;
    }

    public String getSetScore() {
        int max = Math.max(games[0], games[1]);
        int leadingPlayer = (games[0] > games[1]) ? 1 : 2;
        int min = Math.min(games[0], games[1]);
        if(max == min) {
            return "Set is tied at " + max + " games";
        }
        if((max >= 6 && max -  min >= 2) || (max == 7  && min == 6)) {
            return  "Player " + leadingPlayer +  " wins the set " + max + "-" + min;
        }
        return "Player " + leadingPlayer +  " leads " + max + "-" + min;

    }

    public static void main(String[] args) {
         String s = "implement";
         float id71;


    }
}
