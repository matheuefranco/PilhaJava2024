package pilhajava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PilhaJava {
    
    private static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Mostrar topo");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a op desejada: %n", "UTF-8");
        return scanner.nextInt();
    }
    public static void leiaRecorde(Recorde recorde){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        recorde.setNome(scanner.nextLine());
        System.out.println("Data [dd/mm/aaaa]:");
        String dataRecorde = scanner.nextLine();
        LocalDate dataFormatada =  LocalDate.parse(dataRecorde,
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        recorde.setData(dataFormatada);
        System.out.println("Tempo:");
        recorde.setTempo(scanner.nextDouble());
    }

    
    public static void main(String[] args) {
        int tamanho,op=0, elemento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho da pilha:");
        tamanho = scanner.nextInt();
        Pilha<Recorde> pilha = new Pilha<>(tamanho);
        do{
            op = mostrarMenu();
            switch(op){
                case 1: System.out.println("Dados do recorde:");
                        Recorde novoRecorde = new Recorde();
                        leiaRecorde(novoRecorde);
                        if(pilha.push(novoRecorde)==true)
                             System.out.println("Insercao realizada");
                        else
                            System.out.println("Stack Overflow!");
                        
                break;
                case 2: if(!pilha.isEmpty())
                          System.out.println("Elemento removido:"+ pilha.pop());
                        else
                          System.out.println("Pilha vazia!");
                        
                break;
                case 3: if(!pilha.isEmpty())
                          System.out.println("Elemento do topo:"+ pilha.peek());
                        else
                          System.out.println("Pilha vazia!");
                        
                break;
                case 4:System.out.println("Elementos da pilha\n");
                        System.out.println(pilha);
                break;
            }// fim switch
            System.out.println("Pressione uma tecla para continuar\n");
            scanner.nextLine();
        }while(op!=0);
        scanner.close();
    }
    
}
