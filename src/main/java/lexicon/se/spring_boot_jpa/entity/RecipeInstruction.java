package lexicon.se.spring_boot_jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class RecipeInstruction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private String id;

    private String instruction;


    public RecipeInstruction(String instruction) {
        this.instruction = instruction;
    }
}
