package GameLogic;

import GameObjects.Racket;
import GameObjects.Side;

public abstract class Player {
    private Racket racket;
    private int score;
    
    public Player(Side side) {
        this.racket = new Racket(side);
        this.score = 0;
    }
    
    public void moveRacket() {
        this.racket.move(this.getXInput(), this.getYInput());
    }
    
    public abstract double getXInput();

    public Racket getRacket() {
        return racket;
    }
    public abstract double getYInput();
    
}
