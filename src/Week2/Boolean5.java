package Week2;

public class Boolean5 {
    static void hottestDay(double sundayTemp, double mondayTemp, double tuesdayTemp) {
        if ((sundayTemp > mondayTemp) && (sundayTemp > tuesdayTemp)) {
            System.out.println("Sunday");
        } else if ((sundayTemp < mondayTemp) && (mondayTemp > tuesdayTemp)) {
            System.out.println("Monday");
        } else {
            System.out.println("Tuesday");
        }
    }
}
