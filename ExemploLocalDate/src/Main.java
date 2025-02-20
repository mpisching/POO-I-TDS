import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();
        System.out.println("Data não formatada..: " + data);
        System.out.println("Data formatada......: " + dtf.format(data));

        //iniciando um LocalDate com uma data específica - ano, mes, dia
        LocalDate dataNascimento = LocalDate.of(2000, 10, 25);
        System.out.println("Nova data: " + dtf.format(dataNascimento));

        //iniciando com uma data específica formatada
        LocalDate dataNascimento2 = LocalDate.parse("30/01/1999", dtf);
        System.out.println("Outra data: " + dtf.format(dataNascimento2));
    }
}