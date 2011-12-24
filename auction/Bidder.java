/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package auction;

/**
 *
 * @author Prabhu
 */
public class Bidder implements Observer {
    private double myBidAmt;
    private String bidderName;
    private Auctioneer auctioneer;
    public Bidder(String bidderName,Auctioneer auctioneer)
    {
        this.bidderName = bidderName;
        this.auctioneer = auctioneer;
        auctioneer.addObserver(this);
    }
    public void setBidAmt(double myBidAmt)
    {
        this.myBidAmt = myBidAmt;
    }

    public void statusUpdate(Subject s) {
        System.out.println("Hi "+this.bidderName +", Status of the auction is:");
        System.out.println(auctioneer.getStatus());
    }
    public void leaveAuction()
    {
        auctioneer.removeObserver(this);
    }
    public String getName() {
        return bidderName;
    }
    public double myCurrentBid() {
        return myBidAmt;
    }
}
