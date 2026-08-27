import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Pra ler do terminal/teclado
        Scanner scanner = new Scanner(System.in);
        int sair = 0;
        System.out.println("--- Iniciando Calculadora ---");
        
        // Criando uma instância da classe Calculadora
        Calculadora calc = new Calculadora();

        do{

        int recuperado = calc.recuperarDaMemoria();
        System.out.println("Valor recuperado da memória:" + recuperado);

        System.out.print("Digite a primeira parcela: ");
        int parcela1 = scanner.nextInt();

        System.out.print("Digite a segunda parcela: ");
        int parcela2 = scanner.nextInt();

        System.out.println("1 Para somar; 2 para subtracao; 3 para divisao; 4 para multiplicacao");
        int operacao = scanner.nextInt();



            switch(operacao){

                    case 1:
                        int resultadoSoma = calc.somar(parcela1, parcela2);
                        System.out.println("Resultado da soma: " + resultadoSoma);
                        calc.salvarNaMemoria();
                        break;
                    case 2:
                        int resultadoSubtracao = calc.subtrair(parcela1, parcela2);
                        System.out.println("Resultado da subtracao: " + resultadoSubtracao);
                        calc.salvarNaMemoria();
                        break;
                    case 3:
                        int resultadoDivisao = calc.dividir(parcela1, parcela2);
                        System.out.println("Resultado da divisao: " + resultadoDivisao);
                        calc.salvarNaMemoria();
                        break;
                    case 4:
                        int resultadoMultiplicacao = calc.multiplicar(parcela1, parcela2);
                        System.out.println("resultado da multiplicacao: " + resultadoMultiplicacao);
                        calc.salvarNaMemoria();
                        break;
                    default:
                        System.out.println("Operacao cancelada!");
                }
            


            System.out.println("sair 0, continuar 1");
            sair = scanner.nextInt();
    
        } while(sair != 0);

        scanner.close();   
    }
}