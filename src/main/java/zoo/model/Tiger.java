package zoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import zoo.animal.Animal;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@AllArgsConstructor
public class Tiger extends Animal {
    private double length;
    private double weight;
    private long victims;

    public Tiger(String name, Long years, double length, double weight, long victims) {
        super(name, years);
        this.length = length;
        this.weight = weight;
        this.victims = victims;
    }
}
