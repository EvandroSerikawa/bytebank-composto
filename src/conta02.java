public class conta02 {

    // Conta02 TODA CONTA TEM UMA REFERÊNCIA A UM CLIENTE ( LIGAÇÃO ).

    private double saldo = 100; // Exemplos de valores Default
    // criar um método getSaldo para poder imprimir o saldo da conta
    int agencia;
    int conta;
    //String titular; Substiuir o tipo String pelo nome da classe cliente para fazer a ligação das classes
    // Atribuir a referencia (flecha ) de titular para cliente.
    cliente02 titular;// = new cliente(); ex: sempre que alguem abrir uma conta já cria um novo cliente por Default
    // Titular recebe os parametros da classe cliente


    // Métodos - Comportamentos do Objeto

    // o que ele devolve ( void )
    // o que ele recebe ( double )
    public void deposita( double valor ){
        this.saldo += valor;

    }

    // Retorna um booleano confirmando se o saque é TRUE ou FALSE
    public boolean saca ( double valor ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transfere(double valor  , conta02 destino ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
           // destino.deposita(valor);
            return true;
        }else{
            return false;
        }

        // Mostra o saldo sem o acesso direto ao atributo.
        // Mostra somente o parametro criado no método mostraSaldo
    }

    public double getSaldo() {
        return this.saldo;
    }
}
