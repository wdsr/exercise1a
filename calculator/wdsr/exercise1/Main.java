package wdsr.exercise1;

import wdsr.exercise1.logic.Calculator;
import wdsr.exercise1.conversions.ArrayConverter;

/**
 * Created by Marek on 14.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided");
            return;
        }
        Calculator calculator = new Calculator();
        int[] nums = new ArrayConverter().convertToInts(args);
        System.out.println("Min="+calculator.min(nums));
        System.out.println("Max="+calculator.max(nums));
    }
}
