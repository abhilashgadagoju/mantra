import java.util.*;
class Reversestr {
    public static void Reversed(String str){
        String s[] = str.toLowerCase().split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            if(i==s.length-1){
                ans += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " "; 
            }else{
                ans += s[i] + " ";
            }
        } 
        System.out.println("Reversed String: " + ans); 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String str="";
        str=sc.nextLine();
        Reversed(str);
      
    }
}