package LeetcodePractice;

public class RestoreFinishingOrder {
    static boolean binarysearch(int[] arr,int num){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num) return true;
            else if(arr[mid]<num) low=mid+1;
            else high=mid-1;
        }
        return false;
    }

    static int[] restore(int[] order,int[] friends){
        int[] ans=new int[friends.length];
        int index=0;
        for(int i=0;i< order.length;i++){
            if(binarysearch(friends,order[i])){
                ans[index++]=order[i];
            }
        }
        return ans;
    }

    static void main() {
        int[] order={3,1,2,5,4,6};
        int[] friends={1,3,4};
        for (int i : restore(order, friends)) {
            System.out.print(i+" ");
        }


    }
}
