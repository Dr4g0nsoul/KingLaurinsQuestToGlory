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
public class BoardField {
    
    public enum FieldType {
        normalField, equipmentField, eventField, witchField, waterField
    }
    
    private FieldType fieldType = FieldType.normalField;
    private ArrayList<Player> player = new ArrayList<>();
    
    public BoardField(FieldType fieldType) {
        this.fieldType = fieldType;
    }
    
    public void addPlayer(Player player) {
        this.player.add(player);
        fieldAction(player);
    }
    
    public void movePlayer(Player p, BoardField nextField) {
        if(this.player.contains(p)) {
            nextField.addPlayer(p);
            this.player.remove(p);
        }
    }
    
    
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
