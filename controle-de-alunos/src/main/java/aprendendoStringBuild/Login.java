package aprendendoStringBuild;

public class Login {

	public static void main(String[] args) {
		
		String usuario = "admin";
		String senha = "123";
		
		String usuarioDigitado = "@dmin";
		String senhDigitada = "123";
		
		if(usuario.equalsIgnoreCase(usuarioDigitado) && senha.equals(senhDigitada) ) {
			System.out.println("Login bem-sucedido!");
		}else {
			System.out.println("Usuário ou senha inválido!");
		}
		
	}

}
