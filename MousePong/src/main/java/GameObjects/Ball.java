package GameObjects;

public class Ball {
    private double x;
    private double y;
    private double dx;
    private double dy;
    private double radius;

    public Ball(double x, double y, double dx, double dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = 1.0;
    }
    
    public void move() {
        // TODO: Move boundary vals to wherever global consts are supposed to be in Java. 
        
        // Colliding with walls. 
        if (this.y + this.dy > 50) {
            this.y -= this.dy - (50-this.y);
            this.dy *= -1;
        } else if (this.y + this.dy < 0) {
            this.y += this.dy - this.y;
            this.dy *= -1;
        } else {
            this.y += this.dy;
        }
        
        // Temporarily colliding with goal-lines until you can actually hit the ball. 
        if (this.x + this.dx > 100) {
            this.x -= this.dx - (100 - this.x);
            this.dx *= -1;
        } else if (this.x + this.dx < 0) {
            this.x += this.dx - (this.x);
            this.dx *= -1;
        } else {
            this.x += this.dx;
        }
        
        //this.x += this.dx;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
