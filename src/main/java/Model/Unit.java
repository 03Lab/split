package Model;

public class Unit {
    /**
     *
     * @param sumprice(比の合計値)
     * @param priceratios(それぞれの比)
     * @return 比/合計を配列に格納したもの。
     */
    public static double[] unitPrice(double sumprice, double[] priceratios){
        double[] priceunits = new double[priceratios.length];
        //　比/合計を計算し、配列に格納
        for (int i = 0; i < priceratios.length; i++) {
            priceunits[i] = priceratios[i] / sumprice;
        }
        return priceunits;
    }
}
