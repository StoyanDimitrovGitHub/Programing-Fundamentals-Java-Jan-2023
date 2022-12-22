package BasicSinatx;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = ( hours * 60) + minutes + 30;
        int totalHour = allMinutes/60;
        int totalMin = allMinutes % 60;

        if (totalHour > 23 )
            totalHour = 0;

        System.out.printf("%d:%02d",totalHour,totalMin);
    }
}
