package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int a, b, c, d;
        a = number / 1000;
        b = (number % 1000) / 100;
        c = (number % 100) / 10;
        d = (number % 10);
        System.out.println(a + b + c + d);
    }
}
