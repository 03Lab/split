package Controller;

import Service.serviceCalc;

public class controllerCalc {
    public static double[] execute(int originPrice, double[] ratios){
        double[] result = serviceCalc.execute(originPrice, ratios);
        return result;
    }
}
