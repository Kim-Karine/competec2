package competec.aula3_arranjos;

// import java.util.Scanner;

public class Desafio2TresArranjos {
    public static void main(String[] args) {
        // Crie um vetor com 3 números inteiros a sua escolha:
        // Scanner leia= new scanner(System.in);
        // Crie uma variável que irá armazenar a soma desses 3 valores:
        int valores [] = {2,4,4}; 
        int valor []= new int[3];
        valores[0] = 2;
        valores[1] = 4;
        valores[2] = 4;
                // Imprima o resultado dessa variável:
        int some = valores[0] + valores[1] + valores[2];
        System.out.println("A soma dos valores é : " + some);
    }
}
