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
        int handValue = getHandValue();
        Scanner scanner = new Scanner(System.in);
        int turn = 1;
        boolean turns = true;
        while(turns == true){
            hand = getHand();
            System.out.println(hand);
            if(handValue > 21){
                turns = false;
                break;
            }
            else if(handValue == 21){
                System.out.println("You got 21 you won"+name);
                turns = false;
                break;
            }
            system.out.println(name+"you wanna hit(h) or stand(s)");
            String Choice = scanner.nextLine();
            if(Choice.equals("h")){
                hit(deck);
                handValue = getstartingHand();
                if(handValue > 21){
                    system.out.println(name+"you busted buddy");
                    break;
                }
            }
            else if(Choice.equals("s")){
                turns = false;
                break;
            }
            turn ++;
        }
        return turn;
    }

    public void hit(Deck deck)
    {
        hand.add(deck.getTopCard());
    }

    public int getHandValue()
    {
        int handValue = 0;
        int aces = 0;
        for (Card card : this.hand)
        {
            handVal += card.getValue();
            if(card.getFace().equals("A"))
            {
                aces++;
            }
            while(handVal >21 && aces >0)
            {
                handVal -= 10;
                aces--;
            }
        }
        return handVal;
    }

    public void getCard(Deck deck)
    {
        hand.add(deck.getTopCard());
    }
    public void getstartingHand(Deck deck){
        for(int i = 0;i<2;i++){
            hand.add(deck.getTopCard());
            deck.discard(0);
        }
    }
    public void handleBet(int dealerHand)
    {
        int playerHand = getHandValue();
     if (dealerHand >21 && playerHand <21){
        System.out.println(name+" the dealer busted and you won " + bet *2 + " dollars");
        money = money + (2* this.bet);
     }
     else if (dealerHand == playerHand){
        System.out.println(name+" dealer got the same card amount u js get ur money back");

     }
     else if(playerHand == 21){
        System.out.println(name + "you got 21 and won " + bet * 2 + " dollars");
        money = money + (2*bet);
     }
     else if (dealerHand > playerHand && dealerHand <= 21){
        System.out.println("dealer has a better hand than you u lost "+name);
        money = money - bet;
     }
     else if (playerHand > dealerHand && playerHand <= 21){
        System.out.println(name+" you finally beat the dealer " + bet *2 + " dollars");
        money = money + (2*bet);
     }
        
    }
    public void clearHand(){
        this.hand = new ArrayList<Card>();
    }
    public double placeBet(){
        boolean betting = true;
        if (this.money == 0)
        {
            System.out.println(name + ", you dont have any money");
            betting = false;
        }
        while (betting)
        {
            System.out.println("name + " how much would you like to bet you have " + money + " dollars");
            Scanner scanner = new Scanner(System.in);
            double bet = scanner.nextDouble();
            scanner.nextLine();
            
            if (bet > money)
            {
                System.out.println("You cant bet more than you have bud");
                
            }
            else if (bet <= 0)
            {
                System.out.println("You cant bet nothing dumb dumb");
            }
            else
            {
               this.bet = bet;
               betting = false;
            }
        }
        return bet;


    }
        
            
        }

        public ArrayList<Card> getHand(){
            for (Card card : this.hand)
        {
            if(card.getClass().equals("Hearts") || card.getClass().equals("Diamonds"))
            {   
            }
        }
        return this.hand;
    }
        }

    }
