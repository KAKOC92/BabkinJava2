import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите строку 'a'");
        String a = console.nextLine();
        System.out.println("Введите стоку 'b'");
        String b = console.nextLine();

        if (a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}