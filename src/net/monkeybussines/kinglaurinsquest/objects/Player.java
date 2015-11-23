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
public class Player {
    
    private ArrayList<Card> cards;
    private String name;
    private ArrayList<Card> battlingCards = new ArrayList<>();
    private int voteCount = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getVoteCount() {
        return voteCount;
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public ArrayList<EquipmentCard> getEquipmentCards() {
        ArrayList<EquipmentCard> ret = new ArrayList();
        for (Card card : cards) {
            if (card instanceof EquipmentCard) {
                ret.add((EquipmentCard) card);
            }
        }
        return ret;
    }
    
    public ArrayList<EventCard> getEventCards() {
        ArrayList<EventCard> ret = new ArrayList();
        for (Card card : cards) {
            if (card instanceof EventCard) {
                ret.add((EventCard) card);
            }
        }
        return ret;
    }
    
    public ArrayList<QuestCard> getQuestCards() {
        ArrayList<QuestCard> ret = new ArrayList();
        for (Card card : cards) {
            if (card instanceof QuestCard) {
                ret.add((QuestCard) card);
            }
        }
        return ret;
    }
    
    public ArrayList<ResourceCard> getResourceCards() {
        ArrayList<ResourceCard> ret = new ArrayList();
        for (Card card : cards) {
            if (card instanceof ResourceCard) {
                ret.add((ResourceCard) card);
            }
        }
        return ret;
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    /**
     * Fight another player
     * The winner gets a card from the looser
     * @param p the enemy player
     */
    public void fight(Player p) {
        //TODO: Let the player and opponent select the battlecards
        //TODO: Count Votes
        if(getVoteCount()>p.getVoteCount())
            stealRessource(p);
        else
            p.stealRessource(this);
        resetVoteCount();
        p.resetVoteCount();
    }
    
    public void stealRessource(Player p) {
        
    }
    
    /**
     * Moves the cards you for battling
     * at the end the cards will be removed
     * @param swappingCards
     */
    public void toBattleCards(ArrayList<Card> swappingCards) {
        for(int i = 0; i<swappingCards.size(); i++) {
            battlingCards.add(swappingCards.get(i));
            cards.remove(swappingCards.get(i));
        }
    }
    
    public void vote(){
        voteCount++;
    }
    
    public void resetVoteCount() {
        voteCount=0;
    }
    
}
