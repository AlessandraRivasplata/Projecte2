package worldcup;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author AdministradorCIFO
 */
public class Game {

    //TODO to uncomment when class Field is created
    //Field field;
    int size;
    ArrayList<Team> teams;

    public static void main(String[] args) {
        int variableMethod;
        
        System.out.println("starting application");

        // Create Referee
        Referee referee = new Referee();

        // create players team A
        Goalkeeper goalkeeperA = new Goalkeeper();
        Defender defender1 = new Defender();
        Defender defender2 = new Defender();
        Defender defender3 = new Defender();
        Defender defender4 = new Defender();
        Defender defender5 = new Defender();


        //TODO create 4 defender players for teamA                
        //TODO create midfielder players for teamA
        //TODO 2 forward players for teamA
        
        //TODO create coach team A
        
        
        // create players team B
        Goalkeeper goalkeeperB = new Goalkeeper();        
        
        //TODO create 4 defender players for teamB 
        Defender defenderB1 = new Defender();
        Defender defenderB2 = new Defender();
        Defender defenderB3 = new Defender();
        Defender defenderB4 = new Defender();
        
        //TODO create midfielder players for teamB
        Midfielder midfielderB1 = new Midfielder();
        
        //TODO 2 forward players for teamB
        Forward forwardB1 = new Forward();
        Forward forwardB2 = new Forward();
        
        //TODO create coach team B
        Coach coachB = new Coach();
        
        //TODO create teams
        //Team teamA = new Team();      
        //TODO add players to teams
        //teamA.add(player);
        //TODO add teams to match
        
        // start game
        // half time game
        // end game
    }

    public void start() {
        System.out.println("starting");
    }

    
}
