public class finding _largest {

    public static void main(String[] args) {
        double[] numArray = { 21.4, -31.5, 89.0, 13.5, 55.5, 42.1, 5.7, -66.5 };
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %.2f", largest);
    }
}
