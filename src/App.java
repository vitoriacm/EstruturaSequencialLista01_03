import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Entradas 
        int primeiroNumero;
        int segundoNumero;

        Scanner teclado = new Scanner (System.in);
        System.out.print("Entre com o primeiro numero:");
        primeiroNumero = teclado.nextInt();
        System.out.println("");
        System.out.print("Entre com o segundo numero:");
        segundoNumero = teclado.nextInt();
        System.out.println("");
        teclado.close();
       // Processamento
       int soma = primeiroNumero + segundoNumero;

       // Saida 
       System.out.printf("A soma de %d mais %d é igual %d", primeiroNumero, segundoNumero,soma);

    }
}
