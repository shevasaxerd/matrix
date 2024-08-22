import services.MathService;
import services.MainService;
import models.Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathService mathService = new MathService();
        MainService mainService = new MainService(mathService);

        mainService.start();
    }
}
