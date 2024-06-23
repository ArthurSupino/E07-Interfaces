import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                                        new Date(), "111.111.111-11", 36, 'm');
        Cliente lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
                                        new Date(), "000.00000.0000/0001", 25, "Comércio");
        //Cliente fantasma
        
        Cliente fantasminha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
        new Date(), "000.00000.0000/0001", 25, "Comércio");


        //Teste do equals de clientes
        System.out.println(lojinha.equals(fantasminha));
        //contas
        Conta conta1 = new ContaPoupanca(1234, joao, 0,200);
        Conta conta2 = new ContaUniversitaria(12121, lojinha, 10000,200);
        //Conta fantasma para testar o equals
        Conta fantasma = new ContaCorrente(12121, lojinha, 10000,200);
        

        conta1.depositar(3000);
        conta1.depositar(2000);
        conta1.sacar(500);
        fantasma.sacar(100);
        
        conta2.transferir(conta1, 666);
        conta2.depositar(234);
        conta1.imprimirExtratoTaxas();
        fantasma.imprimirExtratoTaxas();
        //implementacao do equals
        //retorna true devido ao fato do numero ser igual e é verificado no metodo equals
        System.out.println(conta2.equals(fantasma.getNumero()));
       //Nova forma de imprimir 
        System.out.println("--------------------");
        System.out.println(conta1.toString());
        System.out.println("--------------------");
        System.out.println(conta2.toString());
        System.out.println("--------------------");
        //Forma antiga com modificacoes internas
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        //teste da implementacao dos novos metodos 
        System.out.println("Informacoes dos usuarios : ");
        System.out.println("-------------------");
        System.out.println(lojinha.toString());
        System.out.println("-------------------");
        System.out.println(joao.toString());
        System.out.println("-------------------");
        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);
    }
}