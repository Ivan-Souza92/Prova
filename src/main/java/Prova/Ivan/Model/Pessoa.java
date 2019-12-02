package Prova.Ivan.Model;

public class Pessoa
{
	
	private String nome ;
	private String genero ;
	private String idade ;
	private String servico ;
	
	
	public Pessoa()
	{
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getServico() {
		return servico;
	}


	public void setServico(String servico) {
		this.servico = servico;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", servico=" + servico + "]";
	}
	
	
	
	
	
	

}
