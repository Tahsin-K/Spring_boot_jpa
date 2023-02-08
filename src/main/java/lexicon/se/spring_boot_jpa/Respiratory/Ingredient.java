package lexicon.se.spring_boot_jpa.Respiratory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface Ingredient extends CrudRepository<Ingredient, Integer> {

      Optional <Ingredient> findByIngredient(String Ingredient);

      List<Ingredient>findAllByIngredientNameContains(String ingredientName);
}
