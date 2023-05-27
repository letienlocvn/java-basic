package loclt.application.class_and_object.enum_constant;

public class EnumDemo {
    Day day;
    public EnumDemo(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumDemo firstDay = new EnumDemo(Day.MONDAY);
        firstDay.tellItLikeItIs();
    }
}
