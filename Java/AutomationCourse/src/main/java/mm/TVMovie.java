package mm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TVMovie extends Product {
    private int duration;
    private List<String> actors;

    public TVMovie(String title, double rating, List<String> genre, int duration, List<String> actors) {
        super(title, rating, genre);
        this.duration = duration;
        this.actors = actors;
    }
}
