class Solution {
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int a=nums1.length;
    int b=nums2.length;
    int y[]=new int[a+b];
    int i=0,j=0,k=0;
    while(i<a && j<b)
    {
        if(nums1[i]<nums2[j])
        {
            y[k]=nums1[i];
            i++;
        }
        else
        {
            y[k]=nums2[j];
            j++;
        }
        k++;
    }
    while(i<a)
    {
        y[k]=nums1[i];
        i++;
        k++;
    }
    while(j<b)
    {
        y[k]=nums2[j];
        j++;
        k++;
    }
    if((a+b)%2!=0)
    {
        return y[(a+b)/2];
    }
    else
    {
        int x=(a+b)/2;
        double p=y[x];
        double q=y[x-1];
        return (p+q)/2.0;
    }
}
}

