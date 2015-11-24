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
public class ResourceCard extends Card {

    public ResourceCard(String name, String description) {
        super(name, description);
    }

    /**
     * ResourceCards have no Effect
     * @param p Useless
     */
    @Override
    public void effect(Player p) {
    }
    
}
