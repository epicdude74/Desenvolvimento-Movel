
// Online IDE - Code Editor, Compiler, Interpreter

public class FigurasMoveisTeste
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        
        if (args[0].charAt(0) == 'c'){
            CirculoMovel cir = new CirculoMovel(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]));
            System.out.println(cir.toString());
            
            cir.moverParaCima();
            System.out.println(cir.toString());
            
            cir.moverParaDireita();
            System.out.println(cir.toString());
        
            cir.moverParaBaixo();
            System.out.println(cir.toString());
            
            cir.moverParaEsquerda();
            System.out.println(cir.toString());
            
        }
        
        else if (args[0].charAt(0) == 'r'){
            RetanguloMovel ret = new RetanguloMovel(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]),Integer.parseInt(args[6]));
            System.out.println(ret.toString());
            
            ret.moverParaCima();
            System.out.println(ret.toString());
            
            ret.moverParaDireita();
            System.out.println(ret.toString());
        
            ret.moverParaBaixo();
            System.out.println(ret.toString());

            ret.moverParaEsquerda();
            System.out.println(ret.toString());
        }
    }
}


interface Movel {
    void moverParaCima();
    void moverParaBaixo();
    void moverParaEsquerda();
    void moverParaDireita();
}

class CirculoMovel implements Movel {
    private int raio;
    private PontoMovel centro;
    
    public CirculoMovel(int raio, int x, int y, int velX, int velY){
        this.raio = raio;
        centro = new PontoMovel(x,y,velX,velY);
    }
    public String toString(){
        return "CirculoMovel [raio="+raio+", PontoMovel [x ="+centro.getX()+", y="+centro.getY()+", velX="+centro.getvelX()+", velY="+centro.getvelY()+"]";
    }
    public void moverParaCima(){
        System.out.println("Movendo para cima.");
        centro.moverParaCima();
    }
    public void moverParaBaixo(){
        System.out.println("Movendo para baixo.");
        centro.moverParaBaixo();
    }
    public void moverParaEsquerda(){
        System.out.println("Movendo para esquerda.");
        centro.moverParaEsquerda();
    }
    public void moverParaDireita(){
        System.out.println("Movendo para direita.");
        centro.moverParaDireita();
    }
}

class RetanguloMovel implements Movel {
    
    private PontoMovel superiorEsquerda;
    private PontoMovel inferiorDireita;
    
    public RetanguloMovel(int x1, int y1, int x2, int y2, int velX, int velY) {
        superiorEsquerda = new PontoMovel(x1,y1,velX,velY);
        inferiorDireita = new PontoMovel(x2,y2,velX,velY);
    }
    public String toString(){
        return "RetanguloMovel[x1="+superiorEsquerda.getX()+", y1="+superiorEsquerda.getY()+", x2="+inferiorDireita.getX()+", y2="+inferiorDireita.getY()+"]";
    }
    public void moverParaCima(){
        System.out.println("Movendo para cima");
        superiorEsquerda.moverParaCima();
        inferiorDireita.moverParaCima();
    }
    public void moverParaBaixo(){
        System.out.println("Movendo para baixo");
        superiorEsquerda.moverParaBaixo();
        inferiorDireita.moverParaBaixo();
    }
    public void moverParaEsquerda(){
        System.out.println("Movendo para esquerda");
        superiorEsquerda.moverParaEsquerda();
        inferiorDireita.moverParaEsquerda();
    }
    public void moverParaDireita(){
        System.out.println("Movendo para direita");
        superiorEsquerda.moverParaDireita();
        inferiorDireita.moverParaDireita();
    }
}

class PontoMovel implements Movel {
    
    private int x;
    private int y;
    private int velX;
    private int velY;
    
    public PontoMovel(int x, int y, int velX, int velY){
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setvelX(int velX){
        this.velX = velX;
    }
    public void setvelY(int velY){
        this.velY = velY;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getvelX(){
        return velX;
    }
    public int getvelY(){
        return velY;
    }
    
    public String toString(){
        return null;
    }
    public void moverParaCima(){
        y = y + velY;
    }
    public void moverParaBaixo(){
        y = y - velY;
    }
    public void moverParaEsquerda(){
        x = x - velX;
    }
    public void moverParaDireita(){
        x = x + velX;
    }
}
