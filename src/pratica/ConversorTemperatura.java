package pratica;

public class ConversorTemperatura {

	private double celsius;

	// Construtor com validação de dados 
	public ConversorTemperatura(double celsius) {
		if (Double.isNaN(celsius)) {
			throw new IllegalArgumentException("O campo de temperatura deve conter um valor numerico valido.");
		}
		this.celsius = celsius;
	}
	
	// Metodo responsavel por calcular e retornar a temperatura em Fahrenheit
	public double converterParaFahrenheit() {
		return ((9*this.celsius) + 160) / 5;
	}
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
}
