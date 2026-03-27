class Solution {
    public int trap(int[] height) {
        int maxLeft = height[0], maxRight = height[height.length-1];
        int left = 0, right = height.length - 2, ans = 0;
        while (left <= right) {
            if (maxLeft < maxRight) {
                if (height[left] >= maxLeft)
                    maxLeft = height[left];
                else
                    ans += maxLeft - height[left];
                left ++;
            } else {
                if (height[right] > maxRight)
                    maxRight = height[right];
                else
                    ans += maxRight - height[right];
                right --;
            }
        }
        return ans;
    }
}