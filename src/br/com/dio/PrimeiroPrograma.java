package br.com.dio;

import br.com.dio.model.Cat;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Livro livro = new Livro("A Crônica do Matador de Reis, O nome do vento", 320);
        System.out.println(livro);
    /*    int a = 5;
        int b = 3;

        System.out.println(a+b);*/


        Cat gato = new Cat();

        System.out.println(gato);


    }
}


class Livro {
    private String nome;
    private Integer numPag;

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}