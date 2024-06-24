public class ContaCorrente extends Conta {

    
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
   
    public double calculataxas() {

        double taxa_cobrada;
        if ( this.dono.getClass() == PessoaJuridica.class) {
                taxa_cobrada = 20;

        }
        else 
        {
                taxa_cobrada = 10;
                
        }
        return taxa_cobrada;
      
       
            
       
       
    }   
}
