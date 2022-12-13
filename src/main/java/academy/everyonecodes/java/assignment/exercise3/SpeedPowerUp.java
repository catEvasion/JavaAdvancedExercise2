package academy.everyonecodes.java.assignment.exercise3;

public class SpeedPowerUp implements PowerUp {

    int intensity;

    public SpeedPowerUp(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public void apply(Racecar car) {
        car.setSpeed(car.getSpeed() + intensity);
    }
}
