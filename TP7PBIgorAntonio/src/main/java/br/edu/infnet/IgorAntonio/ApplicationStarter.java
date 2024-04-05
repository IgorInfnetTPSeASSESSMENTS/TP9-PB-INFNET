package br.edu.infnet.IgorAntonio;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.IgorAntonio.domain.Aluno;
import br.edu.infnet.IgorAntonio.domain.Disciplina;
import br.edu.infnet.IgorAntonio.domain.Professor;
import br.edu.infnet.IgorAntonio.domain.Turma;

public class ApplicationStarter {

	public static void main(String[] args) {
   

        Professor prof1 = new Professor(1001, "Ana Souza");
        Professor prof2 = new Professor(1002, "Pedro Almeida");
        Professor prof3 = new Professor(1003, "Maria Oliveira");

        Disciplina disc1 = new Disciplina(101, "Matemática");
        Disciplina disc2 = new Disciplina(102, "História");
        Disciplina disc3 = new Disciplina(103, "Biologia");

        List<Turma> turmas = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        
        professores.add(prof1);
        professores.add(prof2);
        professores.add(prof3);

        disciplinas.add(disc1);
        disciplinas.add(disc2);
        disciplinas.add(disc3);

        Turma turma1 = new Turma(1, disc1, prof1);
        turmas.add(turma1);

        Turma turma2 = new Turma(2, disc2, prof2);
        turmas.add(turma2);

        Turma turma3 = new Turma(3, disc3, prof3);
        turmas.add(turma3);

        Aluno aluno1 = new Aluno(20211001, "José Silva");
        Aluno aluno2 = new Aluno(20211002, "Mariana Santos");
        Aluno aluno3 = new Aluno(20211003, "Lucas Oliveira");

        aluno1.addTurma(turma1);
        aluno1.addTurma(turma2);
        aluno2.addTurma(turma2);
        aluno3.addTurma(turma3);

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        for (Aluno aluno : alunos) {
            aluno.exibirTurmas();
        }
        
        System.out.println("\nPautas: ");
        System.out.println("\n" + turma1.gerarPauta());
        System.out.println("\n" + turma2.gerarPauta());
        System.out.println("\n" + turma3.gerarPauta());
    }
}        
