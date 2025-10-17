import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private String name;
    private double money;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name)
    {
        this.name = name;
        this.money = 100;
    }

    public void playTurn(Deck deck)
    {
        placeBet();
        char hitStay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to hit or stay");
        hitStay = scanner.next().charAt(0);
        getstartingHand(deck);
        System.out.println("your hand is");
        boolean validInput = false;
        while (validInput=false) {
            if(hitStay.equals("h")){
                hit(deck);
                System.out.println("");
                System.out.println("");
                System.out.println();
                hitStay = scanner.next().charAt(0);

            }
            else if (hitStay=="s") {
                System.out.println("you stayed");
                System.out.println("your hand is");
                validInput = true;

                
            }
            else{
                System.out.println(:"invalid input");
            }
            
        }
        
    }

    public void hit()
    {
        
    }

    public int getHandValue()
    {
        for(int i = 0; i>hand.size();i++){
            if hand.get();
        }
        return 1;
    }

    public void getCard(Deck deck)
    {
        //do stuff
    }
    public void getstartingHand(Deck deck){
        for(int i = 0;i<2;i++){
            hand.add(deck.getTopCard());
            deck.discard(0);
        }
    }
    public int placeBet(){
        Scanner betScan = new Scanner(System.in);
        boolean validBet = false;
        double bet = 0;
        while (validBet==false){
            System.out.println("how much bet you make buddy");
            betScan.nextLine();
            if (bet>money) {
                System.out.println("no money dumbahhh");
                
            }
            else if(bet<0){
                System.out.println("enter amount pluh");
            }
            else{
                System.out.println("thx for bet buddy");
                validBet = true;
                
            }
            return bet;


        }
        
            
        }

    }
}