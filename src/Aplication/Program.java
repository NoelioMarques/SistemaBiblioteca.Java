package Aplication;

import Entities.Biblioteca;
import Entities.Livro;
import Entities.Usuario;

public class Program {

	public static void main(String[] args) {
		 	Livro livro1 = new Livro("Java: The Complete Reference", "Herbert Schildt", 5);
	        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 3);

	        Usuario usuario1 = new Usuario("João", 12345);
	        Usuario usuario2 = new Usuario("Maria", 67890);

	        Biblioteca biblioteca = new Biblioteca();
	        
	        biblioteca.adcionarLivros(livro1);
	        biblioteca.adcionarLivros(livro2);
	        
	        biblioteca.emprestarLivro(	livro1, usuario1);
	        biblioteca.emprestarLivro(livro1, usuario2);
	        biblioteca.emprestarLivro(	livro1, usuario1);
	        biblioteca.emprestarLivro(livro1, usuario2);
	        biblioteca.emprestarLivro(	livro1, usuario1);
	        biblioteca.emprestarLivro(livro1, usuario2);

	}

}
