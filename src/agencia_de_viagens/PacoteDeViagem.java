
package agencia_de_viagens;


public class PacoteDeViagem {
    Transporte transporte;
    Hospedagem hospedagem;
    String destino;
    int quantidadeDeDias; 

    public PacoteDeViagem() {
        
    }
    
    public PacoteDeViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }
    
          
    public double calcularHospedagem(){
        
        return this.quantidadeDeDias * this.hospedagem.getValorDiaria();
    }
    
    public double valorDoLucro(int porcentagem, double valor){
        
        return (porcentagem * valor /100) + valor; 
    }
    
    public double totalDoPacote(){     
        return this.transporte.getValor() + this.calcularHospedagem();        
    }
}
