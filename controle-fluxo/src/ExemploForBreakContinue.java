
public class ExemploForBreakContinue {

    public static void main(String[] args) {
        for(int numero = 1; numero<10; numero++){

            //Se o numero for igual a 4, sai o laco for
            if (numero == 4) {
                System.out.println("Parou no numero: "+numero);
                continue;
                
            }
            System.out.println("O numero e igual a: "+numero);


        }
    }
}