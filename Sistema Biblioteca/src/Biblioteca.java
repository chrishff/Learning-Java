import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> acervo = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro novoLivro){
        acervo.add(novoLivro);
        System.out.println("Livro adicionado ao acervo com sucesso!");
    }
    public void listarLivros(){
        for (Livro livro : acervo){
            System.out.printf("Titulo: %s | Autor: %s (%d)\n",
                    livro.autor(),
                    livro.autor().nome(),
                    livro.anoPublicacao());
        }
    }

    public void buscarPorTitulo(String tituloProcurado){
        boolean encontrou = false;
        for(Livro livro : acervo){
            if(livro.titulo().equalsIgnoreCase(tituloProcurado)){
                System.out.printf("A biblioteca possui %s no seu acervo.", tituloProcurado);
                encontrou = true;
            }
        }
        if (encontrou == false){
            System.out.println("Livro não encontrado no acervo.");
        }
    }
}
