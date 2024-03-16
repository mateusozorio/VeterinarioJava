import org.example.Animal;
import org.example.ServicoAnimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema veterinário!");

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Cadastrar novo animal");
            System.out.println("2. Editar animal");
            System.out.println("3. Excluir animal");
            System.out.println("4. Consultar animal");
            System.out.println("5. Listar todos os animais");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarAnimal(scanner);
                    break;
                case 2:
                    editarAnimal(scanner);
                    break;
                case 3:
                    excluirAnimal(scanner);
                    break;
                case 4:
                    consultarAnimal(scanner);
                    break;
                case 5:
                    listarTodosAnimais(scanner);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println("Digite o ID do animal:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite a descrição do animal:");
        String descricao = scanner.nextLine();

        System.out.println("Digite a raça do animal:");
        String racaAnimal = scanner.nextLine();

        Animal novoAnimal = new Animal(id, descricao, racaAnimal);
        int resultado = ServicoAnimal.cadastrarAnimal(novoAnimal);
        if (resultado == 1) {
            System.out.println("Animal cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar o animal.");
        }
    }

    private static void editarAnimal(Scanner scanner) {
        System.out.println("Digite o ID do animal que deseja editar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Animal animal = ServicoAnimal.consultarAnimal(id);
        if (animal != null) {
            System.out.println("Digite a nova descrição do animal:");
            String novaDescricao = scanner.nextLine();

            System.out.println("Digite a nova categoria do animal:");
            String novaRacaAnimal = scanner.nextLine();

            animal.setRacaAnimal(novaRacaAnimal);
            animal.setRacaAnimal(novaRacaAnimal);

            boolean resultado = ServicoAnimal.editarAnimal(animal);
            if (resultado) {
                System.out.println("Animal editado com sucesso!");
            } else {
                System.out.println("Erro ao editar o animal.");
            }
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    private static void excluirAnimal(Scanner scanner) {
        System.out.println("Digite o ID do animal que deseja excluir:");
        int id = scanner.nextInt();

        boolean resultado = ServicoAnimal.excluirAnimal(id);
        if (resultado) {
            System.out.println("Animal excluído com sucesso!");
        } else {
            System.out.println("Erro ao excluir o animal.");
        }
    }

    private static void consultarAnimal(Scanner scanner) {
        System.out.println("Digite o ID do animal que deseja consultar:");
        int id = scanner.nextInt();

        Animal animal = ServicoAnimal.consultarAnimal(id);
        if (animal != null) {
            System.out.println("Animal encontrado:");
            System.out.println("ID: " + animal.getIdAnimal());
            System.out.println("Raça: " + animal.getDescricaoAnimal());
            System.out.println("Categoria: " + animal.getRacaAnimal());
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    private static void listarTodosAnimais(Scanner scanner) {
        ServicoAnimal.listarTodosAnimais();

    }
}
