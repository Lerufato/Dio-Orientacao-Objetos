package relacoes.heranca2.parte2;

class RodarAplicação {
    public static void main(String[] args) {
        //vetor ClasseMae com 3 ojetos
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) { //polimorfismo - ao chamar o metodo1, ele se comportou como o tipo de dado corrente no momento, que é ClasseFilha1
            classe.metodo1();
        }   //para ClasseMae não tem poliporfismo porque o tipo de dado é o mesmo, ClasseMae

        System.out.println("");

        for (ClasseMae classe: classes) { //só tem polimorfismo para a ClasseFilha2, pois só ela tem o metodo2.
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //sobescrita
        classeFilha2.metodo2();
    }
}
