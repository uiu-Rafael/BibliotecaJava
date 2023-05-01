import java.util.Scanner;

public class TesteExecucao {

	public static void main(String[] args) {
		Livros livro = new Livros();
		// quando vou imprimir a lista ele só retorna o objeto que eu insiri não os atributos dentro deste objeto.
		
		Scanner entrada = new Scanner(System.in);
		while(true){
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|                                                             |");
			System.out.println("|        BEM VINDO AO SISTEMA DA BIBLIOTECA(ATENDENTE)        |");
			System.out.println("|                                                             |");
			System.out.println("|    1- Cadastrar Biblioteca(ATENDENTE)                       |");
			System.out.println("|    2- Cadastrar Livro na Biblioteca(ATENDENTE)              |");
			System.out.println("|    3- Pesquisar Livro partindo do ISBN(USUARIO/CLIENTE)     |");
			System.out.println("|    4- Pesquisar Livro partindo do TITULO(USUARIO/CLIENTE)   |");
			System.out.println("|    5- Remover Livro partindo do TITULO(ATENDENTE)           |");
			System.out.println("|    6- Listar todos os Livros cadastrados(ATENDENTE)         |");
			System.out.println("|    7- Atualizar Livro partindo do TITULO(ATENDENTE)         |");
			System.out.println("|    8- Pesquisar Livro partindo do AUTOR(USUARIO/CLIENTE)    |");
			System.out.println("|    9- Remover Livro partindo do AUTOR(ATENDENTE)            |");
			System.out.println("|    10- Leitura de livro(USUARIO/CLIENTE)                    |");
			System.out.println("|                                                             |");
			System.out.println("+-------------------------------------------------------------+\n");
			
			System.out.println("Digite um numero de acordo com a tabela acima: \nOBS: caso você queira sair digite qualquer numero depois de 10.");
			int digito = entrada.nextInt();
			
			switch(digito){
			case 1:
				livro.cadastrarBiblioteca();
				System.out.println("SISTEMA CADASTRADO!");
				continue;
			case 2:
				livro.cadastrarLivroNaBiblioteca();
				continue;
			case 3:
				livro.pesquisarLivroIsbn();
				continue;
			case 4:
				livro.pesquisarLivroTitulo();
				continue;
			case 5:
				livro.removerTitulo();
				continue;
			case 6:
				livro.listaLivros();
				continue;
			case 7:
				livro.atualizarLivro();
				continue;
			case 8:
				livro.pesquisarLivroAutor();
				continue;
			case 9:
				livro.removerLivroAutor();
				continue;
			case 10:
				livro.leitura();
				continue;
			default:
				System.out.println("Número Invalido.\nVocê quer encerrar esta operação? digite 's', caso contrario digite qualque letra.");
			}
			char letra = entrada.next().charAt(0);
			if(letra == 's') {
				System.out.println("SISTEMA ENCERRADO, TENHA UM OTIMO DIA! ;)");
				break;
			}else {
				continue;
			}
			
			
		}
		
	}

}
