public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.73;
        int m = 70;
        int bodyWeight = service.calculate(m, height);

        System.out.println(bodyWeight);
    }
}
