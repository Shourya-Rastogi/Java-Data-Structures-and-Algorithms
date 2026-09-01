package BinarySearch.BinarySearchOnSearchSpace;

public class NthRoot {
    static int root(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int midN=power(mid,n,m);
            if(midN==m) return mid;
            else if(midN<m) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    static int power(int mid,int n,int m){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }
}
