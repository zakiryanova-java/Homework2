public class Sportmaster {
    public static void main(String[] args) {
        int cumulativePurchases = 15000;
        int currentPurchase = 1500;
        int amountForBonus=currentPurchase/1000;
        int limitForStandard= 15000;
        int limitForSilver=150_000;
        int bonusCurrent;
        if (cumulativePurchases <= limitForStandard) {
            bonusCurrent = amountForBonus * 50;
        } else if (cumulativePurchases > limitForStandard && cumulativePurchases<= limitForSilver) {
            bonusCurrent = amountForBonus * 70;
        } else {
            bonusCurrent = amountForBonus * 100;
        }
        System.out.println(bonusCurrent);
    }
}