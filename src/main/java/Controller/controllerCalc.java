package Controller;

import Service.serviceCalc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/controller")
public class controllerCalc {

    @GetMapping
    public static double[] execute(
            @RequestParam int originPrice,
            @RequestParam double[] ratios){
        double[] result = serviceCalc.execute(originPrice, ratios);
        return result;
    }
}
