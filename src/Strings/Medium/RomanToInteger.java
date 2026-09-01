package Strings.Medium;

public class RomanToInteger {
    static  int romanToInt(String s) {
        int num=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='M'){
                if((i-1>=0) && (arr[i-1]=='C')) num+=800;
                else num+=1000;
            }
            else if(arr[i]=='D'){
                if((i-1>=0) && (arr[i-1]=='C')) num+=300;
                else num+=500;

            }
            else if(arr[i]=='C'){
                if((i-1>=0) && (arr[i-1]=='X')) num+=80;
                else num+=100;
            }
            else if(arr[i]=='L'){
                if((i-1>=0) && (arr[i-1]=='X')) num+=30;
                else num+=50;
            }
            else if(arr[i]=='X'){
                if((i-1>=0) && (arr[i-1]=='I')) num+=8;
                else num+=10;
            }
            else if(arr[i]=='V'){
                if((i-1>=0) && (arr[i-1]=='I')) num+=3;
                else num+=5;
            }
            else{
                num++;
            }
        }
        return num;
    }
}
