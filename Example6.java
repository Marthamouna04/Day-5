public class Example6{
    public static void main(String[] args){
        int i = 1234566789;
        do{
            if(i%2 != 0){
                 System.out.println(i%10);
            }
            i /= 10;
            }while(i != 0);
    }
}