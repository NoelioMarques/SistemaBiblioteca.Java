package Entities;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> livros;

	public Biblioteca() {
		livros = new ArrayList<>();
	}
	
	public void adcionarLivros(Livro livro) {
		livros.add(livro);
	}
	
	public void emprestarLivro(Livro livro, Usuario usuario) {
		if(livros.contains(livro)) {
			livro.Emprestar();
			System.out.println("Emprestimo para " + usuario.getNome() + "ID: " +  usuario.getId() + " realizada com sucesso.");
		} else {
			System.out.println("Livro não encontrado na biblioteca.");
		}
	}
	
	 public void devolverLivro(Livro livro) {
	        if (livros.contains(livro)) {
	            livro.devolver();
	        } else {
	            System.out.println("Livro não encontrado na biblioteca.");
	        }
	    }
	 
	// Método para verificar a disponibilidade de um livro na biblioteca
	    public boolean verificarDisponibilidade(Livro livro) {
	        return livro.estaDisponivel();
}
}

