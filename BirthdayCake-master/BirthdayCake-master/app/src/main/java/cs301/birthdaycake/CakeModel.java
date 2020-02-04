package cs301.birthdaycake;

public class CakeModel {
    public boolean lit;
    public int numCand;
    public boolean frost;
    public boolean candles;

    public CakeModel(){
        lit = true;
        numCand = 2;
        frost = true;
        candles = true;
    }
    public boolean getLit() {
        return lit;
    }
    public int getNumCand(){
        return numCand;
    }
    public boolean getFrost(){
        return frost;
    }
    public boolean getCandles(){
        return candles;
    }
}

