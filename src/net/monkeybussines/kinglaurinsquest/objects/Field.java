/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.monkeybussines.kinglaurinsquest.objects;

import java.util.ArrayList;

/**
 *
 * @author tom
 */
public class Field {
    
    /**
    * Type of field you get on
    * @author tom
    */
    public enum FieldType {
        normalField, equipmentField, eventField, witchField, waterField
    }
    private FieldType fieldType = FieldType.normalField;
    
    /**
    * Player on this field
    */
    private ArrayList<Player> player = new ArrayList<>();
    
    /**
    * Constuctor
     * @param fieldType Type of Field it should become
    */
    public Field(FieldType fieldType) {
        this.fieldType = fieldType;
    }
    
    /**
    * Adds a new player
     * @param player Player added on the current field
    */
    public void addPlayer(Player player) {
        this.player.add(player);
    }
    
    /**
    * Moves a player to another field
     * @param p The player that will be moved
     * @param nextField The Field where p will be moved
    */
    public void movePlayer(Player p, Field nextField) {
        if(this.player.contains(p)) {
            nextField.addPlayer(p);
            this.player.remove(p);
            //Can be executed on GameBoard(not shure now)
            nextField.fieldAction(p);
        }
    }
    
    /**
    * Depending on the Field the player/s is/are on somthing habbens 
    * to the player/s
     * @param current The Player that activates the Field
    */
    public void fieldAction(Player current) {
        switch(this.fieldType) {
            case normalField:
                break;
            case equipmentField:
                break;
            case eventField:
                break;
            case witchField:
                break;
        }
    }
}
