package aula;


public class Funcionario {
    
    public int matricula;
    public String nome;
    public double salarioBase;
    public double inss;
    public double riocard;
    public double salarioBruto;
    
    
    public Funcionario(int matricula,String nome,double salarioBase){
        this.matricula=matricula;
        this.nome=nome;
        this.salarioBase=salarioBase;
        this.inss=(this.salarioBase*9)/100;
        this.riocard=(this.salarioBase*6)/100;
        this.salarioBruto=(this.salarioBase-this.inss)-this.riocard;
    }
    public Funcionario(){
        
    }
    public double calculaInss(){
        this.inss=(this.salarioBase*9)/100;  
        return inss;
    }
    public double calculaRiocard(){
        this.riocard=(this.salarioBase*6)/100; 
        return riocard;
    }
    public double calculaBruto(){
        this.salarioBruto=this.salarioBase-this.inss-this.riocard;
        return salarioBruto;
    }


    
}
