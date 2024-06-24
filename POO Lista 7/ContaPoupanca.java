public class ContaPoupanca extends Conta  {
   
    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo);
        setLimite(limite);
    }

    public void setLimite(double limit) 
    {
        if(limit <= 1000 && limit >=100)
        {
            this.limite = limit;
        }else{this.limite = 1000;}
        
    }
    public double getLimite() {
        return limite;
    }
   
    public double calculataxas() {
      double  taxa_cobrada = 0;
      return taxa_cobrada;
    }
}
