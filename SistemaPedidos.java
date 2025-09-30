package aula5_polimorfismo;

public class SistemaPedidos {
    public static void main(String[] args) {
        Cliente cliente = new ClientePJ("Shein", "shein@email.com", "12.345.678/0001-99");
        Produto produto = new Produto("Camiseta", 50.0, 10);

        Pedido pedido1 = new Pedido(cliente);
        pedido1.adicionarItem(produto, 3);
        pedido1.setMetodoPagamento(new PagamentoCartaoCredito("1111-2222-3333-4444"));
        pedido1.processarPagamento();

        Pedido pedido2 = new Pedido(cliente);
        pedido2.adicionarItem(produto, 10);
        pedido2.setMetodoPagamento(new PagamentoCartaoCredito("5555-6666-7777-8888"));
        pedido2.processarPagamento();

        Pedido pedido3 = new Pedido(cliente);
        pedido3.adicionarItem(produto, 16);
        pedido3.setMetodoPagamento(new PagamentoBoleto("123456789000"));
        pedido3.processarPagamento();

        Pedido pedido4 = new Pedido(cliente);
        pedido4.adicionarItem(produto, 30); 
        pedido4.setMetodoPagamento(new PagamentoBoleto("987654321000"));
        pedido4.processarPagamento();
    }
}
