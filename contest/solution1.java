/**
 * solution1
 */
public class solution1 {

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
            int a = (purchaseAmount/ 10) * 10;

        // Larger multiple
        int b = a + 10;

        // Return of closest of two
        int c= (purchaseAmount - a < b - purchaseAmount) ? a : b;


        return 100-c;
    }
    public static void main(String[] args) {
        int purchaseAmount=15;
        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }
}