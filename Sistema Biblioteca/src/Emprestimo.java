import java.time.LocalDate;

public record Emprestimo(Usuario usuario, Livro livro, LocalDate dataRetirada, LocalDate dataDevolucao) {
}
