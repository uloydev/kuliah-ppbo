public class KonversiSuhuTest {
    public static void main(String[] args) {
        double suhuCelcius, suhuFahrenheit, hasilCelcius, hasilFahrenheit;
        suhuCelcius = 37;
        suhuFahrenheit = 145;

        KonversiSuhu temp = new KonversiSuhu();
        hasilCelcius = temp.toCelcius(suhuFahrenheit);
        hasilFahrenheit = temp.toFahrenheit(suhuCelcius);

        print("======= Temperature Converter =======");
        print("Suhu " + suhuCelcius + " celcius sama dengan " + hasilFahrenheit + " fahrenheit");
        print("Suhu " + suhuFahrenheit + " fahrenheit sama dengan " + hasilCelcius + " celcius");
    }

    private static void print(Object any) {
        System.out.println(any);
    }
}

class KonversiSuhu {
    double celcius, fahrenheit;

    public double toFahrenheit(double celcius) {
        this.fahrenheit = (celcius * 9 / 5) + 32;
        return this.fahrenheit;
    }

    public double toCelcius(double fahrenheit) {
        this.celcius = (fahrenheit - 32) * 5 / 9;
        return this.celcius;
    }
}