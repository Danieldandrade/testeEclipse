
package aula;

import java.util.Scanner;


public class JavaExerciocio01 {

    public static void main(String[] args) {
        Funcionario funcionario1= new Funcionario();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite a Matricula do Funcionario");
        funcionario1.matricula=sc.nextInt();
        
        System.out.println("Digite o nome do Funcionario");
        funcionario1.nome=sc.next();
        
        System.out.println("Digite o valor do Salario");
        funcionario1.salarioBase=sc.nextDouble();
        
        funcionario1.calculaInss();
        funcionario1.calculaRiocard();
        funcionario1.calculaBruto();
        
        System.out.println("Olerite");
        System.out.println("Matricula dio Funcionario "+ funcionario1.matricula);
        System.out.println("Nome do Funcionario "+funcionario1.nome);
        System.out.println("Salario Base do Funcionario "+funcionario1.salarioBase);
        System.out.println("Desconto de INSS "+funcionario1.inss );
        System.out.println("Desconto do RioCard "+funcionario1.riocard );
        System.out.println("Salario Bruto do Funcionario "+funcionario1.salarioBruto );
        

    }
    
}
