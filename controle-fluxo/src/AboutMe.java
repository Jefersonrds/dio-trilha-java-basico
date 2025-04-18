import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;



public class AboutMe{

   
    public static void main(String[] args) {
        
     
        //Tranto as excessoes usando try
        try{

            //Criando objeto Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Por favor, digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Agora, digite seu sobrenome:");
            String sobrenome = scanner.nextLine();

            System.out.println("Informe sua idade:");
            int idade = scanner.nextInt();

            //Imprimindo os dados
            System.out.println("Olá " + nome +" " + sobrenome + ", sua idade e: " + idade);

            scanner.close();
        }

        //Tratando o erro
        catch(InputMismatchException e){

            System.out.println("O campo de idade deve ser numerico!");

        }
    }
}