public class testesacavaloresnegativos {
    public static void main(String[] args) {

        conta02 contaNova04 = new conta02();

        contaNova04.deposita(100);
        System.out.println(contaNova04.saca(400));
        // Imprime false e 200 ( 100 parametro de saldo qndo cria a conta + 100 do deposita

        System.out.println(contaNova04.getSaldo());
        // getSaldo método criado para acessar o valor do atributo encapsulado
        // Imprime o 200 false ( Faltou 200 para realizar a transação )


        // Imprime o valor negativo alterando diretamente no atributo saldo
        // Para protege o atributo, utilizar o encapsulamento.
        // Inserir o private no double saldo dentro da classe conta02
        // contaNova04.saldo = contaNova04.saldo - 201;
        // System.out.println(contaNova04.saldo);

        System.out.println(contaNova04.getSaldo());

    }
}
