package emailapp;
import java.util.Scanner;
public class EmailApp{
    public static void main(String[] args) {
        System.out.println("Enter your Name :");
        Scanner sc = new Scanner(System.in);
        
        Email em1 = new Email(sc.next(), sc.next());
        sc.close();

        System.out.println(em1.showinfo());
        //em1.setAlternateEmail("js@gmail.com");
        //System.out.println(em1.getAlternateEmail());
    }
}