public enum RPS {
    ROCK, PAPER, SCISSORS;

    public static RPS[] getEnumConstants(){
        return new RPS[] {ROCK, PAPER, SCISSORS};
    }

    public static String win(RPS p1, RPS p2){
        String win1 = "Player 1 Wins";
        String win2 = "Player 2 Wins";
        String tie = "Tie";
        if(p1.toString().equals("ROCK")){
            if(p2.toString().equals("SCISSORS")) return win1;
            else if(p2.toString().equals("PAPER")) return win2;
            else return tie;
        }
        else if(p1.toString().equals("PAPER")){
            if(p2.toString().equals("ROCK")) return win1;
            else if(p2.toString().equals("SCISSORS")) return win2;
            else return tie;
        }
        else{
            if(p2.toString().equals("ROCK")) return win2;
            else if(p2.toString().equals("PAPER")) return win1;
            else return tie;
        }

    }

}