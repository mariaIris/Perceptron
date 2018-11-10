
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
        int treinamento = 1;
        double erro;
        
        //padroes[4][6] = {{1,0,1,0}, {0,1,0,1},{1,0,0,1},{0,1,1,1},{0,0,1,1},{0,0,0,1}};
    }
    
    public void testarRede(){
        
    }
    
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
