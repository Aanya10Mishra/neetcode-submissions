class Solution {
    public int trap(int[] height) {
        
        int l =0,
        r = height.length - 1;
        int l_max = height[l];
        int r_max = height[r];
        int water =0;
        while(l<r)
        {
            l_max = Math.max(l_max,height[l]);
            r_max = Math.max(r_max,height[r]);

            water += l_max<r_max? l_max-height[l++]:r_max - height[r--];

        }
        return water;
    }
}
