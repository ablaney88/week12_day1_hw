import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100, 10, 100, 0);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void isEmpty(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void drinkTaken(){
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void refill(){
        assertEquals(100, waterBottle.fillBackUp());
    }


}
