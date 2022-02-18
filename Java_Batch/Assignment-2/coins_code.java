import java.lang.*;
import java.util.*;

class Coins{
    private int pennies;
    private int nickel;
    private int dimes;
    private int quarters;


    public Coins(int p, int n, int d, int q){
        pennies = p;
        nickel = n;
        dimes = d;
        quarters = q;
    }

    public int getPennies(){
        return pennies;
    }

    public int getNickels(){
        return nickel;
    }

    public int getDimes(){
        return dimes;
    }

    public int getQuarters(){
        return quarters;
    }

    public int findCentsValue(){
        int findCents;
        findCents = (int)((0.25*quarters)+(0.10 * dimes)+(0.05 * nickel) + (0.01 * pennies));
        return findCents;
    }

    public int findDollars(){
        int findDollar;
        // findDollar = (int)((0.25 * quarters) + (0.10 * dimes)
        // + (0.05 * nickel) + (0.01 * pennies));
        findDollar = (int)(findCentsValue() / 100.0);
        return findDollar;
    }

    public int findChange(){
        int change;
        int round = Math.round(findCentsValue());
        change = findCentsValue() - round;
        return change;
    }
}