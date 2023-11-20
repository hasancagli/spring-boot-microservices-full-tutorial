package com.hasan.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data // combines several other Lombok annotations, @Getter, @Setter, @ToString, @EqualsAndHashCode, and @NoArgsConstructor.
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;


}
