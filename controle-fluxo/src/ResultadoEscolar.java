public class ResultadoEscolar {
    
    public static void main(String[] args) {
        int nota = 6;

        if (nota>=7)
            System.out.println("Aprovado");
        
        else if (nota>= 5 && nota < 7){
            System.out.println("Voce esta de recuperacao");
        }
        
            else
            System.out.println("Reprovado");

        //Outra forma de criar o resultado é
        int novaNota = 6;

        String resultado = novaNota >= 7 ? "Aprovado" : novaNota >=5 && novaNota < 7 ? "Recuperacao" :"Reprovado";

        System.out.println(resultado);

    }

    
}
