import java.util.Scanner;
import java.util.Scanner;

public class IT24102708Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_3_4_DAYS = 0.10;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.20;

        
        System.out.print("Enter start day (1-31): ");
        int startDay = scanner.nextInt();
        System.out.print("Enter end day (1-31): ");
        int endDay = scanner.nextInt();

     
        if (startDay < 1 || startDay > 31 || endDay < 1 || endDay > 31 || startDay >= endDay) {
            System.out.println("Invalid input. Please check the start and end dates.");
            return;
        }

        
        int reservedDays = endDay - startDay;

        
        double discount = 0.0;
        if (reservedDays >= 3 && reservedDays <= 4) discount = DISCOUNT_3_4_DAYS;
        if (reservedDays >= 5) discount = DISCOUNT_5_OR_MORE_DAYS;

        
        double totalAmount = reservedDays * ROOM_CHARGE * (1 - discount);

    
        System.out.println("Days reserved: " + reservedDays);
        System.out.println("Total amount: Rs " + totalAmount);
    }
}
