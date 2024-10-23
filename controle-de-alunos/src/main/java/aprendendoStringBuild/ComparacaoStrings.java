package aprendendoStringBuild;

public class ComparacaoStrings {

	public static void main(String[] args) {
		
		String nome1 = "João";
		String nome2 = "joão";
		
		if(nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Os nomes são iguais, ignorando o caso.");
		}else {
			System.out.println("Os nomes são diferentes.");
		}
		
	}

}
