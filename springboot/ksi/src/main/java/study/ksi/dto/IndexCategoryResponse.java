package study.ksi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class IndexCategoryResponse {
    @JsonProperty("output2")
    private List<IndexOutput2> output2;
}
