import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {

        System.out.println("-----------------------------------------------");
        System.out.println("------Welcome to University Maagment System----");
        System.out.println("-----------------------------------------------");
        System.out.println("Enter a command: \n");
        System.out.println("1 - Employee             2 - Lab");
        System.out.println("3 - Computer             4 - Department");
        System.out.println("              0 - Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(" 1 - New Employee.     2 - Search Employee");
                System.out.println("           3 - Remove Employee");
                choice = scanner.nextInt();
                if(choice == 1){

                } else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                menu();
                break;
            case 2:
                System.out.println(" 1 - New Lab.     2 - Search Lab");
                System.out.println("        3 - Remove Lab");
                choice = scanner.nextInt();
                if(choice == 1){

                } else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                choice = scanner.nextInt();
                if(choice == 1){

                } else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                menu();
                break;
            case 3:
                System.out.println(" 1 - New PC.     2 - Search PC");
                System.out.println("           3 - Remove PC");
                choice = scanner.nextInt();
                if(choice == 1){

                } else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                menu();
                break;
            case 4:
                System.out.println(" 1 - New Department.     2 - Search Department");
                System.out.println("        3 - Remove Department");
                choice = scanner.nextInt();
                if(choice == 1){

                } else if (choice == 2) {

                }
                choice = scanner.nextInt();
                if(choice == 1){

                } else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                menu();
                break;
            case 0:
                System.out.println("Exiting University Management System. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}