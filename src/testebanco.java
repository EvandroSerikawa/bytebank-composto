public class testebanco {
    public static void main(String[] args) {

        // Referência + Variável = novo referencia
        cliente02 nomeCliente02 = new cliente02();

        // Popular os atributos ( setar os atributos )
        nomeCliente02.nome = "Evandro Serikawa";
        nomeCliente02.CPF = "999.999.999-99";
        nomeCliente02.Profissão = "Programador";

        //Referência + Variável = novo referencia
        conta02 contaNova = new conta02();
        contaNova.deposita(100);

        //Associa o cliente nomeCliente a conta contaNova
        contaNova.titular  = nomeCliente02;
        System.out.println(contaNova.titular.nome);


        System.out.println("Referencia ao mesmo objeto nas linhas abaixo.");
        System.out.println(contaNova.titular);
        System.out.println(nomeCliente02);
    }
}
