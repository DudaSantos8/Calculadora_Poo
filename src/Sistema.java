import java.util.Scanner;

public class Sistema {
    private IO io;

    public Sistema(){
        io = new IO();
    }

    public  void menu() {
        System.out.println("Escolha uma operação:"+"\n 1 > soma"+"\n 2 > subtração"+"\n 3 > multiplicação"+"\n 4 > divisão");
        int resposta = new Scanner(System.in).nextInt();
        Calc calcular = new Calc();
        double resultado = 0;
        double valor1 = io.receberDados("Digite o primeiro valor: ");
        double valor2 = io.receberDados("Digite o segundo valor: ");
        if(resposta == 1){
            resultado = calcular.soma(valor1, valor2);
        }else if(resposta == 2){
            resultado = calcular.subtracao(valor1, valor2);
        }else if(resposta == 3){
            resultado = calcular.multiplicacao(valor1, valor2);
        }else if(resposta == 4){
            resultado = calcular.divisao(valor1, valor2);
        }
        io.exibirDados(resultado);
    }

    public void executar(){
        menu();
    }
}