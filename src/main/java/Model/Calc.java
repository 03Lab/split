package Model;

public class Calc {
    public static double[] calculate(int originPrice, double[] priceunits){
        double[] prices = new double[priceunits.length];

        for (int i = 0; i < priceunits.length ; i++) {
            prices[i] = originPrice * priceunits[i];
        }

        return prices;
    }
}
