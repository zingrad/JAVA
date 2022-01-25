package Calculadora;


public class Main {
    
    public static void main(String[] args){

        //Calculator 
        System.out.println("Calculator");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.divisao(5, 2.5);
        Calculadora.multiplicacao(7, 8);

        //Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(22);

        //Empréstimo 
        System.out.println("Empréstimo");
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



    }
    
}