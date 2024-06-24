public class OperacaoDeposito extends Operacao {

    public String toString()
    {
        String dados_Operacao = " " + getData() + " " + getTipo() + " "  + getValor();

        return  dados_Operacao;
    }

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }
   
    public double calculataxas() {
       
        double  taxa_cobrada = 0;
        return taxa_cobrada;
    }
}
