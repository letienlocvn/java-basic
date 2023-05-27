package loclt.application.class_and_object.classes;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int startCadence, int startSpeed, int startGear, int startHeight) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
