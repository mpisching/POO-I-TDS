package br.edu.ifsc.fln;

import br.edu.ifsc.fln.domain.CupomFiscal;
import br.edu.ifsc.fln.domain.Produto;
import br.edu.ifsc.fln.exceptions.ProdutoException;
import br.edu.ifsc.fln.report.GeraCupomFiscal;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        Produto.setMargemLucro(50);
        try {
            Produto p1 = new Produto("Bebida", 5.0F);
            produtos[0] = p1;
//        try {
//            Produto p1 = new Produto("Bebida", -5.0F);
//            produtos[0] = p1;
//        } catch (RuntimeException ex) {
//            System.out.println("Falha: " + ex.getMessage());
//        }
            Produto p2 = new Produto("Arroz", 2.0F);
            produtos[1] = p2;
            Produto p3 = new Produto("Feijão", 7.0F);
            produtos[2] = p3;
        } catch (ProdutoException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Falha desconhecida..." + ex.getMessage());
        }
        float mediaDosPrecos = 0.0f;
        float somaDosPrecos = 0.0f;
        try {
            System.out.println("Bloqueando recursos do sistemas...");
            for (int i = 0; i < 3; i++) {
                System.out.println("Nome: " + produtos[i].getNome());
                System.out.println("Preco de venda: " + produtos[i].calcularPrecoVenda());
                somaDosPrecos += produtos[i].calcularPrecoVenda();
            }
            mediaDosPrecos = somaDosPrecos / produtos.length;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Falha de acesso ao conteúdo do vetor");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Falha: divisão por zero");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Liberando os recursos do sistema...");
        }
        System.out.println("Media dos precos: " + mediaDosPrecos);


        System.out.println("Fim da execução do programa com sucesso ...");

        //p3.setMargemLucro(30.0f);

//        Cliente c1 = new Cliente("Marcos Andre", "3212132121");
//        Cliente c2 = new Cliente("Arthur", "23423423423");
//
//        CupomFiscal cf1 = new CupomFiscal(1, LocalDate.now(), c1);
//        ItemDoCupom ic1 = new ItemDoCupom(p2, 2);
//        cf1.addItemDoCupom(ic1);
//        ItemDoCupom ic2 = new ItemDoCupom(p1, 6);
//        cf1.addItemDoCupom(ic2);
//
//        imprimir(cf1);
    }

    public static void imprimir(CupomFiscal cf) {
        System.out.println(GeraCupomFiscal.gerarCupom(cf));
    }
}