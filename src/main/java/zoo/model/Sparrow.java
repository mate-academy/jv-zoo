package zoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import zoo.animal.Bird;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class Sparrow extends Bird {
    private String song;
    private double flyingHeight;

    public Sparrow(String name, Long years, String song, double flyingHeight) {
        super(name, years);
        this.song = song;
        this.flyingHeight = flyingHeight;
    }
}
