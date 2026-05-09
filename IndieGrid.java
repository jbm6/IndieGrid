import java.util.Scanner;

public class IndieGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SeatingChart chart = new SeatingChart();
        boolean running = true;

        System.out.println("Welcome to IndieGrid Movie Reservations!");

        while (running) {
            System.out.println("\n1. View Schedule\n2. View Seats/Reserve\n3. Admin Mode\n4. Exit");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Now Showing: 1. Interstellar  2. Batman");
            } 
            else if (choice == 2) {
                chart.displayGrid();
                System.out.print("Enter Row (1-5): ");
                int r = input.nextInt() - 1; // Subtract 1 for array index
                System.out.print("Enter Col (1-6): ");
                int c = input.nextInt() - 1;

                if (chart.reserveSeat(r, c)) {
                    System.out.println("Seat reserved successfully!");
                } else {
                    System.out.println("Error: Seat already taken!");
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter Admin Password: ");
                String pw = input.next();
                if (pw.equals("password123")) {
                    chart.resetSeats();
                    System.out.println("Admin Mode: Seating chart has been reset.");
                } else {
                    System.out.println("Invalid Password.");
                }
            } 
            else {
                running = false;
            }
        }
        input.close();
    }
}