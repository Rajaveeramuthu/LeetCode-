class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int total = 0;
        total += 7 * weeks * (weeks + 1) / 2 + 21 * weeks;
        for (int i = 0; i < days; i++) {
            total += (weeks + 1) + i;
        }

        return total;
    }
}
