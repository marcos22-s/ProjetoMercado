import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Mercado {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);;
        DecimalFormat df = new DecimalFormat("0.00 ");

        double TotalCompra = 0.0;
        int produto = 0;
        boolean continuar = true;
        double porcentagem = 10;
        double resultado;

        System.out.println("***** MERCADO  DO SEU ZÉ  *****");

        ArrayList<String> ListaProdutos = new ArrayList<>();
        while (continuar){
            System.out.println("Adicione itens aqui ou (Ou 0 ou fim) para sair: ");
            String nome = leitor.next();

            if (nome.equalsIgnoreCase("fim")){
                continuar = false;
            } else {
                System.out.println("o preco "  +  nome  + " é: ");
                double preco = leitor.nextDouble();
                ListaProdutos.add(nome);


                TotalCompra += preco;
                produto++;
            }
        }
        System.out.println("** SEU CUPOM FISCAL **");
        for(String item : ListaProdutos){
            System.out.println("Produtos " + item);
        }
        System.out.println("o total da compra foi de: " + df.format(TotalCompra));
        double media = TotalCompra / produto;
        System.out.println("Sua media por compra é " + df.format(media));
        resultado = (TotalCompra * porcentagem) / 100;
        if(TotalCompra > 100){
            System.out.println("seu desconto foi de " + df.format(resultado));
        } else{
            System.out.println("Seu total compra nao ultrapassou 100$ Sem descontos hoje");
        }

    }
}

