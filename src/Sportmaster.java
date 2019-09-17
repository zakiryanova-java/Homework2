public class Sportmaster {
    public static void main(String[] args) {
        int cumulativeSum = 15500;
        int currentSum = 1500;
        int bonus = currentSum / 1000;
        if (cumulativeSum < 15001) {
            bonus = bonus * 50;
        } else if (cumulativeSum > 15000 && cumulativeSum < 150_001) {
            bonus = bonus * 70;
        } else {
            bonus = bonus * 100;
        }
        System.out.println(bonus);
    }
}