class Solution {
    public int maxArea(int[] height) {
      int first = 0;    
      int last = height.length-1;
      int max = 0;
        
      while(first<last)
      {
          int area = (last-first)*Math.min(height[first],height[last]);
          if(area>max) max = area;
          if(height[last]>height[first])
          {
              first++;
          }
          else
          {
              last--;
          }
      }
        
        return max;
        
        
    }
}