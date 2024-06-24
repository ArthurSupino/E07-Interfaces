abstract class Conta implements ITaxas {

    private int numero;

    protected Cliente dono;

    private double saldo;

    protected double limite;

    private Operacao[] operacoes;

    private int proximaOperacao;

   

    private static int totalContas = 0;

    public Conta(int numero, Cliente dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    

        this.operacoes = new Operacao[1000];
        this.proximaOperacao = 0;
        

        Conta.totalContas++;
    }

    public void imprimirExtratoTaxas()
    {   
        double soma = 0;
        
       
        System.out.println("Extrato Taxas : ");
        System.out.println("=======================");
        System.out.println("Taxa de manuntencao : " + this.calculataxas());
        System.out.println("Operacoes: ");
        
        for(Operacao atual : operacoes)
        {   
            if(atual != null){
                if(atual.getTipo() == 's')
                {
                    int i = 0;
                    System.out.println("Saque " + i+1 + ": " + atual.calculataxas());
                    i++;
                    soma += atual.calculataxas(); 
                }
            }
            
        }
        soma = soma + this.calculataxas();
        System.out.println("Gasto total : " +  soma);
        System.out.println("=-----------------------------------=");
        
     
    }

    public boolean sacar(double valor) {
        if (valor >= 0 && valor <= this.limite) {
            this.saldo -= valor ;

            this.operacoes[proximaOperacao] = new OperacaoSaque(valor);
            this.proximaOperacao++;
            
            return true;
        }

        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;

        this.operacoes[proximaOperacao] = new OperacaoDeposito(valor);
        this.proximaOperacao++;
    }

    public boolean transferir(Conta destino, double valor) {
        boolean valorSacado = this.sacar(valor);
        if (valorSacado) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean equals(int numero)
    {
        return this.numero == numero;
    }
    
    public String toString()
    {
        String contaStr = "Conta : "  +  this.numero + "\n" + " Saldo : " + this.saldo + "\n" + "Limite : " + this.limite ;

        return contaStr;
    }
    public void imprimirExtrato() {
        System.out.println("======= Extrato Conta " + this.numero + "======");
        for(Operacao atual : this.operacoes) {
            if (atual != null) {
                
                System.out.println(atual.toString()); 
               
            }
        }
        System.out.println("====================");
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
}
