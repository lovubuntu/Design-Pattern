/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package auction;

/**
 *
 * @author Prabhu
 */
public class Auction {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer("Mysore Maharaja chair",100000);
        Bidder bidder1 = new Bidder("Sheik",auctioneer);
        Bidder bidder2 = new Bidder("Dawood",auctioneer);
        Bidder bidder3 = new Bidder("Osama",auctioneer);
        Bidder bidder4 = new Bidder("Blade Pandy",auctioneer);
        Bidder bidder5 = new Bidder("Mafia",auctioneer);
        bidder1.setBidAmt(150000);
        bidder2.setBidAmt(150001);
        bidder3.setBidAmt(150002);
        bidder4.setBidAmt(150003);
        bidder5.setBidAmt(150004);
        //auctioneer.auctionAmtChanged();
        bidder3.leaveAuction();
        bidder2.leaveAuction();
        bidder1.leaveAuction();
        //auctioneer.auctionAmtChanged();
        bidder4.setBidAmt(250008);
        bidder5.leaveAuction();
        //auctioneer.auctionAmtChanged();
    }
}
