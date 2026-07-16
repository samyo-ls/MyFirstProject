import java.util.Scanner;

public class StudyPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subjects = {
            "Mathematics",
            "Physics",
            "Chemistry",
            "Biology",
            "History"
        };

        System.out.println("===== Study Planner =====");

        while (true) {
            System.out.println("\nToday's Subjects:");

            for (int i = 0; i < subjects.length; i++) {
                System.out.println((i + 1) + ". " + subjects[i]);
            }

            System.out.println("\nChoose a subject to study (0 to exit): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Good luck with your studies!");
                break;
            }

            if (choice >= 1 && choice <= subjects.length) {
                System.out.println("Task for " + subjects[choice - 1] + ":");
                sc.nextLine();
                String task = sc.nextLine();

                System.out.println("Saved: " + task);
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}