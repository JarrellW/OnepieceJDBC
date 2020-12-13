package com.example.onepiece.models;

import javax.persistence.*;


@Entity
@Table
public class Pirate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pirateId;
    private String lastName;
    private String middleInitial;
    private String firstName;
    private int age;
    private String pirateName;
    private String pirateRank;
    private String pirateCrew;
    private Long bounty;
    private String devilFruit;
    private String devilFruitAbility;
    private String nonDevilFruitAbility;
    private String status;

    public Pirate(){

    }
    public  Pirate(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;

    }
    public Pirate(String lastName, String middleInitial, String firstName){
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.firstName = firstName;

    }

    public int getPirateId() {
        return pirateId;
    }

    public void setPirateId(int pirateId) {
        this.pirateId = pirateId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPirateName() {
        return pirateName;
    }

    public void setPirateName(String pirateName) {
        this.pirateName = pirateName;
    }

    public String getPirateRank() {
        return pirateRank;
    }

    public void setPirateRank(String pirateRank) {
        this.pirateRank = pirateRank;
    }

    public String getPirateCrew() {
        return pirateCrew;
    }

    public void setPirateCrew(String pirateCrew) {
        this.pirateCrew = pirateCrew;
    }

    public Long getBounty() {
        return bounty;
    }

    public void setBounty(Long bounty) {
        this.bounty = bounty;
    }

    public String getDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(String devilFruit) {
        this.devilFruit = devilFruit;
    }

    public String getDevilFruitAbility() {
        return devilFruitAbility;
    }

    public void setDevilFruitAbility(String devilFruitAbility) {
        this.devilFruitAbility = devilFruitAbility;
    }

    public String getNonDevilFruitAbility() {
        return nonDevilFruitAbility;
    }

    public void setNonDevilFruitAbility(String nonDevilFruitAbility) {
        this.nonDevilFruitAbility = nonDevilFruitAbility;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

