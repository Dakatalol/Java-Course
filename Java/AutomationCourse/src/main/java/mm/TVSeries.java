package mm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TVSeries extends Product {
    private List<String> titlesOfSeason;
    private int numberOfEpisodes;
    private int numberOfSeasons;
    private List<Double> listOfSeason;

    public TVSeries(String title, double rating, List<String> genre, List<String> titlesOfSeason, int numberOfEpisodes, int numberOfSeasons, List<Double> listOfSeason) {
        super(title, rating, genre);
        this.titlesOfSeason = titlesOfSeason;
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeasons = numberOfSeasons;
        this.listOfSeason = listOfSeason;
    }
}
