package com.example.split.service;

import java.util.ArrayList;
import java.util.List;

import com.example.split.beans.SplitPeople;

/**
 * 比率の合計を計算します.
 *
 * @param splitRateData 割り勘の比率データ
 * @return 比率の合計を返します.
 */

public class RateSum {
	
	public int CalcuateRateSum(List<SplitPeople> splitRateData) {
	    List<Integer> splitRates = new ArrayList<>();
	    int rateSum = 0;

	    for (SplitPeople split : splitRateData) {
	        int rate = split.getSplitRate();
	        splitRates.add(rate); // リストに格納
	        rateSum += rate; // 合計を計算
	    }

	    return rateSum;
	}

}
