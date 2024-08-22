package Quest01;

public class Carro {


        //Caracteristicas
        public String nome;
        public String cor;
        public String  marca;
        public String consumo;
        public String data;
        public double valor;

        //Construtor
        public Carro(){}

        //Capacidade
        public void buzina(){
            System.out.println( nome +" está buzinando ");
        }
        public void acelar(){
            System.out.println( nome + " está acelando");
        }
        public void frear(){
            System.out.print(nome+" está freando");
        }

        //Dados

        public void atributos(){
                System.out.println("_____________________");
                System.out.println("Modelo:"+nome +"\nCor:"+cor +"\nMarca:"+marca+"\nAno:"+data +"" +
                        "\nConsumo:"+consumo+"\nValor:R$"+valor);
                System.out.println("_____________________");
        }
    }


