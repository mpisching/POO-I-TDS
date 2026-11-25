package br.edu.ifsc.fln.report;

import br.edu.ifsc.fln.domain.IResumoDados;

public class Relatorio {
    public static void imprimir(IResumoDados dados) {
        System.out.println(dados.getDados());
    }
}
