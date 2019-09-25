public class Sportmaster {
    public static void main(String[] args) {
        int cumulativePurchases = 15000;
        int currentPurchase = 1500;
        int amountForBonus=currentPurchase/1000;
        int bonusStandard = amountForBonus * 50;
        int bonusSilver =amountForBonus * 70;
        int bonusGold = amountForBonus * 100;
        int limitForStandard= 15000;
        int limitForSilver=150_000;
        int bonusCurrent;
        if (cumulativePurchases <= limitForStandard) {
            bonusCurrent = bonusStandard;
        } else if (cumulativePurchases > limitForStandard && cumulativePurchases<= limitForSilver) {
            bonusCurrent = bonusSilver;
        } else {
            bonusCurrent = bonusGold;
        }
        System.out.println(bonusCurrent);
    }
}