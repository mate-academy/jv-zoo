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
public class Pinguin extends Bird {
    public Pinguin(String name, Long years) {
        super(name, years);
    }
}
