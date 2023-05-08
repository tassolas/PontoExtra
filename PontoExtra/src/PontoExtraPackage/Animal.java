package PontoExtraPackage;

public class Animal {
	String nome;
	float comprimento;
	int numero_de_patas;
	String cor;
	String ambiente;
	float velocidade_media;
	
	public Animal(String nome, float comprimento, int numero_de_patas, String cor, String ambiente, float velocidade_media) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numero_de_patas = numero_de_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade_media = velocidade_media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumero_de_patas() {
		return numero_de_patas;
	}

	public void setNumero_de_patas(int numero_de_patas) {
		this.numero_de_patas = numero_de_patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade_media() {
		return velocidade_media;
	}

	public void setVelocidade_media(float velocidade_media) {
		this.velocidade_media = velocidade_media;
	}

	public String verDados() {
		return "Animal [nome= " + nome + ", comprimento= " + comprimento + " cm" + ", numero_de_patas= " + numero_de_patas
				+ ", cor= " + cor + ", ambiente= " + ambiente + ", velocidade_media= " + velocidade_media + " km/h]";
	}
	
	
}
