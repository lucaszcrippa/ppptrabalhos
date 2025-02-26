
package exemploproduto;


public class Exemploproduto {

    public static void main(String[] args) {
     
        produto produto1 = new produto();
        produto1.setNome("teclado");
        produto1.setPreco(-100);
        
       
         System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço do produto: R$ " + produto1.getPreco());
    
        
        
        
        
    }
    
}
