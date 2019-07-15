class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) 
            return false;
        int temp = x;
        int len = 0;
        while (temp != 0) {
            temp /= 10;
            len ++;
        }
        temp = x;
        int left, right;
        for (int i = 0; i < len / 2; i++) {
            right = temp % 10;
            left = temp / (int) Math.pow(10, len - 2 * i - 1);
            left = left % 10;
            if (left != right)
                return  false;
            temp /= 10;
        }
        return true;
    }
}
