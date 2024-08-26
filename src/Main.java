import services.MathServiceImpl;
import services.MainService;

public class Main {
    public static void main(String[] args) {
        MathServiceImpl mathServiceImpl = new MathServiceImpl();
        MainService mainService = new MainService(mathServiceImpl);

        mainService.start();
    }
}
