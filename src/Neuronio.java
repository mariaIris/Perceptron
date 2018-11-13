/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Iris
 */
public class Neuronio {
    private int[] x;//entrada associada ao peso
    private double[] w;//pesos (novo e atual)
    private int y;//saida do neuronio
    private double e;//erro
    private double n;//taxa de aprend
    //variaveis acrescentadas
    private int yd; //saida desejada
    private final int qtdEntradas;

    public Neuronio(int qtdEntradas) {
        this.qtdEntradas = qtdEntradas;
        w = new double[qtdEntradas];
        x = new int[qtdEntradas];
        n = 0.3;        
    }
   
    public void iniciarPesos(){
        for (int i = 0; i < qtdEntradas; i++) {
            w[i] = 0;
	}
    }
    public void setSaidaDesejada(int valor){
        yd=valor;
    }

    public double setEntradas(int indice, int valor) {
        return x[indice] = valor;
    }
    
    public void calculaSaidaNeuronio(){
        double u = 0;
        for (int i = 0; i < qtdEntradas; i++) {
            u = u + (x[i] * w[i]);
	}
        
	System.out.println("U = "+u);
	//Funcao degrau
	if(u > 0)
            y = 1;
	else
            y = 0;
        
	System.out.println("Y = "+y);
    }
    
    public void setErro(){
        e = yd - y;
        
	if (e != 0)
            atualizaPeso();
	
        System.err.println("e = " + e);
    }
        
    public void atualizaPeso(){
        for (int i = 0; i < qtdEntradas; i++) {
            w[i] = w[i] + n*e*x[i];
            System.out.println("w{" + i + "} = "+w[i]);
        }    
    }
    
    public double getErro() {
        return e;
    }
    
     public double getSaida() {
        return y;
    }
   
}
