package academy.everyonecodes.java.assignment.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaceCarTest {
    @Test
    void testSpeed() {
        SpeedPowerUp powerUp = new SpeedPowerUp(10);
        Racecar car = new Racecar(100, 0);
        powerUp.apply(car);
        assertEquals(car.getSpeed(), 110);
        assertEquals(car.getDamge(), 0);
    }
    @Test
    void testDamage() {
        DamagePowerUp powerUp = new DamagePowerUp(4);
        Racecar car = new Racecar(100, 0);
        powerUp.apply(car);
        assertEquals(car.getSpeed(), 100);
        assertEquals(car.getDamge(), 4);
    }
}
