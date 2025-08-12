package Range_2438;

public class LC11_ContainerWithMostWater {
    public static void main(String[] args) {
        LC11_ContainerWithMostWater containerWithMostWater = new LC11_ContainerWithMostWater();
        int maxArea = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(maxArea);
    }
    public int maxArea(int[] height) {
        int left = 0;
        int right =( height.length - 1);

        int result = 0;

        while (left < right) {
            int diff = right - left;
            int area = Math.min(height[left], height[right]);
            result = Math.max(result, diff * area);
            if(height[left] < height[right]) {
                left++;
            }else right--;
        }
        return result;
    }
}
