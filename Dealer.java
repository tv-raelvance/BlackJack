public class Dealer extends Player
{
    public Dealer()
    {
        super("Robert");
    }
    
    
    
    public boolean isSoft(){
        int handValue =  0;
        int aces = 0;
        for(Card card : this.getHand()){
            handValue += card.getValue();
            if(card.getFace().equals("A")){
                aces ++;

            }
            while(handValue > 21 && aces > 0){
                return false;
            }


        }
        return true;

    }
    public void dealerPlayTurn(Deck deck){
        int handValue = this.getHandValue();
        if( handValue == 21){
            System.out.println("the dealer has 21, you lost unistall buddy");
        }
        else if (handValue >= 17) {
            if(isSoft()){
                hit(deck);
            }
            
        }
        else if (handValue < 17){
            hit(deck);
        }
        System.out.println("dealer hand is"+this.getHand());

    }

}
    