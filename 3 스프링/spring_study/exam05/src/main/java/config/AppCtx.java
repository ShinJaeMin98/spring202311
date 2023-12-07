package config;

import org.springframework.context.annotation.Configuration;
import aopex.*;

@Configuration

public class AppCtx {
    public Calculator calculator() {
        return new RecCalculator() ;
    }
}
