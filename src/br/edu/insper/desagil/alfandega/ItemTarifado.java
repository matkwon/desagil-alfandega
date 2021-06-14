package br.edu.insper.desagil.alfandega;

public class ItemTarifado extends Item {
	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		super(nome, valor, rate);
		super.tarifa = tarifa;
	}
}
