import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args){
        Scanner days =new Scanner(System.in);
        System.out.println((days.nextInt())* 1036800);
        //or
        /*
        * Scanner scanner= new Scanner(System.in);
        * int days =scanner.nextInt();
        * System.out.println(days*86400)
        * */
    }
}
