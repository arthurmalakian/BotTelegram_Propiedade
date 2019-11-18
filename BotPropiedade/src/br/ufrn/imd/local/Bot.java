package br.ufrn.imd.local;

import java.util.ArrayList;

public class Bot {
	private String codigo;
	private ArrayList<Localizacao> locais;
	private ArrayList<Item> itens;
	public Bot(String codigo) {
		this.codigo = codigo;
		this.locais = new ArrayList<Localizacao>();
		this.itens = new ArrayList<Item>();
	}
	
	public void cadastrarLocal(String nome, String descricao) {
		cadastrarLocal(new Localizacao(nome,descricao));
	}
	public void cadastrarLocal(Localizacao local) {
		if(locais.isEmpty()) {
			locais.add(local);
			return;
		}
		for(Localizacao l : locais) {
			if(l.getNome() == local.getNome()&& l.getDescricao() == local.getDescricao() ) {
				System.out.println("Local já cadastrado.");
				return;
			}
		}
		locais.add(local);
	}
	public void mostrarLocalizaoesCadastradas() {
		for(Localizacao l : locais) {
			System.out.print(l.getNome()+ " ");
			System.out.println(l.getDescricao());
		}
	}
}
