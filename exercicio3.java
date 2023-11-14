package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Set<Integer> inteirosSet = new HashSet<>();

	        // Cria um Scanner para ler dados do teclado
	        Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário que digite 10 valores inteiros não repetidos
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
	            int valor = scanner.nextInt();

	            // Adiciona o valor no HashSet
	            inteirosSet.add(valor);
	        }

	        // Exibe todos os elementos do HashSet usando a classe Iterator
	        System.out.println("Listar dados do Set:");
	        listarElementos(inteirosSet);
	    }

	    // Método para exibir os elementos do Set usando Iterator
	    private static void listarElementos(Set<Integer> set) {
	        Iterator<Integer> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        System.out.println(); // Adiciona uma linha em branco para separar a lista
	    }

	}

