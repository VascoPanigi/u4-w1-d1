import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your name");
        String firstName = sc.nextLine();
        System.out.println("Now insert your surname");
        String lastName = sc.nextLine();
        System.out.println("If your infos are correct, please type 'GABIBBO' ");
        String confirmation = sc.nextLine();
        System.out.println("You have inserted: " + firstName +  " " + lastName + " " + confirmation);
        System.out.println("You have inserted: " +  confirmation +  " " + lastName + " " + firstName);
        System.out.println(firstName.concat(lastName).concat(confirmation));

        sc.close();
        
    }

}
