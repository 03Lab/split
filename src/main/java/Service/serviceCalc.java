package Service;

import Model.Calc;
import Model.Sum;
import Model.Unit;

public class serviceCalc {
    public static double[] execute(int originPrice, double[] priceratios){
        double sum = Sum.sumPriceRatio(priceratios);
        double[] priceunits = Unit.unitPrice(sum, priceratios);
        double[] prices = Calc.calculate(originPrice,priceunits);
        return prices;
    }
}
