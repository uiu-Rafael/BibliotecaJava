import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private String nomeDaBiblioteca;
	private String localizacaoDaBiblioteca;
	private double capacidadeDaBiblioteca;
	private String pratileiraGenero;
	private ArrayList<Biblioteca> listaBiblio = new ArrayList<>();
	
	public Biblioteca() {}
	
	public Biblioteca(String nomeDaBiblioteca, String localizacaoDaBiblioteca, double capacidadeDaBiblioteca, String pratileiraGenero, ArrayList<Biblioteca> listaBiblio) {
		super();
		this.setNomeDaBiblioteca(nomeDaBiblioteca);
		this.setLocalizacaoDaBiblioteca(localizacaoDaBiblioteca);
		this.setCapacidadeDaBiblioteca(capacidadeDaBiblioteca);
		this.setPratileiraGenero(pratileiraGenero);
		this.setListaBiblio(listaBiblio);
	}
	
	void cadastrarBiblioteca() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("+-----------------------------+");
		System.out.println("|                             |");
		System.out.println("|   Casdastro da Biblioteca   |");
		System.out.println("|                             |");
		System.out.println("+-----------------------------+");
		
		System.out.print("Qual o nome da biblioteca? ");
		setNomeDaBiblioteca(sc.nextLine());
		
		System.out.print("Qual a localização da biblioteca? ");
		setLocalizacaoDaBiblioteca(sc.nextLine());
		
		System.out.print("Qual a capacidade da biblioteca? ");
		setCapacidadeDaBiblioteca(sc.nextDouble());
		
		System.out.println("Informe o gênero da pratileira? ");
		setPratileiraGenero(sc.next());
	}

	public String getNomeDaBiblioteca() {
		return nomeDaBiblioteca;
	}

	public void setNomeDaBiblioteca(String nomeDaBiblioteca) {
		this.nomeDaBiblioteca = nomeDaBiblioteca;
	}

	public String getLocalizacaoDaBiblioteca() {
		return localizacaoDaBiblioteca;
	}

	public void setLocalizacaoDaBiblioteca(String localizacaoDaBiblioteca) {
		this.localizacaoDaBiblioteca = localizacaoDaBiblioteca;
	}

	public double getCapacidadeDaBiblioteca() {
		return capacidadeDaBiblioteca;
	}

	public void setCapacidadeDaBiblioteca(double capacidadeDaBiblioteca) {
		this.capacidadeDaBiblioteca = capacidadeDaBiblioteca;
	}

	public String getPratileiraGenero() {
		return pratileiraGenero;
	}

	public void setPratileiraGenero(String pratileiraGenero) {
		this.pratileiraGenero = pratileiraGenero;
	}

	public ArrayList<Biblioteca> getListaBiblio() {
		return listaBiblio;
	}

	public void setListaBiblio(ArrayList<Biblioteca> listaBiblio) {
		this.listaBiblio = listaBiblio;
	}
}
