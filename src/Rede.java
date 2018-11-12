import java.util.Scanner;
/**
 *
 * @author Maria Iris
 */
public class Rede {

    private int qtdAtributos;
    private int qtdPadroes;
    private Neuronio mcp;
    //private int padroes[][];
    //private int saidaDesejada[];
    private Scanner entrada = new Scanner(System.in);;
    
    public void iniciaRede(){
      
       System.out.print("Informe os numeros de PADROES:");
       qtdPadroes = entrada.nextInt();
       System.out.print("Informe os numeros de ATRIBUTOS:");
       qtdAtributos = entrada.nextInt();
       
       //mcp = new Neuronio(int qtdAtributos);
    }
    
    public void treinaRede(){
        double erro;
        int treinamento = 1; 
        
        //padroes[][] = {{1,0,1,0}, {0,1,0,1},{1,0,0,1},{0,1,1,1},{0,0,1,1},{0,0,0,1}};
        
        
        System.out.println("Treinamento da Rede Neural:");
        
        do {
            System.out.println("Treinamento " + treinamento++);
            erro = 0;
                for (int i = 0; i < qtdPadroes; i++) {//Mostra todos os padroes
                    System.out.println("Digite os ATRIBUTOS"+i);
                    for (int j = 0; j < qtdAtributos; j++) {// os atributos de cada padrao
                        mcp.setEntradas(j, entrada.nextInt());//indice e valor do neuronio
                    }
                    System.out.println("Digite as saídas desejadas do PADRAO " + i);
                    mcp.setSaidaDesejada(entrada.nextInt());
                    mcp.calculaSaidaNeuronio();
                    mcp.setErro();
                    
                    erro = erro + Math.abs(mcp.getErro()); //valor de getErro
                }
        } while (erro > 0);
    }
    
    public void testarRede(){
        do {
            System.out.println("EXECUTANDO REDE NEURAL PERCEPTRON");
            System.out.println("--------------------------------");
            System.out.println("Digite os ATRIBUTOS do PADRAO");
            for (int j = 0; j < qtdAtributos; j++) {
                mcp.setEntradas(j, entrada.nextInt());
            }
            mcp.calculaSaidaNeuronio();
            System.out.println("Padrão que pertence a classe: " + mcp.getSaida());
            //System.out.println("DIGITE 9 PARA CONTINUAR");
	} while (entrada.nextInt() == 9); //9
	
	}
    
    public static void main(String[] args) {
        Rede perceptron = new Rede();
	perceptron.iniciaRede();
	perceptron.treinaRede();
	perceptron.testarRede();
    }
    
}