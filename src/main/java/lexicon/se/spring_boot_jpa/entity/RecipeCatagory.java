package lexicon.se.spring_boot_jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class RecipeCatagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "recipe_recipe_category",
    joinColumns = @JoinColumn(name = "recipe_category_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    private List<Recipe> recipe = new ArrayList<>();


    public void addRecipe(Recipe recipe1){
        if (recipe1 == null) throw new IllegalArgumentException("recipe1 was null");
        if (recipe == null) recipe = new ArrayList<>();

        recipe.add(recipe1);
    }

    public void removeRecipe(Recipe recipe1) {
        if (recipe1 == null) throw new IllegalArgumentException("recipe1 was null");
        if (recipe != null) recipe.remove(recipe1);

    }
}
