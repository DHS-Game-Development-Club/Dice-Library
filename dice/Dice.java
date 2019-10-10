package dice;
//@author redwa
public class Dice {
    public static int coin()  {
        return (int)(Math.random()*2 + 1);
    }
    public static int d4()  {
        return (int)(Math.random()*4 + 1);
    }
    public static int d6()  {
        return (int)(Math.random()*6 + 1);
    }
    public static int d8()  {
        return (int)(Math.random()*8 + 1);
    }
    public static int d10()  {
        return (int)(Math.random()*10 + 1);
    }
    public static int d12()  {
        return (int)(Math.random()*12 + 1);
    }
    public static int d20()  {
        return (int)(Math.random()*20 + 1);
    }
    public static int dX(int highNum)  {
        if (highNum < 1)
            return -1;
        return (int)(Math.random()*highNum + 1);
    }
    public static int range(int highVal, int lowVal)  {
        int range = highVal - lowVal;
        return (int)(Math.random()*range + lowVal);
    }
    public static int index(int highVal)  {
        return (int)(Math.random()*(highVal + 1));
    }
}
