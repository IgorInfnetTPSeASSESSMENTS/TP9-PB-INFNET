package br.edu.infnet.IgorAntonio.domain;

public class Disciplina {

	private int codigo;
	private String nome;
    
    public Disciplina(int codigoDisciplina, String nomeDisciplina) {
        this.codigo = codigoDisciplina;
        this.nome = nomeDisciplina;
    }
    
	@Override
	public String toString() {
		
		return "Nome da disciplina: " + nome + "\nCodigo da disciplina: " + codigo;	
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
