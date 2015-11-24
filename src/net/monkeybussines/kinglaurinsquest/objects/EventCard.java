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
public class EventCard extends Card {

    public EventCard(String name, String description) {
        super(name, description);
    }

    /**
     * Effects for EffectCards are implemented here
     * Method should be summoned every time a player gets on an EventField
     * @param p The player on whom the effect will be executed
     */
    @Override
    public void effect(Player p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Like the method above but you can affect more then one player
     * @param players The first player needs to be the one who summons the effect
     */
    public void effectMorePlayers(Player... players) {
        
    }
    
}
