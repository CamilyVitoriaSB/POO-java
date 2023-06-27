package br.com.alura.screenmatch.modelos;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class filme {
//ATRIBUTOS: caracteristicas de um Objeto.
	private String nome;
	private int anoDeLancamento;
	private boolean incluindoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMintos;
	private String setNome;
	

	public static void main(String[] args) {
		filme meuFilme = new filme();
// TIPO REFERENCIA:a parte da direita ta criando
//o objeto criando um espaço na memoria, a parte da esquerda e apenas uma referencia esta guardando onde esta o objeto
		meuFilme.setNome = ("O poderoso chefão");
		meuFilme.anoDeLancamento = 1978;
		meuFilme.duracaoEmMintos = 180;
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println(meuFilme.somaDasAvaliacoes);
		System.out.println(meuFilme.totalDeAvaliacoes);
		System.out.println(meuFilme.retornaMedia());
	}
	public void exibeFichaTecnica () {
		System.out.println("Nome do filme:" + nome);
		System.out.println("Ano de lançamento:" + anoDeLancamento);
		System.out.println("Duração do filme:" + duracaoEmMintos);
	}
	public void avalia (double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	public double retornaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
//Usamos get para obter informações. buscar valor
//Esse tipo de método sempre retorna um valor.
	public int getTotalDEAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public void setNome(String nome) {
// this e usado quando o parametro e igual ao atributo
		this.nome = nome;
	}

}
