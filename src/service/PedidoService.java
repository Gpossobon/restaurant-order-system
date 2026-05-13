package service;
import model.Pedido;
import java.util.ArrayList;

public class PedidoService {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionar(Pedido pedido) {
        pedidos.add(pedido);

    }
    public void listar() {
        pedidos.forEach(System.out::println);

    }

    public Pedido buscarPorId( int id) {
        for (Pedido p : pedidos) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
public void remover (int id) {
        pedidos.removeIf(p -> p.getId() == id);
        }
        public void atualizarStatus( int id, String novoStatus) {
        Pedido p = buscarPorId(id);

        if (p != null) {
            p.setStatus(novoStatus);}
         else {
            System.out.println("Pedido Não Encontrado.");
        }
            }
          }


