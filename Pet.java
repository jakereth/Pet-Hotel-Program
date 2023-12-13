import java.util.Scanner;

public class Pet {
    private int dogCount = 0;
    private int catCount = 0;
    private static final int MAX_DOGS = 30;
    private static final int MAX_CATS = 12;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String petType; 
        while (true) {
            System.out.print("Which type of pet do you have? Dog or Cat?: ");
            petType = scanner.nextLine().trim(); 
            if (petType.equalsIgnoreCase("Dog")) {
                if (dogCount < MAX_DOGS) {
                    handleDog(scanner);
                } else {
                    System.out.println("Sorry, there is not enough space for your dog.");
                }
                break;
            } else if (petType.equalsIgnoreCase("Cat")) {
                if (catCount < MAX_CATS) {
                    handleCat(scanner);
                } else {
                    System.out.println("Sorry, there is not enough space for your cat.");
                }
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Dog' or 'Cat'.");
            }
        }
    }

    private void handleDog(Scanner scanner) {
        String petStatus;
        while (true) {
            System.out.print("New or Returning pet? ");
            petStatus = scanner.nextLine().trim();
            if (petStatus.equalsIgnoreCase("New") || petStatus.equalsIgnoreCase("Returning")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'New' or 'Returning'.");
            }
        }

        if (petStatus.equalsIgnoreCase("New")) {
        	 System.out.print("Enter pet name: ");
             String petName = scanner.nextLine().trim();
             System.out.print("Enter pet age: ");
             int petAge = scanner.nextInt();
             System.out.print("Enter length of stay in days: ");
             int petLengthOfStay = scanner.nextInt();

             if (petLengthOfStay >= 2) {
                 System.out.print("Would you like your dog to be groomed? Yes or No?: ");
                 String groomChoice = scanner.next();
                 // space for appending grooming price
             }
             assignDogToSpot(petName, petAge, petLengthOfStay);
        } else if (petStatus.equalsIgnoreCase("Returning")) {
        	 System.out.print("Enter pet name: ");
             String petName = scanner.nextLine().trim();
             System.out.print("Enter pet age: ");
             int petAge = scanner.nextInt();
             System.out.print("Enter length of stay in days: ");
             int petLengthOfStay = scanner.nextInt();

             if (petLengthOfStay >= 2) {
                 System.out.print("Would you like your dog to be groomed? Yes or No?: ");
                 String groomChoice = scanner.next();
                 // space for appending grooming price
             }
             assignDogToSpot(petName, petAge, petLengthOfStay);
        }
    }

    private void handleCat(Scanner scanner) {
        String petStatus;
        while (true) {
            System.out.print("New or Returning pet? ");
            petStatus = scanner.nextLine().trim();
            if (petStatus.equalsIgnoreCase("New") || petStatus.equalsIgnoreCase("Returning")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'New' or 'Returning'.");
            }
        }

        if (petStatus.equalsIgnoreCase("New")) {
        	 System.out.print("Enter pet name: ");
             String petName = scanner.nextLine().trim();
             System.out.print("Enter pet age: ");
             int petAge = scanner.nextInt();
             System.out.print("Enter length of stay (in days): ");
             int petLengthOfStay = scanner.nextInt();
             assignCatToSpot(petName, petAge, petLengthOfStay);
        } else if (petStatus.equalsIgnoreCase("Returning")) {
        	System.out.print("Enter pet name: ");
            String petName = scanner.nextLine().trim();
            System.out.print("Enter pet age: ");
            int petAge = scanner.nextInt();
            System.out.print("Enter length of stay (in days): ");
            int petLengthOfStay = scanner.nextInt();
            assignCatToSpot(petName, petAge, petLengthOfStay);
        }
    }

    private void assignDogToSpot(String name, int age, int lengthOfStay) {
        System.out.println("Thank you, your dog is checked in for their stay.");
        dogCount++;
    }

    private void assignCatToSpot(String name, int age, int lengthOfStay) {
        System.out.println("Thank you, your cat is checked in for their stay.");
        catCount++;
    }

    public static void main(String[] args) {
        Pet boardingSystem = new Pet();
        boardingSystem.run();
    }
}