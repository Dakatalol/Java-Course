package mm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class VideoGame extends Product{
    private List<String> supportedOS;
    private boolean isMulti;

    public VideoGame(String title, double rating, List<String> genre, List<String> supportedOS, boolean isMulti) {
        super(title, rating, genre);
        this.supportedOS = supportedOS;
        this.isMulti = isMulti;
    }
}
