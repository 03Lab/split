package Model;

public class Sum {
    /**
     *
     * @param priceratios(配列に格納された比)
     * @return 比の合計値
     */
    public static double sumPriceRatio(double[] priceratios) {
        double sum = 0;
        // 配列の総和を計算する。
        for (double priceratio : priceratios) {
            sum += priceratio;
        }
        return sum;
    }
}