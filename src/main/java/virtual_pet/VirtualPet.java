package virtual_pet;

public class VirtualPet {
    String name = "Zarflak the Goblin";
    int attributeHunger = 50;
    int attributeThirst = 50;
    int attributeBoredom = 50;
    int attributeSleepiness = 50;
    int attributeBathroom = 50;
    int attributeAggression = 25;

    public void tick() {

        attributeHunger += 5;
        attributeThirst += 10;
        attributeBoredom += 10;
        attributeSleepiness += 5;
        attributeBathroom += 5;
        attributeAggression++;

        attributeCheck();
    }

    public void eats() {
        attributeHunger -= 50;
        if (attributeHunger<0) {
            attributeHunger = 0;
        }
    }

    public void drinks() {
        attributeThirst -= 50;
        if (attributeThirst<0) {
            attributeThirst = 0;
        }
    }

    public void plays() {
        attributeBoredom -= 40;
        if (attributeBoredom<0) {
            attributeBoredom = 0;
        }
    }

    public void sleeps() {
        attributeSleepiness = 0;
    }

    public void potties() {
        attributeBathroom = 0;
    }

    public void attributeCheck() {
        if (attributeHunger >= 100) {attributeAggression += 20;}
        if (attributeThirst >= 100) {attributeAggression += 10;}
        if (attributeBoredom >= 100) {attributeAggression += 10;}
        if (attributeSleepiness >= 100) {attributeAggression += 10;}
        if (attributeBathroom >= 100) {attributeAggression += 20;}
    }
}
