package uti;

public class utili {

	private Integer id;
	private String nome;
	private Double salario;
	public utili(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public void Aumento(int porcentagem) {
		
		this.salario+=this.salario*porcentagem/100;
			
		
		
	
	}
	
	
	
	
	public String toString() {
		
		return id+ ","+nome+", "+salario;
		
		
	}
	
	
	
	
	
}
