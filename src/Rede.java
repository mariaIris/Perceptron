
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    private Scanner entrada;
    
    public void iniciaRede(){
       //Scanner entrada = new Scanner(System.in);
       System.out.print("Informe os numeros de PADROES:");
       qtdPadroes = entrada.nextInt();
       System.out.print("Informe os numeros de ATRIBUTOS:");
       qtdAtributos = entrada.nextInt();
       
       //mcp = new Neuronio(int qtdAtributos);
    }
    
    public void treinaRede(){
        //int treinamento = 1;
        //double erro;
        
        //padroes[4][6] = {{1,0,1,0}, {0,1,0,1},{1,0,0,1},{0,1,1,1},{0,0,1,1},{0,0,0,1}};
        
        double erro;
		int iteracao = 1;
		System.out.println("--------------------------------");
		System.out.println("TREINANDO REDE NEURAL PERCEPTRON");
		System.out.println("--------------------------------");
		do {
			System.out.println("ITERACAO " + iteracao++);
			erro = 0;
			for (int i = 0; i < qtdPadroes; i++) {//Mostra todos os padroes
				System.out.println("ENTRE COM OS ATRIBUTOS DO PADRAO "+i);
				for (int j = 0; j < qtdAtributos; j++) {//Mostra os atributos de cada padrao
					mcp.setEntrada(j, entrada.nextInt());//indice e valor da entrada do neuronio
				}
				System.out.println("ENTRE COM A SAIDA DESEJADA DO PADRAO " + i);
				mcp.setSaidaDesejada(entrada.nextInt());
				mcp.calcSaidaNeuronio();
				mcp.setErro();
				erro = erro + Math.abs(mcp.getErro()); //TODO valor absoluto de getErro
			}
		} while (erro > 0);
		System.out.println("--------------------------------");

    }
    
    public void testarRede(){
        
    }
    
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
