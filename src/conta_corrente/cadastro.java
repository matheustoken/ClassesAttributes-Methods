package conta_corrente;

public class cadastro {
	
	private String nome;
	private Integer conta;
	private double saldo;

	
	
public cadastro(String name,Integer conta){	
	
	this.nome = nome;
	this.conta=conta;
}

public cadastro(String name,Integer conta,double inicio_deposito){	
	this.nome = nome;
	this.conta=conta;
	deposito(inicio_deposito);
	}
	   

public String getName() {
	return nome;
}


public Integer getConta() {
	return conta;
}



public double getSaldo() {
	return saldo;
}

public void deposito(double amount) {
   saldo = saldo + amount;	
}

public void saque(double amount) {
  saldo = saldo-amount-5;
}  

public String toString() {
 	return "Conta" 
 		   + conta
 		   +",Nome"
 		   + nome
 		   +",saldo: $"
 		   + String.format("%.2f",saldo);
	
	
}


}
