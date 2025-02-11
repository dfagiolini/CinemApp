package me.fagiolini.cinemapp.serializers;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.jooq.JSON;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

/*
 * Custom serializer for org.jooq.JSON type fields
 * Wherever org.jooq.JSON type field is being returned in response, jackson should use this serializer
 */
public class CustomJSONSerializer extends StdSerializer<JSON> {
    public CustomJSONSerializer() {
        super(JSON.class);
    }

    @Override
    public void serialize(JSON value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeRawValue(value.data());
    }

}
