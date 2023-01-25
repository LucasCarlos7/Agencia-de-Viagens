package agencia_de_viagens;

import java.util.Scanner;


public class Agencia_de_Viagens {

   
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      Hospedagem hospedagem = new Hospedagem();
      Transporte transporte = new Transporte();
      PacoteDeViagem pacoteDeViagem = new PacoteDeViagem();
      Venda venda = new Venda();
      
      
        System.out.println("BEM-VINDO A AGÊNCIA DE VIAGEM");
        System.out.println("Preencha os dados da viagem");
        System.out.println();
        
        System.out.print("Qual o destino desejado: ");
        String destino = entrada.nextLine();
        System.out.print("Quantos dias deseja se hospedar: ");
        int quantidadeDeDias = entrada.nextInt();
        
        System.out.println();
        System.out.println("Agora vamos escolher um hotel: ");
        System.out.print("Digite o nome do Hotel: ");
        entrada.nextLine();
        String nomeHotel = entrada.nextLine();
        System.out.print("Qual o valor da diária do Hotel: ");
        double valorDiaria = entrada.nextDouble();
        
        hospedagem = new Hospedagem(nomeHotel, valorDiaria);
        
     
        
        
        
        System.out.println();
        System.out.println("Agora vamos escolher um meio de transporte: ");
        System.out.print("Qual o meio de tranporte (Avião, ônibus, Trem: )");
        entrada.nextLine();
        String tipoTransporte = entrada.nextLine();
        System.out.print("Qual o valor do transporte: ");
        double valorTransporte = entrada.nextDouble();
        
        transporte = new Transporte(tipoTransporte, valorTransporte);
        
        pacoteDeViagem = new PacoteDeViagem(transporte, hospedagem, destino, quantidadeDeDias);
       
        System.out.println();
        System.out.println("Dados do pagamento: ");
        System.out.print("Por favor, digite o nome do cliente: ");
        entrada.nextLine();
        String nomeCliente = entrada.nextLine();
        System.out.print("Digite a forma de pagamento(Dinheiro, Crédito, débito, pix) : ");
        String pagamento = entrada.nextLine();
        
        venda = new Venda(nomeCliente, pagamento, pacoteDeViagem);
        
        System.out.println();
        System.out.print("Valor do dólar hoje: ");
        double valorDolar = entrada.nextDouble();
        System.out.print("Valor da porcetagem de lucro: ");
        int porcetagem = entrada.nextInt();
        
        System.out.println();
        System.out.println(venda.toString());
        System.out.println("Valor total sem Lucro: "+ pacoteDeViagem.totalDoPacote()); 
        System.out.println(venda.totalDoPacote(porcetagem, pacoteDeViagem.totalDoPacote(), valorDolar));
        
      
    }
    
}
