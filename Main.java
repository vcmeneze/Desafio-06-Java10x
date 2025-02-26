package desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

        //criando os objetos ninja
        Ninja naruto = new Ninja("Naruto", 18, "Aldeia da Folha");
        Ninja sakura = new Ninja("Sakura", 19, "Aldedia da Folha");
        Ninja sasuke = new Ninja("Sasuke", 21, "Aldeia da Folha");
        Ninja kakashi = new Ninja ("Kakashi", 45, "Aldeia da Folha");

        // adicionando os objetos ninja na linkedlist
        listaDeNinjas.add(naruto);
        listaDeNinjas.add(sasuke);
        listaDeNinjas.add(sakura);

        // imprimir elementos da linkedlist
        for (Ninja Ninja : listaDeNinjas){
            System.out.println(Ninja);
        }
        System.out.println("------------------//-------------//------------");

        // remover o primeiro ninja da lista
        listaDeNinjas.removeFirst();

        // adicionar novo ninja no inicio da lista
        listaDeNinjas.addFirst(kakashi);

        // exibir a lista completa
        for (Ninja Ninja : listaDeNinjas){
            System.out.println(Ninja);
        }
        System.out.println("------------------//-------------//------------");

        // acessar um ninja em uma posição especifica da lista
        System.out.println(listaDeNinjas.get(2));

        System.out.println("------------------//-------------//------------");

    }
}
