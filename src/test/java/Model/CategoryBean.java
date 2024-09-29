package Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryBean {
    private Integer id;
    private String name;
    private String image;
    private String creationAt;
    private String updatedAt;


}
