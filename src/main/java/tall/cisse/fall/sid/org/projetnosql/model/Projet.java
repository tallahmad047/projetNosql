package tall.cisse.fall.sid.org.projetnosql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection= "project")
public class Projet {
    @Id
    private String id;
    private String productName;
    private String price;
    private String remise ;
    private String images;

}
