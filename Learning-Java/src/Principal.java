import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║   Calculadora de IMC (2026)  ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println();

        // Entrada de dados
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        // Cálculos
        double imc = peso / (altura * altura);
        double pesoIdeal = 22.0 * (altura * altura); // IMC ideal ~22

        // Classificação da OMS
        String classificacao;
        String recomendacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
            recomendacao  = "Consulte um nutricionista para ganho de peso saudável.";
        } else if (imc < 25.0) {
            classificacao = "Peso normal";
            recomendacao  = "Parabéns! Mantenha hábitos saudáveis.";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
            recomendacao  = "Considere ajustar a dieta e aumentar a atividade física.";
        } else if (imc < 35.0) {
            classificacao = "Obesidade grau I";
            recomendacao  = "Consulte um médico para um plano de emagrecimento.";
        } else if (imc < 40.0) {
            classificacao = "Obesidade grau II";
            recomendacao  = "Acompanhamento médico é fortemente recomendado.";
        } else {
            classificacao = "Obesidade grau III";
            recomendacao  = "Procure auxílio médico imediatamente.";
        }

        double diferencaPeso = peso - pesoIdeal;
        String statusPeso = (diferencaPeso > 0)
                ? String.format("%.1f kg acima do ideal", diferencaPeso)
                : String.format("%.1f kg abaixo do ideal", Math.abs(diferencaPeso));

        // Exibição dos resultados
        System.out.println();
        System.out.println("┌─────────────────────────────────────┐");
        System.out.printf( "│  Resultado para: %-19s│%n", nome);
        System.out.println("├─────────────────────────────────────┤");
        System.out.printf( "│  Idade:     %-25d│%n", idade);
        System.out.printf( "│  Altura:    %-22.2f m│%n", altura);
        System.out.printf( "│  Peso:      %-21.1f kg│%n", peso);
        System.out.println("├─────────────────────────────────────┤");
        System.out.printf( "│  IMC:       %-25.2f│%n", imc);
        System.out.printf( "│  Status:    %-25s│%n", classificacao);
        System.out.printf( "│  Peso ideal: ~%-21.1f kg│%n", pesoIdeal);
        System.out.printf( "│  Diferença: %-25s│%n", statusPeso);
        System.out.println("├─────────────────────────────────────┤");
        System.out.printf( "│  %-37s│%n", "Recomendação:");

        // Quebra a recomendação em linhas de 37 chars para caber na caixa
        String[] palavras = recomendacao.split(" ");
        StringBuilder linha = new StringBuilder("│  ");
        for (String palavra : palavras) {
            if (linha.length() + palavra.length() > 39) {
                System.out.printf("%-40s│%n", linha.toString());
                linha = new StringBuilder("│  ");
            }
            linha.append(palavra).append(" ");
        }
        System.out.printf("%-40s│%n", linha.toString());
        System.out.println("└─────────────────────────────────────┘");

        scanner.close();
    }
}