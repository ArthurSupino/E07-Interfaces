public class OperacaoSaque extends Operacao {

    public String toString()
    {
        String dados_Operacao = " " + getData() + " " + getTipo()+ " "  + getValor();

        return  dados_Operacao;
    }
    public OperacaoSaque(double valor) {
        super('s', valor);
    }
 
    public double calculataxas(Cliente cliente_recebido) {
       
        double  taxa_cobrada = 0.5;
        return taxa_cobrada;
    }
}
