public class Calculadora {
   
    private int memoria = 0;
    private int ultimoResultado = 0;

    public int somar(int parcela1, int parcela2) {
        this.ultimoResultado = parcela1 + parcela2;
        return ultimoResultado;
    }

    public int subtrair(int parcela1, int parcela2) {
        this.ultimoResultado = parcela1 - parcela2;
        return ultimoResultado;
    }

    public int multiplicar(int parcela1, int parcela2){
        this.ultimoResultado = parcela1 * parcela2;
        return ultimoResultado;
    }

    public int dividir(int dividendo, int divisor){
        if(divisor == 0){
            System.out.println("Não podemos dividir por 0");
            return 0;
        }else{
            this.ultimoResultado = dividendo / divisor;
            return ultimoResultado;
        }
    }

    // Salvando na memória

      public void salvarNaMemoria() {
         this.memoria = this.ultimoResultado;
     }

     public int recuperarDaMemoria() {
        return this.memoria;
    }

}