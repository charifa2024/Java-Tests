import java.util.Scanner;
public class hypothenus {
public static void main(String [] args){
    double x,y,z;
    Scanner scanner=new Scanner(System.in);
    System.out.println("entrez la longueur de l\'adjacent : ");
    x= scanner.nextDouble();
    System.out.println("entrez la longueur de l\'oppose :");
    y=scanner.nextDouble();
    scanner.close();
    z=Math.sqrt(x*x+y*y);
    System.out.println("l\'oppose="+y+"\n adjacent="+x+"\n hypothenus="+z);

}
}
