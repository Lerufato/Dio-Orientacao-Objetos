package estruturaBasica;

/*EXERCÍCIO 4: Evolua o conceito do exercício 3 criando objetos da classe "Carro". 
Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get". 
Passe também uma mensagem para o cálculo do total pra encher o tanque.
*/

public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro(); //Estamos chamando o construtor criado, ele irá criar e vincular o objeto a variável carro1

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //Criando mesmo objeto, mas com sobrecarga do método construtor
        //Nesse caso não foi necessário o uso do set, pois os parâmetros estão dentro do método
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
