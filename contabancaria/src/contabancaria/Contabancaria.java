
package contabancaria;


public class Contabancaria {

    
    public static void main(String[] args) {
   conta conta = new conta("Lucas", 1412.0);
        
        
        System.out.println("Saldo inicial de " + conta.titular + ": R$ " + conta.getSaldo());
                
        conta.depositar(500.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
               
        conta.sacar(300.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
              
        conta.sacar(1500.0);
              
        conta.sacar(110.0);
    }
}