package udesc.dsw55.trabalho_final.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity(name="tbproduto")
public class ModelProduto {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=3)
	@NotNull
	private String descricao;
	
	private String foto;
	
	@NotNull
	private String tamanho;
	
	@NotNull
	private float preco;
	
	@PositiveOrZero
	private Integer quantidade;	
	
	public ModelProduto(Integer id, @Size(min = 3) String descricao, String foto, String tamanho, float preco,@PositiveOrZero Integer quantidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.foto = foto;
		this.tamanho = tamanho;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public ModelProduto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ModelProduto [id=" + id + ", descricao=" + descricao + ", foto=" + foto + ", tamanho=" + tamanho
				+ ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
}
