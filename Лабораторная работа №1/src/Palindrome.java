import java.util.Scanner;
import java.util.Arrays;
public class Palindrome {
    public static void main(String[] args) {//определяет, являются ли введёные через консоль строки палиндромами
        Scanner console = new Scanner (System.in);
        String m = console.nextLine();
        char[] Nums = m.toCharArray();
        //for (int i = 0; i < Nums.length; i++) {
            if(isPalindrome(m)){
                System.out.println("Строка " + m + " является палиндромом");
            }
            else {
                System.out.println("Строка " + m + " не является палиндромом");
            }
        //}
    }
    public static String reverseString(String s){//переворачивает строку
        String rev = "";
        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static boolean isPalindrome(String s){//определяет, является ли строка палиндромом
        String rev= reverseString(s);
        if (s.equals(rev)){
            return true;
        }
        else {
            return false;
        }
    }
}