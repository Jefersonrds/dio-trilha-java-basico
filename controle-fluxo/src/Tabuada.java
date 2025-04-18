import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        //Usando matriz para mostrar a tabuada
        for(int i=0;i<=10;i++){
            for(int j=0;j<=10;j++){
                int mutiplicacao = i*j;
                System.out.println(i+"x"+j+"="+mutiplicacao);
            }
            System.out.println("--------------");
        }

        //Usar o scanner e apresentar somente a tabuada que o usuario solicitar
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual tabuada voce quer aprender hoje?");
        int numero = scanner.nextInt();

        for (int i=0;i<=10;i++){
            int multi = numero*i;
            System.out.println(numero+"x"+i+"="+multi);
        }
        
        
        scanner.close();

        for(int x=1;x<=10;x++){
            if ((x % 2 ==0)) {
                System.out.println(x);
            }
        }
    }



}
