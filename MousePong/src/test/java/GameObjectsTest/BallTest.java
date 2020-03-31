package GameObjectsTest;

import GameObjects.Ball;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BallTest {
    Ball ball;
    
    public BallTest() {
    }
    
    @Before
    public void setUp() {
        ball = new Ball(50,25,1,1);
    }
    
    @Test 
    public void ballCreatedInRightPosition() {
        assertEquals(50.0, ball.getX());
        assertEquals(25.0, ball.getY());
    }
    
    @Test
    public void ballMovesCorrectly() {
        ball.move();
        assertEquals(51.0, ball.getX());
        assertEquals(26.0, ball.getY());
    }
    
    @Test
    public void ballCollidesWithWalls() {
        // Only test Y coord, since X boundary should score instead of bounce.
        for (int i = 0; i < 25; i++) {
            ball.move();
        }
        assertEquals(50.0, ball.getY());
        ball.move();
        assertEquals(49.0, ball.getY());
    }
}

