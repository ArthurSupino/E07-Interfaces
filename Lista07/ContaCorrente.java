public class ContaCorrente extends Conta {

    
    private double limite;
    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);  
    }
    public void setLimite(double limite) {
        if(limite > -100)
        {
            this.limite = limite;
        }
        
    }
    public double getLimite() {
        return limite;
    }
   
    public double calculataxas(Cliente cliente_recebido) {
        double taxa_cobrada;
       if ( cliente_recebido.getTipo() == "J" ) {
            taxa_cobrada = 20;

       }
       else if (cliente_recebido.getTipo() == "F")
       {
            taxa_cobrada = 10;
       }
       else
       {
            taxa_cobrada = 0;
       }
       return taxa_cobrada;
    }   
}
