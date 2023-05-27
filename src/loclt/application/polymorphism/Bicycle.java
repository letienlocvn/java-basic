package loclt.application.polymorphism;

public class Bicycle {
    int gear;
    int cadence;
    int speed;

    public Bicycle(int gear, int cadence, int speed) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }

    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ");
    }

}
class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
            int startCadence,
            int startSpeed,
            int startGear,
            String suspensionType){
        super(startCadence,
                startSpeed,
                startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" +
                getSuspension() + " suspension.");
    }
}


