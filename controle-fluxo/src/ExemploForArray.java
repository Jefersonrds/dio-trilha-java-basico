public class ExemploForArray {
    public static void main(String[] args) {
    
        //Usar laco for em array
        String alunos[]= {"FELIPE","JONAS","JULIA", "MARCOS"};

        for (int x=0;x<alunos.length;x++){
            System.out.println("O aluno no indice "+x+" e "+alunos[x]);
        }

        //usando for each
        for (String aluno : alunos){
                System.out.println("O nome do aluno e: " + aluno);
        }

    
    }        
}