
package loopfor;

public class LoopFor {

    public static void main(String[] args) {
        // for normal:
        for (int i = 0; i < 5; i++){
            System.out.println("i tem valor: " + i);
        }
        
        for (int i = 5; i > 0; i--){
            System.out.println("i tem valor: " + i);
        }
        // for com mais de uma variavel:
        for (int i = 0, j = 10 ; i < j ; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }
        // for com partes ausentes:
        int count = 0;
        for ( ; count < 10 ; ){
            System.out.println("Valor de count: " + count);
            count += 2;
        }
        for (int cont = 0 ; cont < 10 ; cont += 2){
            System.out.println("Valor de cont: " + cont);
        }
        
        // loop infinito: (não faça isso, é infinito mesmo)
        // for ( ; ; )
        
        // loop sem corpo
        int soma = 0;
        for ( int i = 1 ; i < 10 ; soma += i++){

            System.out.println("soma = " + soma + "  i = " + i);  
        }
        System.out.println("O valor da soma is " + soma);
        // Aqui só para demonstrar que ele executa na repetição
        // Apenas oque esta dentro dos conchetes
        for (int i = 0 ; i < 5 ; i++) {
        System.out.println("i tem valor: " + i);  
        System.out.println("i tem valor: ");
        }
    }
}