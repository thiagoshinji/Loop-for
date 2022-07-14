
package loopfor;

public class ComentariosExplicativos {

    public static void main(String[] args) {
        // Estrutura do for:
        // for ( x ; x ; x){
        
        // PRIMEIRO CAMPO  
        // Inicialmente declara-se uma variavel no primeiro campo
        // e atribui-se a ela um valor
        
        // SEGUNDO CAMPO (CONDICIONAL)
        // Se i for menor que 5, execute oque esta no conchete{
        
        // TERCEIRO CAMPO
        // Após executar oque esta no conchete, incremente o i
        for (int i = 0; i < 5; i++){
            System.out.println("i tem valor: " + i);
        }
        System.out.println();
        
        for (int i = 5; i > 0; i--){
            System.out.println("i tem valor: " + i);
        }
        System.out.println();
        
        // for com mais de uma variavel:
        for (int i = 0, j = 10 ; i <= j ; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }
        System.out.println();
        
        // for com partes ausentes:
        int count = 0;
        for ( ; count < 10 ; ){
            System.out.println("Valor de count: " + count);
            count += 2;
        }
    }
    
}
