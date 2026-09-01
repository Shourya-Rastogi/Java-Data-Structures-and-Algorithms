package ArrayDSA.Hard;

public class RepeatedandMissingNumber {
    static int[] bruteforce(int[] arr){
        int n=arr.length;
        int missing=-1;
        int repeating=-1;
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i) cnt++;
            }
            if(cnt==2) repeating=i;
            else if (cnt==0) missing=i;
            if(missing !=-1 && repeating!=-1) break;
        }
        return new int[]{repeating,missing};
    }
    static int[] better(int[] arr){
        int n= arr.length;
        int[] hash=new int[n+1];
        for (int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int repeating=-1;
        int missing=-1;
        for (int i=1;i<=n;i++){
            if(hash[i]==2) repeating=i;
            else if (hash[i]==0) missing=i;
            if(missing !=-1 && repeating!=-1) break;
        }
        return new int[]{repeating,missing};
    }
    //Using Maths
    static int[] optimal1(int[] arr){
        int n= arr.length;
        long s=0;
        long s2=0;
        long sn=((long) n *(n+1))/2;
        long s2n=((long)n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+= (long) arr[i] *arr[i];
        }
        long val1=s-sn; //x-y
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        return new int[]{(int) x,(int) y};
    }
    //Using XOR
    static int[] optimal2(int[] arr){
        int n= arr.length;
        int xr=0;
        for (int i=0;i<n;i++){
            xr^=arr[i];
            xr^=(i+1);
        }
        int bitNo=0;
        while(true){
            if((xr^(1<<bitNo))!=0) break;
            bitNo++;
        }
        int zero=0;
        int one=1;
        for(int i=0;i<n;i++){
            //part of 1 club
            if((arr[i]&(1<<bitNo))!=0) one^=arr[i];
            //zero club
            else zero^=arr[i];
        }
        for(int i=1;i<=n;i++){
            //part of 1 club
            if((i&(1<<bitNo))!=0) one^=i;
                //zero club
            else zero^=i;
        }
        int cnt=0;
        for (int i=0;i<n;i++){
            if(arr[i]==zero) cnt++;
        }
        if (cnt==2) return new int[]{zero,one};
        return new int[]{one,zero};
    }

    public static void main(String[] args) {
        int[] arr={4,3,1,2,1,6};
        int[] sol = optimal1(arr);
        int repeating=sol[0];
        System.out.println(repeating);
        int missing=sol[1];
        System.out.println(missing);
    }
}
