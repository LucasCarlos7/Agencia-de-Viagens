package agencia_de_viagens;

public class Venda {
    String nome;
    String formaDePagamento;
    PacoteDeViagem pacoteDeViagem;

    public Venda() {
    }

    public Venda(String nome, String formaDePagamento, PacoteDeViagem pacoteDeViagem) {
        this.nome = nome;
        this.formaDePagamento = formaDePagamento;
        this.pacoteDeViagem = pacoteDeViagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePag) {
        this.formaDePagamento = formaDePagamento;
    }

    public PacoteDeViagem getPacoteDeViagem() {
        return pacoteDeViagem;
    }

    public void setPacoteDeViagem(PacoteDeViagem pacoteDeViagem) {
        this.pacoteDeViagem = pacoteDeViagem;
    }
    
        
    public double conversor(double cotacao, double dolar){
        return cotacao * dolar;
        
    }
    
    public String totalDoPacote(int porcetagem, double valor, double valorDolar){
       double dolar = pacoteDeViagem.valorDoLucro(porcetagem, valor);
       double real = conversor(dolar, valorDolar);
        return "O total em Dolár é: " + dolar + "\n" +
               "O Valor em Real é: " + real;
    }
    
    @Override
    public String toString(){
        return "Nome do cliente: " + nome + "\n"+
               "Forma de pagamento: " + formaDePagamento + "\n" + 
               "Hotel: " + pacoteDeViagem.getHospedagem().getDescricao() + "\n" +
               "Transporte: " + pacoteDeViagem.getTransporte().getTipo();
    }
}
