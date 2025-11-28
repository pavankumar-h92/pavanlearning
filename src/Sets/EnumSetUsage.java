package Sets;

import java.util.EnumSet;

public class EnumSetUsage {
    //When your collection contains only enum values
    //Very efficient, better than HashSet for enums
    //Specialized, clean, and easy to use
    enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        EnumSet<Days> weekend = EnumSet.of(Days.SATURDAY, Days.SUNDAY);

        // Create EnumSet with all days
        EnumSet<Days> allDays = EnumSet.allOf(Days.class);

        // Create empty EnumSet
        EnumSet<Days> empty = EnumSet.noneOf(Days.class);

        System.out.println("Weekend: " + weekend);
        System.out.println("All Days: " + allDays);
        System.out.println("Empty EnumSet: " + empty);

        EnumSet<Days> midWeek = EnumSet.range(Days.TUESDAY, Days.THURSDAY);
        System.out.println(midWeek);
    }
}
