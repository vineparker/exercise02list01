import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // declaração da variável resultado
    int resultado; 

    // mensagem inicial
    String textoInicio = "Digite um número inteiro: ";
    System.out.print(textoInicio);

    // ler entrada do usuário
    Scanner input = new Scanner(System.in);
    resultado = input.nextInt();

    // mostrar o número digitado
    System.out.println("O número informado foi " + resultado);

    input.close();
  }
}





