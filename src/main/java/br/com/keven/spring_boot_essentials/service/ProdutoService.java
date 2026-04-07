package br.com.keven.spring_boot_essentials.service;

import br.com.keven.spring_boot_essentials.database.model.ProdutoEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    static {
        ProdutoEntity p = new ProdutoEntity();
        p.setId(1);
        p.setName("Notebook");
        p.setPreco(new BigDecimal("5000"));
        p.setQuantidade(10);

        ProdutoEntity p1 = new ProdutoEntity();
        p1.setId(2);
        p1.setName("ipohne");
        p1.setPreco(new BigDecimal("7000"));
        p1.setQuantidade(10);


        ProdutoEntity p2 = new ProdutoEntity();
        p2.setId(3);
        p2.setName("mouse");
        p2.setPreco(new BigDecimal("500"));
        p2.setQuantidade(10);


        PRODUTOS.add(p);
        PRODUTOS.add(p2);
        PRODUTOS.add(p1);
    }

    public List<ProdutoEntity> findAll(){
        return new ArrayList<>(PRODUTOS);
    }
}