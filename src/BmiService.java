public class BmiService {

    public int calculate(int weight, double height) {
        double amountHeight = height * height;
        double bodyWeight = weight / amountHeight;

        return (int) bodyWeight;
    }
}
