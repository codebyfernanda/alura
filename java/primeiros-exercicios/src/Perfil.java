/*

EXERCÍCIO 1 - Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método >main<,
que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
/*

 */
import java.util.Scanner;

public class Perfil {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome:");

        String nome = leitura.nextLine();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Tudo bem?");

        leitura.close();
    }
}





