package relacoes.heranca2.parte1;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        
        Funcionario gerente = new Gerente(); //upcast implicito. É bastante utilizado
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //downcast de forma explicita - não trabalhar em OO

    }
}
