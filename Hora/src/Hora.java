
public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	public String exibirHoraUniversal() {
		return "Formato universal: " + formataDig(hora) + ":" + formataDig(minuto) + ":" + formataDig(segundo);
	}

	public String exibirHoraPadrao() {
		String res, sufixo;
		if (hora == 0) {
			res = "12";
			sufixo = " AM";
		} else if (hora == 12) {
			res = "12";
			sufixo = " PM";
		} else if (hora >= 1 && hora <= 11) {
			res = formataDig(hora);
			sufixo = " AM";
		} else {
			res = formataDig(hora - 12);
			sufixo = " PM";
		}
		return "Formato padrão: " + res + ":" + formataDig(minuto) + ":" + formataDig(segundo) + sufixo;
	}

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void setTime(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}

	public void setTime(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}

	public void setTime() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	private String formataDig(int valor) {
		return (valor < 10) ? "0" + valor : "" + valor;
	}
}
