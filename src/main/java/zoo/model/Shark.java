package zoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import zoo.animal.Fish;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class Shark extends Fish {
    public Shark(String name, Long years) {
        super(name, years);
    }
}
