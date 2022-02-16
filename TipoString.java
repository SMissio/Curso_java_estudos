package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "João";
		var sobrenome = "Santos";
		var Idade = 33;
		var salario = 3000.33;
		String maisUmaFrase = "Nome: " + nome + " \nSobrenome: "+ sobrenome + "\nIdade: " + Idade + "\nSalario: "+ salario + "\n\n"; 
		
		System.out.println(maisUmaFrase);
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$ %.2f", nome,sobrenome,Idade,salario);
		
		String frase = String.format("\n\nO Senhor %s %s tem %d anos e ganha R$ %.2f", nome,sobrenome,Idade,salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".matches(frase));
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
