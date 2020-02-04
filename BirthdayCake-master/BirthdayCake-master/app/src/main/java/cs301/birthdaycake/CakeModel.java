package cs301.birthdaycake;

public class CakeModel {
    public boolean lit = true;
    public int numCand = 2;
    public boolean frost = true;
    public boolean candles = true;
    public void getCandle(boolean newCandles) {
        this.candles = newCandles;

    }
}

