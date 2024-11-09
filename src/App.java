//import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("how old are you?");
        int age = scanner.nextInt();
        System.out.println("what is your favorite food?");
        scanner.nextLine();
        String food = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        */

        /*double x=10;
        x=(double)x/3;
        System.out.println(x);
        */
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");


    }
}
