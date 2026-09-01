package LeetcodePractice;

public class MostWaterContainer {
    static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        while(i<=j){
            int area= Math.min(height[i],height[j])*(j-i);
            maxarea=Math.max(area,maxarea);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return maxarea;
    }

    static void main() {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
