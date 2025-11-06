package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] account = {
                {1,2,3},
                {3,2,1}
        };
        MaxWealth obj = new MaxWealth();
        int ans = obj.maximumWealth(account);
       System.out.println("Maximum Wealth: " + ans);

        System.out.println();
    }
    public int maximumWealth(int[][] accounts) {
//        for (int person = 0; person < accounts.length; person++) {
//            // when you start a new col, take a new sum for that row
//            for (int account = 0; account < accounts[person].length; account++) {
//
//            }

        // person  = rol
        // account = col
        int ans =  Integer.MIN_VALUE;
        for (int[] personAccounts : accounts ) {
            // when you start a new col, take a new sum for that row
            int sum  = 0;
            for (int account: personAccounts) {
                sum += account;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans =  sum;
            }
        }
        return ans;
        }

}
