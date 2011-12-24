package auction;
public interface Observer
{
    public void statusUpdate(Subject s);
    public String getName();
    public double myCurrentBid();
    public void leaveAuction();
}
