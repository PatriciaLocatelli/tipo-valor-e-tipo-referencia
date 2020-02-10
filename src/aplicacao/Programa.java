package aplicacao;

import entidades.Produto;

public class Programa {
    public static void main(String[] args) throws CloneNotSupportedException {
        Produto p1 = new Produto("Celular", 100.0, 1);
        System.out.println(p1);

        System.out.println("p2 = p1");
        Produto p2 = p1;
        System.out.println(p2);

        p1.setNome("\nCafeteira");

        System.out.println("p1.setNome('Cafeteira');");
        System.out.println("Imprimindo p1");
        System.out.println(p1);
        System.out.println("Imprimindo p2");
        System.out.println(p2);


        System.out.println("\nProduto p3 = new Produto();");
        Produto p3 = new Produto();
        /*
        Imprimindo os valores padrão
         */
        System.out.println(p3);

        /*
        Boxing
         */
        int x;
//        Object obj = x;
//        System.out.println(obj);
//        /* Unboxing*/
//
//        int y = (int) obj;
//        System.out.println(y);

        Produto p4;
        p4 = p2.clone();

        System.out.println("p4 = p2.clone()" + p4);


    }
}
