/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 * 
 * Created by Albert Levin
 * Date Modified: 11/20/18
 */
public class Vendor
{
    // Fields:
    private int localPrice, items, deposit, vChange;

    /**
     * Constructs a Vendor
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int vPrice, int Stock)
    {
        localPrice = vPrice;
        items = Stock;
    }

    /**
     * Sets the quantity of items in stock.
     * @param qty number of items to place in stock (int)
     */
    public void setStock(int newStock)
    {
        items = newStock;
    }

    /**
     * Returns the number of items currently in stock.
     * @return number of items currently in stock (int)
     */
    public int getStock()
    {
        return items;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int cents)
    {
        deposit += cents;
    }

    /**
     * Returns the currently deposited amount (in cents).
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit()
    {
        return deposit;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale()
    {
        if((items > 0) && (deposit >= localPrice))
        {
            items--;
            vChange = deposit - localPrice;
            deposit = 0;
            return true;
        }
        else {
            vChange = deposit;
            deposit = 0;
            return false;
        }
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     * @return number of cents in the current change (int)
     */
    public int getChange()
    {
        int tChange = vChange;
        vChange = 0;
        return tChange;
    }
}
