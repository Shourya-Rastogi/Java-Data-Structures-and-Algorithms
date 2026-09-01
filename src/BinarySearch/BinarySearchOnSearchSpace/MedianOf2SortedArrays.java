package BinarySearch.BinarySearchOnSearchSpace;

public class MedianOf2SortedArrays {
    double bruteforce(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int n=n1+n2;
        int[] arr=new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(j<n1&&k<n2){
            if(arr1[j]<arr2[k]) arr[i++]=arr1[j++];
            else arr[i++]=arr2[k++];
        }
        while(j<n1) arr[i++]=arr1[j++];
        while(k<n2) arr[i++]=arr2[k++];
        if(n%2==1) return arr[n/2];
        else return (double) (arr[n / 2] + arr[(n / 2) - 1]) /2;
    }

    double better(int[] arr1,int[] arr2){
        int n1= arr1.length;
        int n2= arr2.length;
        int n=n1+n2;
        int idx2=n/2;
        int idx1=idx2-1;
        int i=0;
        int j=0;
        int idx1el=-1;
        int idx2el=-1;
        int cnt=0;
        while(i<n1 &&j<n2){
            if (arr1[i]<arr2[j]){
                if (cnt==idx1) idx1el=arr1[i];
                if (cnt==idx2) idx2el=arr1[i];
                cnt++;
                i++;
            }
            else{
                if (cnt==idx1) idx1el=arr2[j];
                if (cnt==idx2) idx2el=arr2[j];
                cnt++;
                j++;
            }
            if (idx1el!=-1 &&idx2el!=-1) break;
        }
        while(i<n1){
            if (cnt==idx1) idx1el=arr1[i];
            if (cnt==idx2) idx2el=arr1[i];
            cnt++;
            i++;
            if (idx1el!=-1 &&idx2el!=-1) break;
        }
        while(j<n2){
            if (cnt==idx1) idx1el=arr2[j];
            if (cnt==idx2) idx2el=arr2[j];
            cnt++;
            j++;
            if (idx1el!=-1 &&idx2el!=-1) break;
        }
        if(n%2==1) return idx2el;
        else return (double) (idx2el + idx1el) /2;
    }

    double optimal(int[] nums1,int[] nums2){
        int n1= nums1.length;
        int n2= nums2.length;
        if(n1>n2) return optimal(nums2,nums1);
        int low=0;
        int high=n1;
        int left=(n1+n2+1)/2;
        int n=n1+n2;
        while(low<=high){
            int mid1=(low+high)>>1;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];
            if(l1<=r2 &&l2<=r1){
                if(n%2==1) return Integer.max(l1,l2);
                else return (double)(Integer.max(l1,l2)+Integer.min(r1,r2))/2;
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
    }
}
