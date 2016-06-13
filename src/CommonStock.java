/**
 * Created by william on 6/12/16.
 */
public class CommonStock extends Stock {
    public CommonStock(String s, int i, double v) {
        super(s, i,v);
    }

    public double calcDividend()
    {
        return 0;

    }// end calcDividend

    public String toString()
    {
        return super.toString() + "Dividend: " + calcDividend();
    }// end toString
}
