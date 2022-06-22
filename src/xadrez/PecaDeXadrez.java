package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDeXadrez extends Peca{

	private CoresPecas cor;
	
	public PecaDeXadrez(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public CoresPecas getCor() {
		return cor;
	}
	
	
}
