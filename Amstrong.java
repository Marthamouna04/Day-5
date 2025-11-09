public class Amstrong{
    public static void main(String[] args){
       int i = 153;
        if (i >= 100 && i <= 999){
            int temp = i;
            int sum = 0;
            while(i > 0 ){
                int rem = i % 10;
                sum += (rem*rem*rem);
                i /= 10;
            }

             System.out.println((temp == sum)? "Amstrong":"not Amstrong");
        }
    }
}