package tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int linha, int coluna) { //METODO PARA RETORNAR A PECA PASSANDO A LINHA E COLUNA DELA
		return this.pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) { //SOBRECARGA DO METODO ACIMA, PARA A RETORNAR A PEÇA DADA UMA POSICAO
		return this.pecas[posicao.getLinha()][posicao.getColuna()];
	}
}
