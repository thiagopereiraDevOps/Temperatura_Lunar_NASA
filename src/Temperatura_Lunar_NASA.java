import java.util.Scanner;

public class Temperatura_Lunar_NASA {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int temp[] = new int[10000], Int, i = 0, qtde_med;
        float md;
        System.out.println("Quantas medições foram realizadas: ");
        qtde_med = in.nextInt();
        System.out.println("Qual o intervalo de tempo das medições: ");
        Int = in.nextInt();
        for (i =0; qtde_med > i; i++) {
            System.out.println("Digite a temperatura" + (i + 1) + "");
            temp[i] = in.nextInt();
        }

        System.out.println(+qtde_med + "-medições-A cada-" + Int + "-min");
        for (i = 0; i < qtde_med; i++) {
            System.out.println(+temp[i]);
        }
    }
}
