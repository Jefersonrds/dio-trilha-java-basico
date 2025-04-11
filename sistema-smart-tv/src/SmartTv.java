public class SmartTv {
    
    //Declaracoes iniciais
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //ligar e desligar
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    //--------------------------


    //aumentar e diminuir o volume
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    //-------------------------

    //mudar de canal
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    
}
