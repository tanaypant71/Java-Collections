public class highestWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0; // Initialize the wealth of the current customer

            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j]; // Add the money in each bank account to the customer's wealth
            }

            maxWealth = Math.max(maxWealth, customerWealth); // Update maxWealth if the current customer is richer
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        highestWealth wealthCalculator = new highestWealth();

        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int maxWealth1 = wealthCalculator.maximumWealth(accounts1);
        System.out.println("Max Wealth for Example 1: " + maxWealth1);

        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int maxWealth2 = wealthCalculator.maximumWealth(accounts2);
        System.out.println("Max Wealth for Example 2: " + maxWealth2);

        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int maxWealth3 = wealthCalculator.maximumWealth(accounts3);
        System.out.println("Max Wealth for Example 3: " + maxWealth3);
    }
}
