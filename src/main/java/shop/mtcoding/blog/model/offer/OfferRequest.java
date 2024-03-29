package shop.mtcoding.blog.model.offer;

import lombok.Data;
import shop.mtcoding.blog.model.skill.SkillRequest;

import java.util.List;

public class OfferRequest {

@Data
public static class CompOfterDTO {
    private Integer id; // apply 의 키값
    private String myName;
    private String title;;
    private Integer status;
    private List<SkillRequest.ApplyskillDTO> skillList;

    public CompOfterDTO(Integer id, String myName, String title, Integer status) {
        this.id = id;
        this.myName = myName;
        this.title = title;
        this.status = status;
    }
}
}
