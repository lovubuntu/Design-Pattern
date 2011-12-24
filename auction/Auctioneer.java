package auction;
import java.util.ArrayList;
public class Auctioneer implements Subject,AuctionFunctions
{
   private ArrayList observers;
   private String    auctionItem;
   private String    auctionStatus;
   private double    highestBid;
   public Auctioneer(String itemName,double highestBid)
   {
       observers       = new ArrayList();
       auctionItem     = itemName;
       auctionStatus   = "Auction in Progress: ";
       this.highestBid = highestBid;
   }
   public void addObserver(Observer o)
   {
       observers.add(o);
       System.out.println("A new Bidder " + o.getName() +
               " has joined the auction");
   }
   public void removeObserver(Observer o)
   {
       int index = observers.indexOf(o);
       if(index >= 0)
       {
          System.out.println("The bidder who feels too costly " +
                  "for " + auctionItem + " is " +o.getName());
          observers.remove(index);
       }
   }
   public void notifyObservers()
   {
       Observer observer;
       for(int i=0; i<observers.size(); i++)
       {
            observer = (Observer)observers.get(i);
            observer.statusUpdate(this);
       }
   }
   public Observer findHighestBid()
   {
       int leaderIndex   = 0;
       for(int i=0;i<observers.size();i++)
       {
           leaderIndex   = checkForHighestBid(i,leaderIndex);
       }
       return (Observer)observers.get(leaderIndex);
   }
   public int checkForHighestBid(int index,int leaderIndex)
   {
       Observer bidder = (Observer)observers.get(index);
       double   bidAmt = bidder.myCurrentBid();
       if(highestBid < bidAmt)
       {
            highestBid    = bidAmt;
            auctionStatus = "Highest Bidder "+bidder.getName();
            leaderIndex   = observers.indexOf(bidder);
       }
       return leaderIndex;
   }
   public void auctionAmtChanged()
   {
       Observer observer = findHighestBid();
       if(observers.size()==1)
       {
           auctionStatus    = "Auction Over: Winner "+observer.getName();
       }
       notifyObservers();
   }
   public String getStatus()
   {
       return auctionStatus;
   }
   public double getMaxBid()
   {
       return highestBid;
   }
}