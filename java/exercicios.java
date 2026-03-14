/*
EXERCÍCIO 1 - Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, 
com o método >main<, que ao executar deverá imprimir um cumprimento personalizado no 
console. Por exemplo, "Olá, [Seu Nome]!". Modifique o programa para imprimir uma 
segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
 */

// ============================================================================
// -----------------------Classe Perfil com Cumprimento------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

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

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
EXERCÍCIO 2 - Crie uma classe chamada Estudos para imprimir anotações de 
estudos no console.
*/

// ============================================================================
// -----------------------Classe Estudos com Anotações-------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

import java.util.Scanner;

public class Estudos {
    public static void main(String[] args){
        System.out.println("Anotações de Estudos:");
        System.out.println("- Java é uma linguagem fortemente tipada.");
        System.out.println("- Com a JVM (Java Virtual Machine), o código Java passa pelo compilador Java gerando este arquivo Bytecode/.class (Nenhum SO entende o bytecode de primeira. Por esse motivo. Temos o JVM).");
        System.out.println("- A JVM, nossa máquina virtual Java, onde o código será escrito e compilado permite rodar em qualquer SO (apartir de uma compilação apenas), sendo eles, Windows, Linux e Mac");
        System.out.println("- Por isso, dizemos que a JVM permite que o Java seja 'write once, run anywhere'.");
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
EXERCÍCIO 3 - Crie uma classe Soma em Java para imprimir no console o 
resultado da operação 10 + 5. Certifique-se de que o resultado seja 
exibido sem o uso de aspas, apresentando o valor "15" ao invés
da expressão "10+5".
*/

// ============================================================================
// -------------------------Classe Soma com Operação---------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

public class Soma {
    public static void main(String[] args) {
        System.out.print("Resultado de 10 + 5: ");
        System.out.println(10 + 5);
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================

/*
EXERCÍCIO 4 - Crie uma classe Subtracao para imprimir o resultado 
de 10 - 5 no console.
*/

// ============================================================================
// -----------------------Classe Subtração com Operação------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

 public class Subtracao {
     public static void main(String[] args) {
         System.out.print("Resultado de 10 - 5: ");
         System.out.println(10 - 5);
     }
 }

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================
