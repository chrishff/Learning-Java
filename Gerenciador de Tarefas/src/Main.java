import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha;

        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

        do {


            System.out.println("====================================");
            System.out.println("       Gerenciador de Tarefas       ");
            System.out.println("====================================");

            System.out.println("Digite a sua opção: \n" +
                    "(1) - Adicionar Tarefa\n" +
                    "(2) - Listar Tarefas\n" +
                    "(3) - Remover Tarefa\n" +
                    "(4) - Atualizar Status\n"+
                    "(0) - Sair do Gerenciador\n");


            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do tarefa: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Insira a descrição da tarefa: ");
                    String descricao = sc.nextLine();

                    LocalDate dataLimite = LocalDate.now().plusDays(7);

                    Tarefa novaTarefa = new Tarefa(nome, descricao, dataLimite);

                    listaDeTarefas.add(novaTarefa);

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        System.out.printf("[%d]\n %s", i, listaDeTarefas.get(i));
                    }
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa está na lista!");
                    }
                    break;
                case 3:
                    System.out.println("Insira o ID da tarefa que deseja remover: ");
                    int id = sc.nextInt();

                    if (id >= 0 && id < listaDeTarefas.size()) {
                        listaDeTarefas.remove(id);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("ID invalido! Tente novamente!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID da tarefa que deseja marcar como concluida: ");
                    id = sc.nextInt();
                    if (id >= 0 && id < listaDeTarefas.size()) {
                        Tarefa tarefaEscolhida = listaDeTarefas.get(id);
                        tarefaEscolhida.concluir();
                        System.out.println("Tarefa concluida com sucesso!");
                    } else {
                        System.out.println("ID invalido! Tente novamente!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do gerenciador de tarefas...");
                    break;
                    default:
                        System.out.println("Opção invalida!");
            }
        }while (escolha != 0);
    }
}