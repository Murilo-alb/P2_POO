package exe2utfpr;

public class Livros {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numeroPaginas;
	private boolean condicao;
	private int diaAlugar;
	private double multa;
	private int contador = 0;

	public Livros(String titulo, String autor, int anoPublicacao, String editora, int numeroPaginas) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.condicao = true;
	}

	public void emprestar(int diaalugar) {
		this.diaAlugar = diaalugar;
		if (diaalugar > 0 && diaalugar < 31) {
			if (condicao == true) {
				System.out.println("Livro " +titulo+ " emprestado!");
				condicao = false;
			} else {
				System.out.println("Livro " +titulo+  " ja emprestado!");
			}
		} else
			System.out.println("Dia invalido!");
		System.out.println("\n");

	}

	public void devolver(int diaDevolver) {
		if (diaDevolver >= this.diaAlugar) {
			if (condicao == false) {
				System.out.println("Livro " + titulo + " devolvido");
				while (this.diaAlugar < diaDevolver) {

					contador++;
					this.diaAlugar++;
					if (contador > 7) {
						multa += 1.50;
					}
				}
				System.out.println("Multa: " + multa);
				condicao = true;
			} else {
				System.out.println("Livro " + titulo + "não foi emprestado!");
			}
		} else
			System.out.println("Dia invalido!");

		this.diaAlugar = 0;
		System.out.println("\n");
	}

	public void exibirLivros() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano Publicação: " + anoPublicacao);
		System.out.println("Editora: " + editora);
		System.out.println("Numero Paginas: " + numeroPaginas);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getMulta() {
		return multa;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public boolean isCondicao() {
		return condicao;
	}

	public void setCondicao(boolean condicao) {
		this.condicao = condicao;
	}

}
