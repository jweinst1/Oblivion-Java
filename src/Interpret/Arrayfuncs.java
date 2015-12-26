package Interpret;
import java.util.Random;

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
    //creates repeated range of a number
    public static int[] repeat(int elem, int length) {
        int[] numlst = new int[length];
        for(int i=0;i<length;i++) numlst[i] = elem;
        return numlst;
    }
}
