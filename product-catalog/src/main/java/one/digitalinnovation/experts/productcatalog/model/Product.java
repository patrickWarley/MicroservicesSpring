package one.digitalinnovation.experts.productcatalog.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "product")
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
}
