package peak.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component("egg")
@Data

public class Egg6 {

    private Needle7 needle7;

    public Egg6() {
    }

    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка "+needle7.toString();
    }
}