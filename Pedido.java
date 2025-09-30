package aula5_polimorfismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.time.format.DateTimeFormatter;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento metodoPagamento;

    public Pedido(Cliente cliente) {
        this.data = LocalDate.now();
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void setMetodoPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void processarPagamento() {
        double total = calcularTotal();
        if (metodoPagamento != null) {
            boolean aprovado = metodoPagamento.processarPagamento(total);
            if (aprovado) {
                System.out.println("Pagamento concluído com sucesso!");
            } else {
                System.out.println("Falha no processamento do pagamento.");
            }
        } else {
            System.out.println("Nenhum método de pagamento associado.");
        }
    }
}
