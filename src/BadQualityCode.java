


public class BadQualityCode {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println(a + b);
    }


    public static int Multiply(int x, int y) {
        int product = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                product += 1;
            }
        }
        return product;
    }

    public static void PrintNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

