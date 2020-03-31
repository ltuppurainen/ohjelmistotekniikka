package GameLogic;

import GameObjects.Ball;
import GameObjects.Racket;
import GameObjects.Side;

public class Match {
    Ball ball;
    Player player1;
    Player player2;
    Racket activeRacket;
    
    public Match() {
        ball = new Ball(50,25,1,1);
        player1 = new HumanPlayer(Side.LEFT);
        player2 = new ComputerPlayer(Side.RIGHT);
        activeRacket = player1.getRacket();
    }
    
    public void tick() {
        
        //player1.moveRacket();
        //player2.moveRacket();
        if (activeRacket.strikeBall(ball)){
            if (activeRacket.equals(player1.getRacket())) {
                activeRacket = player2.getRacket();
            } else {
                activeRacket = player1.getRacket();
            }
        }
        ball.move();
    }
    
    public String ballPos() {
        return (ball.getX() + ", " + ball.getY());
    }
    
    public void print() {
        // This is a temp thing to make some kind of sensible representation.
        // TODO: Make the GUI :)
        
        Double temp = ball.getX();
        int ballX = temp.intValue();
        temp = ball.getY();
        int ballY = temp.intValue();
        for (int y = 0; y <= 50; y++) {
            for (int x = 0; x <= 100; x++) {
                if (ballX == x && ballY == y) {
                    System.out.print("o");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print("\n");
        }
        System.out.print(ball.getX() + ", " + ball.getY() + "============================================================================================\n"); 
    }
}
