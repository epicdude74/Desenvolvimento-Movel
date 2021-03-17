import java.util.ArrayList;
import java.util.Collections;
// Online IDE - Code Editor, Compiler, Interpreter

public class CartasTeste
{
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        
        Baralho bar = new Baralho();
        //System.out.println(bar.getSize());
        bar.embaralhar();
        
        for (int i = 0; i < 53; i++){
            System.out.println("Distribuindo "+bar.distribuir());
        }
        
        
    }
}

class Carta {
    private String naipe;
    private String valor;
    
    public Carta(String naipe, String valor){
        this.naipe = naipe;
        this.valor = valor;
    }
    public String toString(){
        return naipe + " de " + valor;
    }
}

class Baralho {
    private ArrayList<Carta> monte;
    private int cartaAtual = 0;
    private final int TOTAL_DE_CARTAS = 52;
    private final String[] VALORES = { "As", "Valete", "Dama", "Rei" };
    private final String[] NAIPES = { "Paus", "Ouros", "Copas", "Espadas" };
    
    public Baralho(){
        monte = new ArrayList<Carta>(TOTAL_DE_CARTAS);
        int i;
        
        //adicionando 40 As (10 de cada naipe)
        for (i = 0; i < 10; i++){
            Carta carta = new Carta(VALORES[0],NAIPES[0]);
            monte.add(carta);
        }
        for (i = 0; i < 10; i++){
            Carta carta = new Carta(VALORES[0],NAIPES[1]);
            monte.add(carta);
        }        
        for (i = 0; i < 10; i++){
            Carta carta = new Carta(VALORES[0],NAIPES[2]);
            monte.add(carta);
        }
        for (i = 0; i < 10; i++){
            Carta carta = new Carta(VALORES[0],NAIPES[3]);
            monte.add(carta);
        }
        
        //System.out.println(getSize());
        
        // aoeaeuaeou  1
        for (i = 0; i < 4; i++){
            Carta carta = new Carta(VALORES[1],NAIPES[i]);
            monte.add(carta);
        }
        
        // System.out.println(getSize());

        //aouaoeuaoeuaoe 2
        for (i = 0; i < 4; i++){
            Carta carta = new Carta(VALORES[2],NAIPES[i]);
            monte.add(carta);
        }
        
       //  System.out.println(getSize());
          
        // aoeuaeouaoeuaoeu 3
        for (i = 0; i < 4; i++){
            Carta carta = new Carta(VALORES[3],NAIPES[i]);
            monte.add(carta);
        }
        
        // System.out.println(getSize());
    }
    
    public int getSize() {
        return monte.size();
    }
    
    public Carta distribuir() throws Exception{
        if (cartaAtual == 52){
            throw new Exception("Nenhuma carta no baralho! Fim de jogo!");
        }
        
        try {
            return monte.get(cartaAtual);
        } finally {
            cartaAtual++;
        }
        //return null;
    }
    
    
    public void embaralhar(){
        System.out.println("Embaralhando o monte!\n");
        Collections.shuffle(monte);
    }
}
