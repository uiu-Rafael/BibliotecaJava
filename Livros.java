import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Livros extends Biblioteca{
	private String codigo;
	private String titulo;
	private String autor;
	private String isbn;
	private double quantidade;
	private String genero;
	private double numeroDePaginas;
	private int edicao;
	private ArrayList<Livros> lista = new ArrayList<>();
	
	public Livros() {}
	
	public Livros(String nomeDaBiblioteca, String localizacaoDaBiblioteca, double capacidadeDaBiblioteca, String pratileiraGenero, ArrayList<Biblioteca> listaBiblio,
			String codigo, String titulo, String autor, String isbn, double quantidade ,String genero,double numeroDePaginas, int edicao, ArrayList<Livros> lista) {
		super(nomeDaBiblioteca, localizacaoDaBiblioteca, capacidadeDaBiblioteca, pratileiraGenero, listaBiblio);
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.setQuantidade(quantidade);
		this.setGenero(genero);
		this.numeroDePaginas = numeroDePaginas;
		this.edicao = edicao;
		this.setLista(lista);
	}
	
	public void adicionarLivro(Livros livro) {
        getListaBiblio().add(livro);
    }
	
	public void removerLivro(Livros livro) {
        getListaBiblio().remove(livro);
    }
	
	void qntdDeLivros(int qntd) {
		setQuantidade(qntd);
	}
	
	void cadastrarLivroNaBiblioteca() {
		int quantidadeTotal = 0;
		Scanner sc = new Scanner(System.in);
		Livros l = new Livros();
		
		System.out.println("+-----------------------------------+");
		System.out.println("|                                   |");
		System.out.println("|   Cadastrar Livro na Biblioteca   |");
		System.out.println("|                                   |");
		System.out.println("+-----------------------------------+");
		
		System.out.print("Qual o código do livro? ");
		l.setCodigo(sc.nextLine());
		
		System.out.print("Qual o titulo do livro? ");
		l.setTitulo(sc.nextLine());
		
		System.out.print("Qual o autor do livro? ");
		l.setAutor(sc.nextLine());
		
		System.out.print("Qual o código ISBN do livro? ");
		l.setIsbn(sc.nextLine());
		
		System.out.print("Qual o gênero do livro? ");
		l.setGenero(sc.next());
		
		System.out.print("Quantas paginas tem o livro? ");
		l.setNumeroDePaginas(sc.nextDouble());
		
		System.out.print("Qual a edição do livro? ");
		l.setEdicao(sc.nextInt());
		
		adicionarLivro(l);
		qntdDeLivros(getListaBiblio().size());
		
		if(getPratileiraGenero().equals(l.getGenero()) && getCapacidadeDaBiblioteca() >= getQuantidade()) {
			System.out.println("\nLivro Adicionado na pratileira!!\n");
		}else if(getCapacidadeDaBiblioteca() < getQuantidade()){
			System.out.println("Não pode ser adicionado a biblioteca, pois ja atingiu a sua capacidade maxima de livros.");
			removerLivro(l);
		}else if(!getPratileiraGenero().equals(l.getGenero())) {
			System.out.println("Este livro não pode ser adicionado a está pratileira, adicione livros\n apenas com o gênero correspondente a "+getPratileiraGenero()+"\n");
			removerLivro(l);
		}else {
			System.out.println("Erro!");
		}
		
		
		//setCapacidadeDaBiblioteca(quantidadeTotal);
		//lista.add(l);
	}
	
	void pesquisarLivroIsbn() {
		Scanner sc1 = new Scanner(System.in);
		//Livros l = new Livros();
		
		System.out.println("\nBusque o livro a partir do ISBN: ");
		String pesquisa = sc1.nextLine();
		
		for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			if(l.getIsbn().equals(pesquisa)) {
				System.out.println("Código do livro: "+l.getCodigo());
				System.out.println("Titulo do livro: "+l.getTitulo());
				System.out.println("Autor do livro: "+l.getAutor());
				System.out.println("Código ISBN do livro: "+l.getIsbn());
				System.out.println("Gênero do livro: "+l.getGenero());
				System.out.println("Quantas paginas tem o livro: "+l.getNumeroDePaginas());
				System.out.println("Edição do livro: "+l.getEdicao());
			}
		}
	}
	
	void pesquisarLivroTitulo() {
		Scanner sc2 = new Scanner(System.in);
		//Livros l = new Livros();
		
		System.out.println("\nBusque o livro a partir do titulo: ");
		String pesquisa = sc2.nextLine();
		
		for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b; //podemos fazer o casting desse objeto para o tipo Livros usando o operador de casting "(Livros)". O casting é necessário para que possamos acessar os métodos e atributos específicos da classe livro.
			if(l.getTitulo().equals(pesquisa)) {
				System.out.println("Código do livro: "+l.getCodigo());
				System.out.println("Titulo do livro: "+l.getTitulo());
				System.out.println("Autor do livro: "+l.getAutor());
				System.out.println("Código ISBN do livro: "+l.getIsbn());
				System.out.println("Gênero do livro: "+l.getGenero());
				System.out.println("Quantas paginas tem o livro: "+l.getNumeroDePaginas());
				System.out.println("Edição do livro: "+l.getEdicao());
			}
		}
	}
	
	void removerTitulo() {
		Scanner sc3 = new Scanner(System.in);
		//Livros l = new Livros();
		
		System.out.println("\nRemova o livro a partir do titulo: \n");
		String pesquisa = sc3.nextLine();
		
		/*for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			if(l.getTitulo().equals(pesquisa)) {
				removerLivro(l);
			}
		}*/
		
		Iterator<Biblioteca> iterator = getListaBiblio().iterator();
		while (iterator.hasNext()) {
		    Biblioteca b = iterator.next();
		    Livros l = (Livros) b;
		    if (l.getTitulo().equals(pesquisa)) {
		        iterator.remove();
		    }
		}
		System.out.println("Livro removido com sucesso!");
	}
	
	void listaLivros() {
		//Livros l = new Livros();
		System.out.print("\nLista de livros: ");
		for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			
			System.out.print(l.getTitulo()+"\n");
			
		}
	}
	
	void atualizarLivro() {
		Scanner sc0 = new Scanner(System.in);
		
		System.out.print("\nEscreva o titulo do livro que você deseja atualizar: ");
		String pesquisa = sc0.next();
		for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			if(l.getTitulo().equals(pesquisa)) {
				System.out.print("Rescreva o livro: \n");
				
				System.out.print("Qual o código do livro? ");
				l.setCodigo(sc0.next());
				
				System.out.println("Qual o titulo do livro? ");
				l.setTitulo(sc0.next());
				
				System.out.println("Qual o autor do livro? ");
				l.setAutor(sc0.next());
				
				System.out.println("Qual o código ISBN do livro? ");
				l.setIsbn(sc0.next());
				
				System.out.println("Qual o gênero do livro? ");
				l.setGenero(sc0.next());
				
				System.out.println("Quantas paginas tem o livro? ");
				l.setNumeroDePaginas(sc0.nextDouble());
				
				System.out.println("Qual a edição do livro? ");
				l.setEdicao(sc0.nextInt());
				
				System.out.println("Livro atualizado!!!");
			}
		
		}
	}
	
	void pesquisarLivroAutor() {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("\nEscreva o nome do autor do livro que você deseja pesquisar: ");
		String pesquisa = sc2.next();
		System.out.print("Essas foram as obras achadas com base no seu autor: ");
		for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			if(l.getAutor().equals(pesquisa)) {
				System.out.println(l.getTitulo());
			}
		}
	}
	
	void removerLivroAutor() {
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("\nEscreva o nome do autor do livro que você deseja remover: ");
		String pesquisa = sc3.next();
		/*for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			if(l.getAutor().equals(pesquisa)) {
				removerLivro(l);
			}
		}*/
		
		Iterator<Biblioteca> iterator = getListaBiblio().iterator();
		while (iterator.hasNext()) {
		    Biblioteca b = iterator.next();
		    Livros l = (Livros) b;
		    if (l.getAutor().equals(pesquisa)) {
		        iterator.remove();
		    }
		}
		System.out.println("Livro removido com sucesso!");
	}
	
	void leitura() {
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Escreva o titulo do livro que você quer ler: ");
		String pesquisa = sc4.next();
		for(Biblioteca b : getListaBiblio()) {
			Livros l = (Livros) b;
			if(l.getTitulo().equals(pesquisa)) {
				System.out.println("O livro, "+l.getTitulo()+", possui "+l.getNumeroDePaginas()+" paginas");
				double restante = l.getNumeroDePaginas();
				while(true) {
					System.out.println("Se você quiser ler agora aperte qualquer tecla, exceto, se você quiser ler outra hora aperte a tecla 'n': ");
					char confirmacao = sc4.next().charAt(0);
					if(confirmacao == 'n') {
						break;
					}else {
						System.out.println("BEM VINDO AO SEU LIVRO: "+l.getTitulo());
					}
					System.out.println("Você quer ler quantas paginas? ");
					int paginas = sc4.nextInt();
					if(paginas > l.getNumeroDePaginas()) {
						System.out.println("Você ultrapassou o limite de paginas que você pode ler\nDigite novamente!\n");
						continue;
					}else if(paginas < l.getNumeroDePaginas() && paginas < restante) {
						restante -= paginas;
						System.out.println("Parabens! Você leu "+paginas+" paginas agora falta "+restante+" restantes");
						continue;
					}else {
						System.out.println("Parabens! Você terminou o seu livro.");
						break;
					}
				}
			}
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(double numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public ArrayList<Livros> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Livros> lista) {
		this.lista = lista;
	}
}
