package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameChoice;
        System.out.println("Welcome! Here's your virtual goblin: ");
        VirtualPet gamePet = new VirtualPet();

        while (true) {
            gamePet.tick();
            System.out.println(gamePet.name);
            System.out.println("");
            showVirtualPet(gamePet);
            System.out.println("");

            System.out.println("How would you like to interact with " + gamePet.name + "?");
            System.out.println("");
            showOptions();
            System.out.println("");
            System.out.print("-> ");
            gameChoice = scanner.nextInt();

            if (gameChoice == 0) {break;}
            else if (gameChoice == 1) {gamePet.eats();}
            else if (gameChoice == 2) {gamePet.drinks();}
            else if (gameChoice == 3) {gamePet.plays();}
            else if (gameChoice == 4) {gamePet.sleeps();}
            else if (gameChoice == 5) {gamePet.potties();}
            else {System.out.println("Well, that was a waste of time.");}
        }
    }

    public static void showVirtualPet(VirtualPet showPet) {
        System.out.println("** Attributes **");
        System.out.println("Hunger:" + showPet.attributeHunger);
        System.out.println("Thirst:" + showPet.attributeThirst);
        System.out.println("Boredom:" + showPet.attributeBoredom);
        System.out.println("Sleepiness:" + showPet.attributeSleepiness);
        System.out.println("Bathroom:" + showPet.attributeBathroom);
    }

    public static void showOptions() {
        System.out.println("1 : Feed your pet");
        System.out.println("2 : Give your pet something to drink");
        System.out.println("3 : Play with your pet");
        System.out.println("4 : Put your pet to bed");
        System.out.println("5 : Take your pet to the bathroom");
        System.out.println("0 : Quit");
    }
}
