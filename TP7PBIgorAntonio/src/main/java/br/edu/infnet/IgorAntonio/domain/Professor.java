package br.edu.infnet.IgorAntonio.domain;

public class Professor {

	private int matricula;
	private String nome;
	
	public Professor() {}
	
	public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do professor: " + nome + "\nMatricula do professor: " + matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
