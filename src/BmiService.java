public class BmiService {

    public int calculate(int weight, double height) {
        double amountHeight = height * 2;
        double bodyWeight = weight / amountHeight;

        return (int) bodyWeight;
    }
}
