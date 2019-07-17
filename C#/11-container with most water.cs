public class Solution
{
    public int MaxArea(int[] height)
    {
        int left = 0, right = height.Length - 1;
        int maxArea = 0;
        while (left < right && left >= 0 && right <= height.Length - 1)
        {
            maxArea = Math.Max(maxArea, Math.Min(height[left], height[right]) * (right - left));
            if (height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxArea;
    }
}
