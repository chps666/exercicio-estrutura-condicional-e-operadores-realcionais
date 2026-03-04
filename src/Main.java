import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros para comparacao de qual eh o maior:");
        double x = scan.nextDouble(),y = scan.nextDouble();

        if(x > y){
            System.out.println(x + "eh maior que " +  y);
        }else if(x == y){
            System.out.println("os numeros sao iguais");
        }else{
            System.out.println(y + "eh maior que" + x);
        }
    }
}