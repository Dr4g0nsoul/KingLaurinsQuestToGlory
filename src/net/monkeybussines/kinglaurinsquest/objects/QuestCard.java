/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.monkeybussines.kinglaurinsquest.objects;

/**
 *
 * @author tom
 */
public class QuestCard extends Card{

    public QuestCard(String name, String description) {
        super(name, description);
    }

    /**
     * Raise Players completed quests by 1 if completed
     * @param p The Player
     */
    @Override
    public void effect(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
