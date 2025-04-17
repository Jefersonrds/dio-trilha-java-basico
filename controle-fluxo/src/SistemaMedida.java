import java.util.Scanner;

public class SistemaMedida{
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("O tamanho da sua camisa é: P, M ou G?");
        String tamanhoCamisa = scanner.next().toUpperCase();

        switch (tamanhoCamisa){

            case "P":{
                System.out.println("Sua camisa e pequena");
                break;
            }

            case "M":{
                System.out.println("Sua camisa e media");
                break;
            }

            case "G":{
                System.out.println("Sua camisa e graaaade");
                break;
            }

            default:
                System.out.println("Tamanho invalido!");
            
        }

    }
}