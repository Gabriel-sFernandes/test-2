import java.util.Scanner;
import java.util.Locale;

public class exercicioSalario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nmrFunc, horasTrab;
        double valorHora, salario;

        nmrFunc = sc.nextInt();
        horasTrab = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horasTrab * valorHora;

        Locale.setDefault(Locale.US);
        System.out.printf("NUMBER = %d\nSALARY = US$ %.2f", nmrFunc, salario);
        sc.close();

    }

}
