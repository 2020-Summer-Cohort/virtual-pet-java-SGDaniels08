package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void instantiateVirtualPet() {
        VirtualPet testPet = new VirtualPet();
    }

    @Test
    public void testInitialVariables() {
        VirtualPet testPet = new VirtualPet();

        assertEquals("Zarflak the Goblin", testPet.name);
        assertEquals(50,testPet.attributeHunger);
        assertEquals(50,testPet.attributeThirst);
        assertEquals(50,testPet.attributeBoredom);
        assertEquals(50,testPet.attributeSleepiness);
        assertEquals(50,testPet.attributeBathroom);
    }

    @Test
    public void testPetName() {
        VirtualPet testPet = new VirtualPet();

        assertEquals("Zarflak the Goblin", testPet.name);
    }

    @Test
    public void testTickFunction() {
        VirtualPet testPet = new VirtualPet();
        testPet.tick();
        assertEquals(55,testPet.attributeHunger);
        assertEquals(60,testPet.attributeThirst);
        assertEquals(60,testPet.attributeBoredom);
        assertEquals(55,testPet.attributeSleepiness);
        assertEquals(55,testPet.attributeBathroom);
    }

    @Test
    public void testThreeTicks() {
        VirtualPet testPet = new VirtualPet();

        for (int i = 0; i<3; i++) {
            testPet.tick();
        }
        assertEquals(65,testPet.attributeHunger);
        assertEquals(80,testPet.attributeThirst);
        assertEquals(80,testPet.attributeBoredom);
        assertEquals(65,testPet.attributeSleepiness);
        assertEquals(65,testPet.attributeBathroom);
    }

    @Test
    public void testEats() {
        VirtualPet testPet = new VirtualPet();
        testPet.eats();
        assertEquals(0, testPet.attributeHunger);
    }

    @Test
    public void testDrinks() {
        VirtualPet testPet = new VirtualPet();
        testPet.drinks();
        assertEquals(0, testPet.attributeThirst);
    }

    @Test
    public void testPlays() {
        VirtualPet testPet = new VirtualPet();
        testPet.plays();
        assertEquals(10, testPet.attributeBoredom);
    }

    @Test
    public void testSleeps() {
        VirtualPet testPet = new VirtualPet();
        testPet.sleeps();
        assertEquals(0, testPet.attributeSleepiness);
    }

    @Test
    public void testPotties() {
        VirtualPet testPet = new VirtualPet();
        testPet.potties();
        assertEquals(0, testPet.attributeBathroom);
    }

    @Test
    public void threeEatsZeroHunger() {
        VirtualPet testPet = new VirtualPet();
        testPet.eats();
        testPet.eats();
        testPet.eats();
        assertEquals(0, testPet.attributeHunger);
    }

    @Test
    public void threeDrinksZeroThirst() {
        VirtualPet testPet = new VirtualPet();
        testPet.drinks();
        testPet.drinks();
        testPet.drinks();
        assertEquals(0, testPet.attributeThirst);
    }

    @Test
    public void threePlaysZeroBoredom() {
        VirtualPet testPet = new VirtualPet();
        testPet.plays();
        testPet.plays();
        testPet.plays();
        assertEquals(0, testPet.attributeBoredom);
    }

    @Test
    public void threeSleepsZeroSleepiness() {
        VirtualPet testPet = new VirtualPet();
        testPet.sleeps();
        testPet.sleeps();
        testPet.sleeps();
        assertEquals(0, testPet.attributeSleepiness);
    }

    @Test
    public void threePottiesZeroBathroom() {
        VirtualPet testPet = new VirtualPet();
        testPet.potties();
        testPet.potties();
        testPet.potties();
        assertEquals(0, testPet.attributeBathroom);
    }
}
