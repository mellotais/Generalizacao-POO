package exerc9;

public class Apolo11 extends NaveEspacial {
	private String tipoCombustivel;

	public Apolo11(double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Apolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append("]");
		return builder.toString();
	}
}
