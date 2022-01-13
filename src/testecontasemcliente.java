public class testecontasemcliente {
    public static void main(String[] args) {

        conta02 contanova03 = new conta02();
        System.out.println(contanova03.getSaldo());
        // getSaldo método criado para acessar o valor do atributo encapsulado

        //Impressão do valor null - referência para um valor vazio.
        System.out.println(contanova03.titular);

        // Mensagem de erro por falta de referência
        // Falta criar cliente e fazer a atribuição.
        // contanova03.titular.nome = "Testedenomecliente";
        // System.out.println(contanova03.titular.nome);

        // Correção - criar um novo cliente
        contanova03.titular = new cliente02();
        System.out.println(contanova03);// Imprime a posição da memória

        contanova03.titular.nome = "Teste de nome Cliente";
        System.out.println(contanova03.titular.nome);

    }
}
