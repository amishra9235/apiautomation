package Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductBean {
    private Integer id;
    private String title;
    private Integer price;
    private String description;
    private List<String> images = new ArrayList<String>();
    private String creationAt;
    private String updatedAt;
    private CategoryBean category;


}

