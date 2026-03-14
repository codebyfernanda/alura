/*
EXERCÍCIO: Aula 02
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. 
Utilize variáveis para representar os valores das temperaturas e imprima no console
o valor convertido de Celsius para Fahrenheit. Dica: A fórmula para converter 
temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32. Depois 
de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma
variável inteira para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se
que provavelmente você precisará fazer um casting de valores.
 */

// ============================================================================
// --------------------------Conversão de Temperatura--------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite aqui a temperatura de hoje em Celsius (ºC): ");

        double temperaturaEmCelsius = leitor.nextDouble();

        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        System.out.println("A temperatura de hoje é: " + temperaturaEmFahrenheit + "ºF");

        int temperaturaInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura aproximada (inteira) é: " + temperaturaInteira + "ºF");

        leitor.close();
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================
