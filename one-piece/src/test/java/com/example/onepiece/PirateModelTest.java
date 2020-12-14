package com.example.onepiece;


import com.example.onepiece.models.Pirate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PirateModelTest {
    private Pirate pirate;

    @Before
    public void setUp(){
        pirate = new Pirate(1, "Super", "L", "Bob", 19, "Super Bob", "Weakling", "Super Pirates", 1000L, "N/A", "N/A", "N/A", "Alive");

    }

    @Test
    public void getPirateIdTest(){
        int expected = 1;
        int actual = pirate.getPirateId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPirateIdTest(){
        pirate.setPirateId(2);
        int expected = 2;
        int actual = pirate.getPirateId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest(){
        String expected = "Super";
        String actual = pirate.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest(){
        pirate.setLastName("Joe");
        String expected = "Joe";
        String actual = pirate.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMiddleInitialTest(){
        String expected = "L";
        String actual = pirate.getMiddleInitial();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setMiddleInitialTest(){
        pirate.setMiddleInitial("B");
        String expected = "B";
        String actual = pirate.getMiddleInitial();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirstName() {
        String expected = "Bob";
        String actual = pirate.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        pirate.setFirstName("Man");
        String expected = "Man";
        String actual = pirate.getFirstName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        int expected = 19;
        int actual = pirate.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge() {
        pirate.setAge(80);
        int expected = 80;
        int actual = pirate.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPirateName() {
        String expected = "Super Bob";
        String actual = pirate.getPirateName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setPirateName() {
        pirate.setPirateName("Bob Super");
        String expected = "Bob Super";
        String actual = pirate.getPirateName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPirateRank() {
        String expected = "Weakling";
        String actual = pirate.getPirateRank();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPirateRank() {
        pirate.setPirateRank("Useless");
        String expected = "Useless";
        String actual = pirate.getPirateRank();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPirateCrew() {
        String expected = "Super Pirates";
        String actual = pirate.getPirateCrew();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPirateCrew() {
        pirate.setPirateCrew("Bob Pirates");
        String expected = "Bob Pirates";
        String actual = pirate.getPirateCrew();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBounty() {
        long expected = 1000L;
        long actual = pirate.getBounty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBounty() {
        pirate.setBounty(0L);
        long expected = 0L;
        long actual = pirate.getBounty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDevilFruit() {
        String expected = "N/A";
        String actual = pirate.getDevilFruit();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDevilFruit() {
        pirate.setDevilFruit("Jacket Jacket no Mi");
        String expected = "Jacket Jacket no Mi";
        String actual = pirate.getDevilFruit();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDevilFruitAbility() {
        String expected = "N/A";
        String actual = pirate.getDevilFruitAbility();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDevilFruitAbility() {
        pirate.setDevilFruitAbility("Turns user into a Jacket");
        String expected = "Turns user into a Jacket";
        String actual = pirate.getDevilFruitAbility();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNonDevilFruitAbility() {
        String expected = "N/A";
        String actual = pirate.getNonDevilFruitAbility();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNonDevilFruitAbility() {
        pirate.setNonDevilFruitAbility("Fisticuffs");
        String expected = "Fisticuffs";
        String actual = pirate.getNonDevilFruitAbility();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStatus() {
        String expected = "Alive";
        String actual = pirate.getStatus();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setStatus() {
        pirate.setStatus("Deceased");
        String expected = "Deceased";
        String actual = pirate.getStatus();
        Assert.assertEquals(expected, actual);
    }

}
