public class Operadores {
    public static void main(String[] args){
 
        //Adicao de strings, concatena a mesma
        String nomeCompleto = "Linguagem"+"JAVA";
        System.out.println(nomeCompleto);


        String concatenar = "0";

        concatenar = 1+1+1+1+"1";
        System.out.println(concatenar);
        
        concatenar = 1+1+1+1+"1";
        System.out.println(concatenar);
        
        concatenar = "1"+(1+1+1);
        System.out.println(concatenar);

        concatenar = 1+1+1+1+"1";
        System.out.println(concatenar);


        //Alternando de positivo para negativo
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = numero * (-1);
        System.out.println(numero);

        //incrementacao
        int num = 7;
        num = num+1;
        //ou
        num++;
        //decrementar
        num--;

        boolean teste = true;
        teste = !teste; //inverte o valor da variavel

        //Operador ternario
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);



        //Operador relacional:

        /*
          
        == se for igual
        != se diferente
        < menor
        > maior
        <= menor igual
        >= maior igual
         */

        int num1, num2;
        num1 = 1;
        num2 = 2;

        boolean simNao = num1 == num2;

        System.out.println("é verdadeira?? "+simNao);

        //Operadores logicos
        /*
         && logico E
         || logico OU
         
         */






    }
}
