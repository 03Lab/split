package com.example.split.service;

import java.util.List;

import com.example.split.beans.SplitPeople;
import com.example.split.beans.Total;

public class SplitResults {
    private final RateSum rateSumService = new RateSum(); // RateSumのインスタンス
    private final Total total = new Total();
    int payAmount = total.getTotal();

    /**
     * 各人の分割結果を計算する
     *
     * @param splitData 割り勘データのリスト
     * @return 各人の分割結果の配列
     */
    public int[] calculateSplitResults(List<SplitPeople> splitData) {

        // RateSumクラスで比率の合計を計算
        int rateSum = rateSumService.CalcuateRateSum(splitData);

        // 各人の分割結果を計算
        return splitData.stream()
                .mapToInt(data -> (int) Math.round((double) payAmount * (data.getSplitRate() / rateSum)))
                .toArray();
    }
}
