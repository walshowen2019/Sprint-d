import java.util.Scanner;

public class Main {

    public static double wkHours1 = 30;
    public static double wkHours2 = 35;
    public static double wkHours3 = 40;
    public static double totalEffort = 1590;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 6; i++) {
            System.out.println("Enter the amount of Engineers: ");
            double engineers = scan.nextDouble();
            System.out.print("Enter the Sprint Length: ");
            double sprintLength = scan.nextDouble();
            calcCapacity(engineers, sprintLength);
        }

    }
    public static void calcCapacity(double engineers, double sprintLength){
        double capacity1 = ((totalEffort/engineers)/(wkHours1*sprintLength))*100;
        System.out.println("With " + (int)engineers + " devs " + "working a " + (int)sprintLength + " week sprint, for 30 hrs/wk, we would be at " + (int)capacity1 + "% of capacity.");
        double capacity2 = ((totalEffort/engineers)/(wkHours2*sprintLength))*100;
        System.out.println("With " + (int)engineers + " devs " + "working a " + (int)sprintLength + " week sprint, for 40 hrs/wk, we would be at " + (int)capacity2 + "% of capacity.");
        double capacity3 = ((totalEffort/engineers)/(wkHours3*sprintLength))*100;
        System.out.println("With " + (int)engineers + " devs " + "working a " + (int)sprintLength + " week sprint, for 45 hrs/wk, we would be at " + (int)capacity3 + "% of capacity.");
    }
}
