package com.example.split.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.split.beans.SplitPeople;
import com.example.split.beans.Total;
import com.example.split.service.SplitResults;

@RestController
@RequestMapping("Constants.SPLITS")
public class SplitController {

    @Autowired
    private SplitResults splitResultsService;

    /**
     * 割り勘結果を計算して返します.
     *
     * @param payAmount 合計金額
     * @param splitData 割り勘データ（比率リスト）
     * @return 各人の分割結果
     */
    @PostMapping("/calculate")
    public int[] calculateSplitResults(
            @RequestParam int payAmount,
            @RequestBody List<SplitPeople> splitData) {

        // 合計金額をTotalクラスに設定
    	Total total = new Total();
        total.setTotal(payAmount);

        // 分割結果を計算
        return splitResultsService.calculateSplitResults(splitData);
    }
}
