package BitManipulation.BitFundamentals;

public class PowerOf2 {
    boolean isPower(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }
}
