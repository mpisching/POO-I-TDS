package br.edu.ifsc.fln;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto.setMargemLucro(50);
        Produto p1 = new Produto("Bebida", 5.0F);
        System.out.println("Preco de venda: " + p1.calcularPrecoVenda());
        //p1.setMargemLucro(10.0f);
        Produto p2 = new Produto("Arroz", 2.0F);
        System.out.println("Preco de venda: " + p2.calcularPrecoVenda());

        //p2.setMargemLucro(20.0f);
        Produto p3 = new Produto("Feijão", 7.0F);
        System.out.println("Preco de venda: " + p3.calcularPrecoVenda());

        //p3.setMargemLucro(30.0f);

        Cliente c1 = new Cliente("Marcos Andre", "3212132121");
        Cliente c2 = new Cliente("Arthur", "23423423423");

        CupomFiscal cf1 = new CupomFiscal(1, LocalDate.now(), c1);
        ItemDoCupom ic1 = new ItemDoCupom(p2, 2);
        cf1.addItemDoCupom(ic1);
        ItemDoCupom ic2 = new ItemDoCupom(p1, 6);
        cf1.addItemDoCupom(ic2);

        imprimir(cf1);
    }

    public static void imprimir(CupomFiscal cf) {
        System.out.println(GeraCupomFiscal.gerarCupom(cf));
    }
}