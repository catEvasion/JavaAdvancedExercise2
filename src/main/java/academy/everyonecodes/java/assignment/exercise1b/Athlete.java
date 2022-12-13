package academy.everyonecodes.java.assignment.exercise1b;

public class Athlete {
    String firstName;
    String lastName;
    Double height; // in meters
    boolean suspended;

    public Athlete(String firstName, String lastName, Double height, boolean suspended){
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.suspended = suspended;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + height + " " + suspended;
    }
}
