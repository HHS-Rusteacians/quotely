package org.hhsrustaceans.quotely.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.hhsrustaceans.quotely.quote.Quote;
import java.io.File;
import java.io.IOException;

public class Yaml {
    public static void getYamlFile(String file) throws IOException{
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        Quote order = mapper.readValue(new File(file), Quote.class);
    }
}
