package virtual_pet;

public class VirtualPet {
    String name = "Zarflak the Goblin";
    int attributeHunger = 50;
    int attributeThirst = 50;
    int attributeBoredom = 50;
    int attributeSleepiness = 50;
    int attributeBathroom = 50;

    public void tick() {

        attributeHunger += 5;
        attributeThirst += 10;
        attributeBoredom += 10;
        attributeSleepiness += 5;
        attributeBathroom += 5;
    }

    public void eats() {
        attributeHunger -= 50;
        tick();
    }

    public void drinks() {
        attributeThirst -= 50;
        tick();
    }

    public void plays() {
        attributeBoredom -= 40;
        tick();
    }

    public void sleeps() {
        // Reversed order of attribute change + tick() deliberate
        tick();
        attributeSleepiness = 0;
    }

    public void potties() {
        attributeBathroom = 0;
        tick();
    }
}
