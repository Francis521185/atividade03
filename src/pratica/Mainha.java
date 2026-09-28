package pratica;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		try {
			System.out.println("Digite a temperatura em graus Centigrados (Celsius): ");
			
			// Valida se o campo numerico aceita apenas numeros
			if (!leia.hasNextDouble()) {
				System.out.println("Erro: Campo numerico aceita numeros validos.");
				return;
			}
			
			double valorCelsius = leia.nextDouble();
			
			//Instanciação do objeto aplicando as regras orientadas a objetos
			ConversorTemperatura conversor = new ConversorTemperatura(valorCelsius);
			
			// Chamada do metodo  para realizar o  calculo
			double fahrenheit = conversor.converterParaFahrenheit();
			
			// Exibição da mensagem de confimação e resultado com sucesso
			System.out.printf("Operação concluida com sucesso! A temperatura em Fahrenhei e: %.2f°F\n", fahrenheit);
		
		} catch (InputMismatchException e) {
			System.out.println("Erro: Formato de erro");
			
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de validação: " + e.getMessage());
		}
			finally {leia.close();}
		//teste
		// com
	}

}
