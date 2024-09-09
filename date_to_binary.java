import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    static public String convertDateToBinary(String date) {

     String year=converter(year(date));
     String month=converter(month(date));
     String day=converter(day(date));

     return year.concat("-").concat(month).concat("-").concat(day);
    }

   static String converter(int n) {
        String str="";
        while(n>0)
        {
            str=str.concat(String.valueOf(n%2));
            n=n/2;
        }
        StringBuffer change=new StringBuffer(str);
        change.reverse();
        return change.toString();
    }

    static int year(String date) {
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = num*10+Character.getNumericValue(date.charAt(i));
        }
        return num;
    }

    static int month(String date) {
        int num = 0;
        for (int i = 5; i < 7; i++) {
            num=num*10+Character.getNumericValue(date.charAt(i));
        }
        return num;
    }

    static int day(String date) {
        int num = 0;
        for (int i = 8; i < 10; i++) {
            num =num*10+Character.getNumericValue(date.charAt(i));
        }
        return num;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String date=br.readLine();

        System.out.println(convertDateToBinary(date));
    }
}