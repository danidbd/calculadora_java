import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Float numA, numB, mostrar;
        Scanner ler = new Scanner(System.in);
        System.out.println("entre com o primeiro numero: ");
        numA = ler.nextFloat();
        System.out.println("Entre com o segundo numero: ");
        numB = ler.nextFloat();
        Operador calcula = new Operador();
        mostrar = calcula.soma(numA, numB);
        System.out.println("A soma deu:"+mostrar);

    }
}