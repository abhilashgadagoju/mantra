import java.util.Scanner;
import java.util.Arrays;
class Compare{
    public static String compare_address(String string1, String string2){
        String str1[] = string1.replaceAll("\\s", "").split(",");
        String str2[] = string1.replaceAll("\\s", "").split(",");
        if (Arrays.equals(str1, str2)) {
            return "SAME";
        }
        else {
            return "NOT SAME";
        }


    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Address:");
        String str1="";
        str1=sc.nextLine();
        System.out.println("Enter second Address:");
        String str2="";
        str2=sc.nextLine();
        String result="";
        result=compare_address(str1,str2);
        System.out.println(result);
    }
}