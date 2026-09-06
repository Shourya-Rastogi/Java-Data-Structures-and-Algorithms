package LeetcodePractice;

public class AddBinary {
    static String addBinary(String a,String b){
        int aIndex=a.length()-1;
        int bIndex=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(aIndex>=0 && bIndex>=0){
            int sum=Character.getNumericValue(a.charAt(aIndex))+Character.getNumericValue(b.charAt(bIndex))+carry;
            carry=sum/2;
            sum=sum%2;
            res.append(sum);
            aIndex--;
            bIndex--;
        }
        while(aIndex>=0){
            int sum=Character.getNumericValue(a.charAt(aIndex))+carry;
            carry=sum/2;
            sum=sum%2;
            res.append(sum);
            aIndex--;
        }
        while(bIndex>=0){
            int sum=Character.getNumericValue(b.charAt(bIndex))+carry;
            carry=sum/2;
            sum=sum%2;
            res.append(sum);
            bIndex--;
        }
        if(carry==1){
            res.append(1);
        }
        return res.reverse().toString();
    }

    //Optimized Code
    public String addBinaryOptimal(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }
    static void main() {
        System.out.println(addBinary("101","11"));
    }
}
