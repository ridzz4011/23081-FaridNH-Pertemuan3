package pertemuan4.code2;

public class suhuMain {
    public static void main(String[] args) {
        // Celsius Converter
        celsiusConverter celsiusConverter = new celsiusConverter();
        System.out.println("Celsius ke Fahrenheit: " + celsiusConverter.celsiusToFahrenheit(25));
        System.out.println("Celsius ke Reamur: " + celsiusConverter.celsiusToReamur(25));

        // Fahrenheit Converter
        fahrenheitConverter fahrenheitConverter = new fahrenheitConverter();
        System.out.println("Fahrenheit ke Reamur: " + fahrenheitConverter.fahrenheitToReamur(77));
    }
}
