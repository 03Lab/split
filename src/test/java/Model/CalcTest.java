package Model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CalcTest {
    @Test
    public void testcalc(){
        int originPrice = 100000;
        double[] units = {1,2,3,4,5};
        double[] result = Calc.calculate(originPrice, units);
        System.out.println(Arrays.toString(result));
    }

}
