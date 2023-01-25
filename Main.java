import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        boolean a = true;

        while (a != false) {
            System.out.println("Операции:\n1.Найти сумму\n2.Найти разность\n3.Найти произведение\n4.Найти частное\n5.Возвести в степень\n6.Найти факториал");
            Scanner in = new Scanner(System.in);
            double chislo1 = 0.0;
            double chislo2 = 0.0;
            try {
                short choise = in.nextShort();
                switch (choise) {
                    case 1:
                        try {
                            System.out.println("Первое число: ");
                            chislo1 = in.nextDouble();
                            System.out.println("Второе число: ");
                            chislo2 = in.nextDouble();
                            chislo1 += chislo2;
                            System.out.println("Результат: " + chislo1);
                            break;
                        } catch (Exception e) {
                            System.out.println("Это не похоже на число\n");
                            break;
                        }
                    case 2:
                        try {
                            System.out.println("Первое число: ");
                            chislo1 = in.nextDouble();
                            System.out.println("Второе число: ");
                            chislo2 = in.nextDouble();
                            chislo1 -= chislo2;
                            System.out.println("Результат: "+ chislo1);
                            break;
                        } catch (Exception e) {
                            System.out.println("Это не похоже на число\n");
                            break;
                        }

                    case 3:
                        try {
                            System.out.println("Первое число: ");
                            chislo1 = in.nextDouble();
                            System.out.println("Второе число: ");
                            chislo2 = in.nextDouble();
                            chislo1 *= chislo2;
                            System.out.print("Результат: " + chislo1);

                            break;
                        } catch (Exception e) {
                            System.out.println("Это не похоже на число\n");
                            break;
                        }
                    case 4:
                        try {
                            System.out.println("Введите делимое: ");
                            chislo1 = in.nextDouble();
                            System.out.println("Введите делитель: ");
                            chislo2 = in.nextDouble();
                            chislo1 /= chislo1;
                            System.out.print("Результат: " + chislo1);
                            break;
                        } catch (Exception e) {
                            System.out.println("Вы ввели не число\n");
                            break;
                        }
                    case 5:
                        double chislo3 = 0.0;
                        try {
                            System.out.println("Первое число: ");
                            chislo1 = in.nextDouble();
                            System.out.println("Второе число: ");
                            chislo2 = in.nextDouble();
                            chislo3 = Math.pow(chislo1,chislo2);
                            System.out.print("Результат: " + chislo3);
                            break;
                        } catch (Exception e) {
                            System.out.println("Это не похоже на число\n");
                            break;
                        }
                    case 6:
                        try {
                            System.out.println("Введите число: ");
                            chislo1 = in.nextDouble();
                            chislo2 = 1;
                            for (short i = 2; i <= chislo1; i++ )
                            {
                                chislo2 = chislo2 * i;
                            }
                            System.out.println(chislo2);
                        }
                        catch (Exception e) {
                            System.out.println("Вы ввели не число\n");
                            break;
                        }
                }
            }
            catch (Exception e) {
                System.out.println("Это не похоже на число\n");
            }
        }
    }
}