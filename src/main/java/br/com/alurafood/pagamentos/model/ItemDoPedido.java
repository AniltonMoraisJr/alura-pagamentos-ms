package br.com.alurafood.pagamentos.model;

import lombok.Data;

@Data
public class ItemDoPedido {
    private Long id;
    private Integer quantidade;
    private String descricao;
}
