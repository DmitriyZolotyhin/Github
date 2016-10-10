import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * Created by Администратор on 05.10.2016.
 */



public  class Calculator1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double X, Sn, P2, Pn1, Pd;
        double P = 0.01;

        System.out.print("Сумма кредита: ");
        double summa = Double.parseDouble(reader.readLine());
        System.out.print("Срок кредита: ");
        double chislo = Double.parseDouble(reader.readLine());

        System.out.println();
        System.out.println();
        X = summa * (P + (P / (Math.pow(1 + P, chislo) - 1)));
        /////////////////

        for (int i = 0; i < chislo; i++) {
            System.out.println(i + 1 + " месяц");
            // X = summa * (P + (P / (Math.pow(1 + P, chislo) - 1)));
            P2 = 0.12;
            Pn1 = summa * P2 / 12;
            Pd = X - Pn1;

            Sn = summa - Pd;


            System.out.print("Остаток осн.долга после совершения текущего платежа: " + Sn);
            System.out.println();
            System.out.print("Общий ежемесячный платеж : " + X);
            System.out.println();
            System.out.println("Процент в счет погашения долга : " + Pd);
            System.out.print("Процентная ставка : " + Pn1);
            System.out.println();
            System.out.println("Хотите внести еще деньги: да 1, нет 2 ");
            int result = Integer.parseInt(reader.readLine());


            if (result == 1) {
                System.out.println("Введите сумму :");

                int splatega = Integer.parseInt(reader.readLine());

                X = X + splatega;
                summa = summa - splatega;

            }
            if (result == 2) {

                summa = summa - X;
            }

            System.out.println();
            System.out.println();

        }
    }
}
