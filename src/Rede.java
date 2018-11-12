import java.util.Scanner;
/**
 *
 * @author Maria Iris
 */
public class Rede {

    private int qtdAtributos;
    private int qtdPadroes;
    private Neuronio mcp;
    private int padroes[][];
    private int saidaDesejada[];
    private Scanner entrada = new Scanner(System.in);;
    
    public void iniciarRede(){
        System.out.println("INICIANDO...");
        System.out.println("Digite a quantidade de padroes?");
        qtdPadroes = entrada.nextInt();
        System.out.println("Digite a quantidade de atributos dos padroes?");
        qtdAtributos = entrada.nextInt();
           
        mcp = new Neuronio(qtdAtributos); //inicializa o objeto
        
    }
    
    public void treinarRede(){
   
        
        double erro;
	int treino = 1;
	System.out.println("TREINANDO...");
	do {
            erro = 0;
            System.out.println("Treino" + treino++);
            for (int i = 0; i < qtdPadroes; i++) {//lista todos os padroes
		System.out.println("Informe os atributos do padrao:" + i);
		for (int j = 0; j < qtdAtributos; j++) {//lista os atributos e padrões respectivamente
                    mcp.setEntradas(j, entrada.nextInt());//indice e valor dos neuronios
		}
		System.out.println("Informe a saida desejada do padrao citado anteriormente:" + i);
		mcp.setSaidaDesejada(entrada.nextInt());
		mcp.calculaSaidaNeuronio();
		mcp.setErro();
                
		//erro = erro + Math.abs(mcp.getErro()); //Informa o valor absoluto de getErro
            }
        } while (erro > 0);
        
    }
    
    public void testarRede(){
        do {
            System.out.println("TESTANDO...");
            System.out.println("Informe os atributos do padrão:");
            for (int j = 0; j < qtdAtributos; j++) {
		mcp.setEntradas(j, entrada.nextInt());
            }
            mcp.calculaSaidaNeuronio();
        } while (entrada.nextInt() == 5);
    }
    
    public static void main(String[] args) {
        Rede perceptron = new Rede();
	perceptron.iniciarRede();
	perceptron.treinarRede();
	perceptron.testarRede();
    }
    
}