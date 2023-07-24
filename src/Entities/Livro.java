package Entities;

public class Livro {
	private String name; 
	private String autor; 
	private int numCopias;
	
	
	public Livro(String name, String autor, int numCopias) {
	
		this.name = name;
		this.autor = autor;
		this.numCopias = numCopias;
	}

	public String getName() {
		return name;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumCopias() {
		return numCopias;
	} 
	
	// Metodo para verificar se o livro esta disponivel
	
	public boolean estaDisponivel() {
		return numCopias >0; 
	}
	
	//Metodo para Emprestar um Livro
	
	public void Emprestar () {
		if(estaDisponivel()) {
			numCopias -- ;
			System.out.println("Livro '" + name + "' emprestado. "  );
		}else {
			System.out.println("Desculpe, o livro '" + name + "' não esta disponivel ");
		}
	}
	
	public void devolver() {
		numCopias ++; 
	}
	
	
}
