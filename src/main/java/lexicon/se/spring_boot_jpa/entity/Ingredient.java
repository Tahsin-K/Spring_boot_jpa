package lexicon.se.spring_boot_jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data


@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int  Id;
    @Column(unique = true, nullable = false)
    private String IngredientName;

    public Ingredient( String ingredientName){
        this.IngredientName = ingredientName;
    }


}
