public class BmiService {
    public static double calculate(double weight, double height) {
        int bmi = (int) (weight / Math.pow(height, 2) * 10);
        return (double) bmi/10;
    }
}
