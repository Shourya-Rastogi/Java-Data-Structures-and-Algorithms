package BitManipulation.Problems;

public class XORinGivenRange {
    int xor(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        return n;
    }
    int xorInRange(int l,int r){
        return xor(l-1)^xor(r);
    }
}
