public abstract class Stock implements Comparable<Stock>, StockInterface
{
    protected String symbol;
    protected int shares;
    protected double price;

    public Stock(String s, int sh, double p)
    {
        this.symbol = s;
        this.shares = sh;
        this.price = p;

    }// end constructor

    public String toString()
    {
        return "Symbol: " + symbol + "\n"
                + "Shares: " + shares + "\n"
                + "Price: " + price + "\n";
    }// end toString

    // put your compareTo here
    public int compareTo(Stock rhs)
    {
        if ((this.shares - rhs.shares) != 0)
            return this.shares - rhs.shares;

        else
            return this.symbol.compareTo(rhs.symbol);
    }// end compareTo

}// end class