package br.com.alurafood.pagamentos.model;

import lombok.Data;

import java.util.List;

@Data
public class Pedido {
    private List<ItemDoPedido> itens;
}
