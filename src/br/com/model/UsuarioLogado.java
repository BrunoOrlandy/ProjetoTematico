package br.com.model;

public class UsuarioLogado {

	public static String user;

	private UsuarioLogado() {
		user = "";
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		UsuarioLogado.user = user;
	}

}
