import java.time.LocalDate;

public class Tarefa {
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private boolean concluido = false;

    public Tarefa(String nome, String descricao,LocalDate dataLimite, LocalDate dataCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.dataCriacao = LocalDate.now();
    }

    public void concluir(){
        this.concluido = true;
    }

    public String toString() {
        return"Nome da Tarefa: " + nome +
                "\nDescrição da Tarefa: " + descricao +
                "\nData Limite para Termino:  " + dataLimite +
                "\nStatus: " + concluido;
    }
}
