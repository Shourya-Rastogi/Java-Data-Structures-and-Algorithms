package BinarySearch.BinarySearch1DArray;

public class FirstLastOccurence {
    static int firstOccurence(int[] nums, int target){
        int low=0;
        int high=nums.length -1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] ==target){
                first=mid;
                high=mid-1;
            }
            else if (nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return first;
    }
    static int lastOccurence(int[] nums,int target){
        int low=0;
        int high=nums.length -1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] ==target){
                last=mid;
                low=mid+1;
            }
            else if (nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return last;
    }
    static int[] firstlastoccurence2(int[] nums,int target){
        int first=firstOccurence(nums, target) ;
        if(first==-1) return new int[]{-1,-1};
        int last=lastOccurence(nums, target);
        return new int[]{first,last};

    }
    static int lowerBound(int[] arr,int target){
        int low=0, high= arr.length-1, ans= arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int upperBound(int[] arr,int target){
        int low=0, high= arr.length-1, ans= arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    static int[] firstlastoccurence(int[] nums,int target){
        int lb=lowerBound(nums,target);
        if(nums.length==0 || lb==nums.length || nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,target)-1};
    }

    static int countOccurences(int[] nums,int target){
        int[] occ=firstlastoccurence(nums,target);
        return (occ[1]-occ[0]+1);
    }
}
