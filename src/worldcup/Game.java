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
    Field field;
    int size;
    ArrayList<Team> teams;
    
    public Game() {
        this.teams = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        int variableMethod;
        
        System.out.println("starting application");

        // Create Referee
        Referee referee = new Referee();

        // create players team A
        //TODO create 4 defender players for teamA  
        Goalkeeper goalkeeperA = new Goalkeeper();
        Defender defenderA1 = new Defender();
        Defender defenderA2 = new Defender();
        Defender defenderA3 = new Defender();
        Defender defenderA4 = new Defender();
              
        //TODO create midfielder players for teamA
        Midfielder midfielderA1 = new Midfielder();
        
        //TODO 2 forward players for teamA
        Forward forwardA1 = new Forward();
        Forward forwardA2 = new Forward();
        
        //TODO create coach team A
        Coach coachA = new Coach();
        
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
        Team teamA = new Team();  
        Team teamB = new Team();
        
        //TODO add players to teams
        teamA.addPlayer(goalkeeperA);
        teamA.addPlayer(defenderA1); teamA.addPlayer(defenderA2); teamA.addPlayer(defenderA3); teamA.addPlayer(defenderA4);
        teamA.addPlayer(midfielderA1);
        teamA.addPlayer(forwardA1); teamA.addPlayer(forwardA2);
        
        teamB.addPlayer(goalkeeperB);
        teamB.addPlayer(defenderB1); teamB.addPlayer(defenderB2); teamB.addPlayer(defenderB3); teamB.addPlayer(defenderB4);
        teamB.addPlayer(midfielderB1);
        teamB.addPlayer(forwardB1); teamB.addPlayer(forwardB2);
        
        //TODO add teams to match
        Game game = new Game();
        game.teams.add(teamA);
        game.teams.add(teamB);
        
        // start game
        game.startGame();
        // half time game
        game.halfTime();
        // end game
        game.endGame();
    }

    public void startGame() {
        System.out.println("Start the game");
    }
    public void halfTime() {
        System.out.println("Half time");
    }
    public void endGame() {
        System.out.println("End of the game");
    }

    
}
