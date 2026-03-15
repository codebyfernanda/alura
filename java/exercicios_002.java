/*
EXERCÍCIOS: Aula 02
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

/*
EXERCÍCIOS DE FIXAÇÃO (JAVA): 
1- Crie um programa que realize a média de duas notas decimais e exiba o resultado.
 */

// ============================================================================
// --------------------------Média de Notas Decimais---------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

import java.util.Scanner; // Import necessário para ler dados do teclado

public class CalculoMedia {
    public static void main(String[] args) {
        // Objeto essencial (scanner) para ler a entrada do sistema
        Scanner leitura = new Scanner(System.in);

        System.out.println("--- Calculadora de Médias ---");

        // Pedindo as notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = leitura.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = leitura.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2) / 2;

        // Exibindo o resultado
        System.out.println("A média entre " + nota1 + " e " + nota2 + " é: " + media);

        // Fechando o scanner (boa prática)
        leitura.close();
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
2- Declare uma variável do tipo double e uma variável do tipo int. Faça o casting
da variável double para int e imprima o resultado.
*/

// ============================================================================
// ------------------------Treino de Casting de Variável-----------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

public class ExercicioCasting {
    public static void main(String[] args) {
        // Declaração das variáveis conforme o enunciado
        double valorDecimal = 15.99;
        int valorInteiro;

        // Realizando o casting (conversão explícita) => O (int) avisa ao Java que há ciência sobre a perda de precisão
        valorInteiro = (int) valorDecimal;

        // Imprimindo os resultados
        System.out.println("--- Demonstração de Casting ---");
        System.out.println("Valor original (double): " + valorDecimal);
        System.out.println("Valor após o casting (int): " + valorInteiro);
        
        System.out.println("\nNota: Observe que o Java não arredonda, ele apenas corta as casas decimais.");
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
3- Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
Atribua valores a essas variáveis e concatene-as em uma mensagem.
*/

// ============================================================================
// --------------------------------Concatenação--------------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

public class ExercicioConcatencao {
    public static void main(String[] args) {
        // Declarando uma variável do tipo char (para isso, lembrar de usar as aspas simples '')
        char inicial = 'F';

        // Declarando uma variável do tipo String (com aspas duplas "")
        String complemento = "ernanda";

        // Atribuindo valores e concatenando (ou seja, juntando) em uma única mensagem
        String nomeCompleto = inicial + complemento;
        String mensagemBoasVindas = "Olá, " + nomeCompleto + "! Seja bem-vinda ao curso de ADS no Mackenzie.";

        // Imprimindo o resultado
        System.out.println("--- Concatenação de Tipos ---");
        System.out.println("Caractere inicial: " + inicial);
        System.out.println("Resto do nome: " + complemento);
        System.out.println("Resultado final: " + mensagemBoasVindas);
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
4- Declare uma variável do tipo double precoProduto e uma variável do tipo int 
(quantidade). Calcule o valor total multiplicando o preço do produto pela 
quantidade e apresente o resultado em uma mensagem.
*/ 

// ============================================================================
// -----------------------------Preço de Produtos------------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

public class CalculoProduto {
    public static void main(String[] args) {
        // Declarando as variáveis
        double precoProduto = 29.99; // Preço unitário
        int quantidadeComprada = 3;

        // Calculando o do valor total
        double valorTotal = precoProduto * quantidadeComprada;

        // Exibindo o resultado em uma mensagem
        System.out.println("--- Resumo da Compra ---");
        System.out.println("Produto: Camiseta Mackenzie");
        System.out.println("Preço Unitário: R$ " + precoProduto);
        System.out.println("Quantidade: " + quantidadeComprada);
        System.out.println("------------------------");
        System.out.println("O valor total da compra é: R$ " + valorTotal);
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
5- Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares 
a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. 
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
*/

// ============================================================================
// -----------------------Conversão de Reais para Dólares----------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

public class ConversaoMoeda {
    public static void main(String[] args) {
        // Declarando a variável com o valor em dólares
        double valorEmDolares = 100.00;
        
        // Declarando a cotação fixa, conforme o enunciado
        double cotacaoDolar = 4.94;

        // Realizando a conversão
        double valorEmReais = valorEmDolares * cotacaoDolar;

        // Imprimindo o resultado formatado
        // %f é usado para números decimais, e .2 limita a duas casas decimais
        System.out.println("--- Conversor de Moedas ---");
        System.out.println(String.format("Valor em Dólar: US$ %.2f", valorEmDolares));
        System.out.println(String.format("Valor convertido para Real: R$ %.2f", valorEmReais));
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
6- Declare uma variável do tipo double precoOriginal. Atribua um valor em reais 
a essa variável, representando o preço original de um produto. Em seguida, declare 
uma variável do tipo double percentualDesconto e atribua um valor percentual de 
desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em 
reais, aplique-o ao preço original e imprima o novo preço com desconto.
*/

// ============================================================================
// -------------------------Desconto de Preço Original-------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

public class CalculoDesconto {
    public static void main(String[] args) {
        // Declarando as variáveis
        double precoOriginal = 250.00; // Valor em reais
        double percentualDesconto = 10.0; // Valor em % (ex: 10%)

        // Calculando o valor do desconto em reais
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;

        // Calculando o preço final com o desconto aplicado
        double precoComDesconto = precoOriginal - valorDesconto;

        // Exibindo os resultados
        System.out.println("--- Sistema de Desconto ---");
        System.out.println("Preço original do produto: R$ " + precoOriginal);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor economizado: R$ " + valorDesconto);
        System.out.println("---------------------------");
        System.out.println(String.format("Preço final a pagar: R$ %.2f", precoComDesconto));
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================
