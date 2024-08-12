import java.util.Scanner;

public class IO {
        public double receberDados(String message){
            System.out.println(message);
            return new Scanner(System.in).nextDouble();
        }

        public void exibirDados(double result){
            System.out.println("O resultado da sua conta é: "+result);

        }
}
