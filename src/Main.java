import java.util.Scanner;
import model.Pedido;
import service.PedidoService;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PedidoService service = new PedidoService();
        int opcao;
        do {
            System.out.println("\n1 - Criar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar Status");
            System.out.println("4 - Remover Pedido");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cliente:  ");
                    String cliente = sc.nextLine();

                    System.out.println("Item:  ");
                    String item = sc.nextLine();

                    Pedido pedido = new Pedido((int) (Math.random()*1000), cliente, item);
                    service.adicionar(pedido);
                    break;

                case 2:
                    service.listar();
                    break;

                case 3:
                    System.out.println("Id do pedido: ");
                    int idStatus = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Novo Status: ");
                    String status = sc.nextLine();

                    service.atualizarStatus(idStatus, status);
                    break;

                case 4:
                    System.out.println("Id do Pedido: ");
                    int idRemover = sc.nextInt();
                    service.remover(idRemover);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }
        } while(opcao != 0);
    }
}