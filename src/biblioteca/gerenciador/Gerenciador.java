package biblioteca.gerenciador;

import biblioteca.livros.Livro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gerenciador implements Emprestimo {

    List<Livro> prateleira = new ArrayList<>();
    private Date dataEmprestimo;

    public void adicionar(String titulo, String autor, int anoPubli) {
        prateleira.add(titulo, autor, anoPubli);
    }

    @Override
    public void emprestar() {

    }

    @Override
    public void devolver() {

    }
}
