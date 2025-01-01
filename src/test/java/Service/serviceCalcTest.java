package Service;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class serviceCalcTest {
    @Test
    public void testService(){
        // 引数の設定
        int originPrice = 10000;
        double[] priceratios ={1,2,3,4,5};
        // メソッドの実行
        double[] result = serviceCalc.execute(originPrice, priceratios);
        System.out.println(Arrays.toString(result));

    }
}
