import java.util.ArrayList;
public class Run {
    public static void main(String[] args) {
       Deck dew = new Deck();
       ArrayList<Players> players = new ArrayList<>();

       Player finnigyatt = new Player("finnigyatt");
       //Player Kunk = new Player("Kunk");
       //Player Graham = new Player("Graham");
       //Player Mitta_Fowler = new Player("Mitta Fowler");
       Dealer Robert = new dealer();

       players.add(finnigyatt)


       boolean gameStat = true;
        while(gameStat)
        {
            Robert.clearHand();
          
            for(Player player : players)
            {
                player.clearHand();
                player.hit(deck);
                player.hit(deck);
            }
            
            Robert.hit(deck);
           
            for (int i = 0;i < players.size(); i ++)
            {
                players.get(i).getBet();
            }
            System.out.println("Dealer shows " + Robert.getHandValue());
            Robert.hit(deck);

            for (int i = 0;i < players.size(); i ++)
            {
                players.get(i).playTurn(deck);
            }

         
            
            Robert.dealerTurn(deck);
            int dealerHand = Robert.getHandValue();
            for (int i = 0;i < players.size(); i ++)
            {
                System.out.println("The dealer had "+ dealerHand);
                players.get(i).handleBet(dealerHand);
            }
        }
    }
    
}
        
    

