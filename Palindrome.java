public class Palindrome{
    public static void main(String[] args){
        int num = 121;
        int temp = num;
        int rev = 0;
        while(num != 0) {
            rev = rev*10+(num%10);
            num= num/10;
        }
        if (temp == rev) {
            System.out.println(temp + " is a Palindrome number.");
        } else {
            System.out.println(temp + " is not a Palindrome number.");
        }
        
    }
}