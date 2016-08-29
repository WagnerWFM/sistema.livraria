package dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	// Internal Variables
	private Integer codLivro;
	private String titulo, isbn;
	private Integer paginas;
	private BigDecimal valorDiario;
	
	// Relationship Variables
	private Editora editora;
	private Categoria categoria;
	private List<ItemEmprestimo> itens;
	
	private Livro()
	{
		this.itens = new ArrayList<>();
	}

	public Livro(Integer codLivro, String titulo, String isbn, Integer paginas, BigDecimal valorDiario, Editora editora,
			Categoria categoria) {
		super();
		this.codLivro = codLivro;
		this.titulo = titulo;
		this.isbn = isbn;
		this.paginas = paginas;
		this.valorDiario = valorDiario;
		this.editora = editora;
		this.categoria = categoria;
		this.itens = new ArrayList<>();
	}

	/**
	 * @return the codLivro
	 */
	public Integer getCodLivro() {
		return codLivro;
	}

	/**
	 * @param codLivro the codLivro to set
	 */
	public void setCodLivro(Integer codLivro) {
		this.codLivro = codLivro;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the paginas
	 */
	public Integer getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the valorDiario
	 */
	public BigDecimal getValorDiario() {
		return valorDiario;
	}

	/**
	 * @param valorDiario the valorDiario to set
	 */
	public void setValorDiario(BigDecimal valorDiario) {
		this.valorDiario = valorDiario;
	}

	/**
	 * @return the editora
	 */
	public Editora getEditora() {
		return editora;
	}

	/**
	 * @param editora the editora to set
	 */
	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the itens
	 */
	public List<ItemEmprestimo> getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<ItemEmprestimo> itens) {
		this.itens = itens;
	}
	
	
	
	

}
