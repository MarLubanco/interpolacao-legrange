public class Main {

    public static void main(String[] args) {
        int x;
        int x0;
        int x1;
    }

    public void formula(int x, int x0, int x1, int x2) {
        int temp = x - x1;
        int temp2 = x - x2;

        int temp3 = x0 - x1;
        int temp4 = x0 - x2;

        double tempMult = temp * temp2;
        double tempMult2 = temp3 * temp4;

        double result = tempMult / tempMult2;
    }
}
