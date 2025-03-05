
package ex05;



public class Ex05 {

   
    public static void main(String[] args) {
       Funcionario funcionario1 = new Funcionario("Lucas", 1500.00);

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: R$" + funcionario1.getSalario());
    }
}
    