package GameObjects;

public class Racket {
    private double x;
    private double xMin;
    private double xMax;
    
    private double y;
    private Side side;
    private double radius;

    public Racket(Side side) {
        this.side = side;
        this.radius = 2.0;
        this.y = 25.0;
        
        // TODO: I think I should put these two in the enums or as global whatevers. 
        if (side == Side.LEFT) {
            this.x = 25.0;
            this.xMin = 0.0 + this.radius/2;
            this.xMax = 50.0 - this.radius/2;
        } else {
            this.x = 75.0;
            this.xMin = 50.0 + this.radius/2;
            this.xMax = 100.0 - this.radius/2;
        }
        
    }
    
    public void move(double x, double y) {
        double newX = Math.min(x, xMax);
        newX = Math.max(newX, xMin);
        
        double newY = Math.min(y, 50.0 - this.radius/2);
        newY = Math.max(newY, 0.0 + this.radius/2);
        
        this.x = newX;
        this.y = newY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean strikeBall(Ball ball) {
        return false;
    }
    
}
