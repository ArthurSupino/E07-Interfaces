public class ContaUniversitaria extends Conta{

    private double limite;
    
  
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);
       
    }

    public void setLimite(double limite) {
        if(limite <= 500 && limite >= 0)
        {
            this.limite = limite;
        }
    }
    public double getLimite() {
        return limite;
    }
    @Override
    public double calculataxas(Cliente cliente_recebido) {
        
        double  taxa_cobrada = 0;
        return taxa_cobrada;
    }
}
