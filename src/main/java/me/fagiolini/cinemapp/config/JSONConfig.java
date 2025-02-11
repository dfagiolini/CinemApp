package me.fagiolini.cinemapp.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.fagiolini.cinemapp.serializers.CustomJSONSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONConfig {
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
        return builder ->
                builder.serializationInclusion(JsonInclude.Include.USE_DEFAULTS)
                        .serializers(new CustomJSONSerializer());
    }
}
