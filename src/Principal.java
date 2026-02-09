import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ConsultaCotacao consulta = new ConsultaCotacao();

        int opcao = 0;

        while (opcao != 7) {
            exibirMenu();

            try {
                opcao = leitura.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite apenas números!");
                leitura.nextLine(); // Limpa o buffer do scanner
                continue;
            }

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            // Lógica de seleção das moedas
            String base = "";
            String alvo = "";

            switch (opcao) {
                case 1: base = "USD"; alvo = "ARS"; break;
                case 2: base = "ARS"; alvo = "USD"; break;
                case 3: base = "USD"; alvo = "BRL"; break;
                case 4: base = "BRL"; alvo = "USD"; break;
                case 5: base = "USD"; alvo = "COP"; break;
                case 6: base = "COP"; alvo = "USD"; break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }


            System.out.println("Digite o valor para converter:");
            double valor = leitura.nextDouble();

            realizarConversao(consulta, base, alvo, valor);
        }
    }

    private static void exibirMenu() {
        System.out.println("\n*************************************************\n");
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]\n");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileiro");
        System.out.println("4) Real brasileiro => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Sair");
        System.out.println(" Escolha uma opção válida: ");
        System.out.println("\n*************************************************\n");
    }

    private static void realizarConversao(ConsultaCotacao consulta, String base, String alvo, double valor) {
        try {
            Moeda moeda = consulta.buscaMoeda(base);
            Double taxa = moeda.conversion_rates().get(alvo);

            if (taxa == null) {
                throw new ErroConsultaApiException("A moeda de destino (" + alvo +") não foi encontrada na lista.");
            }

            double resultado = valor * taxa;
            System.out.printf("Valor %.2f [%s] corresponde ao valor final de %.2f [%s]\n", valor, base, resultado, alvo);

        } catch (ErroConsultaApiException e) {
            System.out.println("Erro de consulta: " + e.getMessage());


        }
    }
}