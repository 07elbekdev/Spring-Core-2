package peak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peak.model.Ocean1;
@Component("siu")

public class KoscheiTheDeathless {
    private Ocean1 ocean1;

    public KoscheiTheDeathless() {
    }
    @Autowired
    public KoscheiTheDeathless(Ocean1 ocean1) {
        this.ocean1 = ocean1;
    }

    public String getRulesByDeth() {
        return "На свете есть океан \uD83C\uDF0A , " +ocean1.toString();
    }
}