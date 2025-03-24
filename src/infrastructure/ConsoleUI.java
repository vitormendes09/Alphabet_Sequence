package infrastructure;

import application.AlphabetService;

import java.util.Scanner;

public class ConsoleUI {

    private final AlphabetService alphabetService;

    public ConsoleUI(AlphabetService alphabetService) {
        this.alphabetService = alphabetService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 26: ");
        
        try {
            int number = scanner.nextInt();
            String result = alphabetService.getAlphabetSequence(number);
            System.out.println("Letras correspondentes: " + result);
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida!");
        } finally {
            scanner.close();
        }
    }
}
