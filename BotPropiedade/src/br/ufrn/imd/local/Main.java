package br.ufrn.imd.local;

public class Main {

	public static void main(String[] args) {
		Bot bot = new Bot("0");
		bot.cadastrarLocal("casa", "casa");
		bot.cadastrarLocal("caza", "caza");
		bot.cadastrarLocal("casa", "casa");
		bot.cadastrarLocal("casa", "caza");
		bot.mostrarLocalizaoesCadastradas();
	}

}
