package Interpret;

/**
 * Created by Josh on 12/25/15.
 * Class for implementing certain array functions
 */
public class Arrayfuncs {

    //creates range of integers
    public static int[] range(int stop) {
        int[] target = new int[stop];
        for(int i=0;i<stop;i++) target[i] = i;
        return target;
    }
}
