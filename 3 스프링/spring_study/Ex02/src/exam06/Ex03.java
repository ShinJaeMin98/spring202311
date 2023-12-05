package exam06;

public class Ex03 {
    public static void main(String[] args) {
        Transportation taxi = Transportation.TAXI;
        System.out.printf("ordinal : %d, name : %s%n", taxi.ordinal(), taxi.name());

        //Transportation subway = Enum.valueOf(Transportation.class, "SUBWAY");
        Transportation subway = Transportation.valueOf("SUBWAY");
        System.out.println(subway);
    }
}
