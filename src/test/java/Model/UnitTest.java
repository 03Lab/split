package Model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UnitTest {
    @Test
    public void testUnit(){

        double sum = 10;
        double[] ratio = {12,2,3,4,5};
        /**
         * 関数の実行
         */
        double[] result = Unit.unitPrice(sum, ratio);

        System.out.println(Arrays.toString(result));
    }
}
