package estruturaBasica;

//EXERCÍCIO 1: Crie a classe "Carro".

class Carro {

    //EXERCÍCIO 2: Evolua o exercicio 1 e defina 3 atributos para sua classe "Carro": cor, modelo e capacidade do tanque.

    String cor;
    String modelo;
    int capacidadeTanque;

    /*EXERCÍCIO 3: Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total  para encher o tanque. 
    Este deve receber como parâmetro o valor da gasolina. 
    Faça também duas sobrecargas do construtor.
    */

    Carro() { //método construtor simples

    }

    Carro(String cor, String modelo, int capacidadeTanque) { //método construtor com parametros - sobrecarga
        this.cor = cor; // this mostra que o atributo pertence ao objeto, recurso usado para evistar ambiguidade
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) { //Método setCor para colocar um valor a um atributo, nesse caso, cor 
        this.cor = cor;
    }

    String getCor() { //Método getCor para retornar um valor a um atributo, nesse caso, cor
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}