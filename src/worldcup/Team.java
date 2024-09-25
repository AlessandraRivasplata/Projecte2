/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldcup;

import java.util.ArrayList;

/**
 *
 * @author AdministradorCIFO
 */

public class Team {
    String name;
    ArrayList<Player> players;

    // Constructor que inicializa el ArrayList de jugadores
    public Team() {
        this.players = new ArrayList<>(); // Inicializa el ArrayList de jugadores
    }

    public void play() {
        System.out.println("playing");
    }

    public void attack() {
        System.out.println("attacking");
    }

    public void addPlayer(Player player) {
        players.add(player); // Ya no dará NullPointerException
    }
}

