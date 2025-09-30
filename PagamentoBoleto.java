package aula5_polimorfismo;

public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor < 1000.0) {
            System.out.println("Pagamento com boleto aprovado para valor: R$ " + valor);
            return true;
        } else {
            System.out.println("Pagamento com boleto recusado para valor: R$ " + valor);
            return false;
        }
    }
}
