package Sets;

import java.util.EnumMap;

public class EnumMapC {
    //Faster than HashMap (because it uses array internally)
    //Only allows enum keys
    //Stores keys in natural order of the enum
    //Very memory-efficient
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {

        // EnumMap with key type Day and value type String
        EnumMap<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Start of week");
        map.put(Day.FRIDAY, "Weekend soon");
        map.put(Day.SUNDAY, "Holiday");

        System.out.println(map);
    }
}
