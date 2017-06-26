/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

/**
 *
 * @author Mohini
 */
public class ADD extends CharacterBasics{
    
    private String name = "ADD";
    private String characterClass = null;
    private String characterRarity = null;
    private boolean characterCharge = false;
    private int characterLevel = 0;
    private int manaCost = 0;
    private int health = 0;
    private int power = 0;
    private String info = null;

    @Override
    public String name() {
        return name;
    }

    @Override
    public String characterClass() {
        return characterClass;
    }

    @Override
    public String characterRarity() {
        return characterRarity;
    }

    @Override
    public boolean characterCharge() {
        return characterCharge;
    }

    @Override
    public int characterLevel() {
        return characterLevel;
    }

    @Override
    public int manaCost() {
        return manaCost;
    }

    @Override
    public int health() {
        return health;
    }

    @Override
    public int power() {
        return power;
    }

    @Override
    public String information() {
        return info;
    }
    
}
