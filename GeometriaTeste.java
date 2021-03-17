
// Online IDE - Code Editor, Compiler, Interpreter

public class GeometriaTeste
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        Circulo cir = new Circulo(Double.parseDouble(args[0]));
        Retangulo ret = new Retangulo(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
        Quadrado qua = new Quadrado(Double.parseDouble(args[3]));
        
        System.out.println("Area Circulo: " + cir.calculaArea());
        System.out.println("Perimetro Circulo: "+cir.calculaPerimetro());
        
        System.out.println("Area Retangulo: "+ret.calculaArea());
        System.out.println("Perimetro Retangulo: "+ret.calculaPerimetro());
        
        System.out.println("Area Quadrado: "+qua.calculaArea());
        System.out.println("Perimetro Quadrado: "+qua.calculaPerimetro());
    }
}

abstract class Forma{
    abstract double calculaArea();
    abstract double calculaPerimetro();
}

class Circulo extends Forma{
    private double raio;
    
    Circulo(double raio) {
        this.raio = raio;
    }
    
    double calculaArea() {
        return Math.PI * (Math.pow(raio,2));
    }
    
    double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
}


class Retangulo extends Forma{
    private double base;
    private double altura;
    
    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calculaArea() {
        return base * altura;
    }
    
    double calculaPerimetro(){
        return 2 * (base + altura);
    }
}

class Quadrado extends Forma{
    private double lado;
    
    Quadrado(double lado) {
        this.lado = lado;
    }
    
    double calculaArea() {
        return lado * lado;
    }
    
    double calculaPerimetro(){
        return 4 * lado;
    }
}

