package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void testSum() {
        double[] array = {1, 2, 3, 4};  // 配列を定義
        double result = Sum.sumPriceRatio(array);  // 静的メソッドsumを呼び出し
        System.out.println(result);
        // 期待される結果と一致するか確認
        assertEquals(10, result, "合計が正しく計算されていません");
    }
}
