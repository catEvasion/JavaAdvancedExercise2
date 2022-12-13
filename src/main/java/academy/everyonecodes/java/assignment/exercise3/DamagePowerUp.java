package academy.everyonecodes.java.assignment.exercise3;

public class DamagePowerUp implements PowerUp {

    int intensity;

    public DamagePowerUp(int intensity) {
        this.intensity = intensity;
    }
    @Override
    public void apply(Racecar car) {
        car.setDamge(car.getDamge() + intensity);
    }
}
