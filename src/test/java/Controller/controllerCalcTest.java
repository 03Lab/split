package Controller;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class controllerCalcTest {
    @Test
    public void controllertest(){
        // 引数の設定

        int originPrice = 10000;
        double[] ratios = {1,2,3,4,5};
        // メソッドの実行
        double[] result = controllerCalc.execute(originPrice, ratios);
        System.out.println(Arrays.toString(result));
    }
}
