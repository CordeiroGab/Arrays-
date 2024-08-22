package Quest01;

public class Main {

    public static void main(String[] args) {

        Carro c1;
        c1 = new Carro();
        c1.nome= "Onix";
        c1.cor = "Azul";
        c1.marca= "Chevrolet";
        c1.consumo="Híbrido";
        c1.data= "2023";
        c1.valor= 67000;

        Carro c2 = new Carro();
        c2.nome= "S10";
        c2.cor = "Branco";
        c2.marca= "Chevrolet";
        c2.consumo="Diesel";
        c2.data= "2017";
        c2.valor= 154900;

        Carro c3 = new Carro();
        c3 = new Carro();
        c3.nome= "Jetta GLI";
        c3.cor = "Cinza";
        c3.marca= "Volkswagen";
        c3.consumo="Gasolina";
        c3.data= "2023";
        c3.valor= 216900;

        c1.atributos();
        c1.buzina();

        c2.atributos();
        c2.acelar();

        c3.atributos();
        c3.frear();


    }
}
