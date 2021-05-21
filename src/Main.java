public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.72;
        double weight = 75.3;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
