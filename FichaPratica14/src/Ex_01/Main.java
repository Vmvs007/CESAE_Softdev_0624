package Ex_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo("Azul",10,20);
        Retangulo retangulo2= new Retangulo("Preto",5,5);

        Triangulo triangulo1 = new Triangulo("Branco",10,2);

        Circulo circulo1= new Circulo("Rosa",10);
        Circulo circulo2= new Circulo("Vermelho",100);

        // System.out.println(retangulo1.getClass().getSimpleName());


        ArrayList<FiguraGeometrica> arrayFormas = new ArrayList<FiguraGeometrica>();
        arrayFormas.add(retangulo1);
        arrayFormas.add(retangulo2);
        arrayFormas.add(triangulo1);
        arrayFormas.add(circulo1);
        arrayFormas.add(circulo2);

        for(FiguraGeometrica figuraGeometricaAtual : arrayFormas){
            System.out.println(figuraGeometricaAtual);
        }


    }
}
