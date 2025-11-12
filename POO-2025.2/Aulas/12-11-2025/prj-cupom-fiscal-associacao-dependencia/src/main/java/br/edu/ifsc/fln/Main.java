package br.edu.ifsc.fln;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Bebida", 5.0F);
        Produto p2 = new Produto("Arroz", 2.0F);
        Produto p3 = new Produto("Feijão", 7.0F);

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
        GeraCupomFiscal gcf = new GeraCupomFiscal();
        System.out.println(gcf.gerarCupom(cf));
    }
}