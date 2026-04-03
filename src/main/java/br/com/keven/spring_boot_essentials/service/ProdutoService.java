package br.com.keven.spring_boot_essentials.service;
import br.com.keven.spring_boot_essentials.database.model.ProdutoEntity;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service

public class ProdutoService {

    private final ProdutoEntity produtoEntity;

    public ProdutoService( ProdutoEntity produtoEntity ){
        this.produtoEntity = produtoEntity;
    }

    ProdutoEntity p = new ProdutoEntity();
            p.setId(1);
            p.setName("Notebook");
            p.setPreco(new BigDecimal("5000"));
            p.setQuantidade(10);


    /*private static final List<ProdutoEntity> PRODUTOS = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .name("Notebook")
                    .preco(new BigDecimal("5000"))
                    .quantidade(10)
                    .build(),

            ProdutoEntity.builder()
                    .id(2)
                    .name("Iphone")
                    .preco(new BigDecimal("7000"))
                    .quantidade(10)
                    .build(),

            ProdutoEntity.builder()
                    .id(3)
                    .name("Mouse")
                    .preco(new BigDecimal("500"))
                    .quantidade(10)
                    .build()
    );*/

    public List<ProdutoEntity> findAll(){
        return new ArrayList<>(PRODUTOS);
    }
}