package aula5_polimorfismo;

public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor < 200.0) {
            System.out.println("Pagamento com cartão aprovado para valor: R$ " + valor);
            return true;
        } else {
            System.out.println("Pagamento com cartão recusado para valor: R$ " + valor);
            return false;
        }
    }
}
