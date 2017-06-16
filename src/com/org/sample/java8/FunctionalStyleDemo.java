package com.org.sample.java8;

/**
 * Created by deepakvalechha on 04/06/17.
 */
public class FunctionalStyleDemo {
    private static final double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8};

    public static void main(String[] args) {

        /*Sales sales = new Sales(EXPECTED_SALES_JAN_TO_DEC);

        IncrementalCosts incrementalCosts = new IncrementalCosts(5.1, 0.15);

        FixedCosts fixedCosts = new FixedCosts(15);

        final Profit profit = new Profit(sales, incrementalCosts, fixedCosts);

        double total = 0.0;
        for (int i = 0; i < 12; i++) {
            total += profit.valueAt(i);
        }*/

        final FunctionOverTime sale = time -> EXPECTED_SALES_JAN_TO_DEC[time];

        final FunctionOverTime fixedCosts = time -> 0.15;

        final FunctionOverTime incrementalCosts = time -> 5.1 + 0.15  * time;

        final FunctionOverTime profit =
                time -> sale.valueAt(time) - (fixedCosts.valueAt(time) + incrementalCosts.valueAt(time));

        double total = 0.0;
        for (int i = 0; i <12 ; i++) {
          total += profit.valueAt(i);
        }

        System.out.println("Total profits for the year : " + total);
    }
}
