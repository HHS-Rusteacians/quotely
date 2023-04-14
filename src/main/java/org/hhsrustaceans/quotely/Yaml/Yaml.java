package org.hhsrustaceans.quotely.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.hhsrustaceans.quotely.quote.Quote;
import java.io.File;
import java.io.IOException;

/**
 * This class is used to get the YAML file and convert it to a Quote object.
 */
public class Yaml {
    /**
     * This method is used to get the YAML file and convert it to a Quote object.
     * @param file The file to be converted.
     * @throws IOException If the file cannot be found.
     */
    public static void getYamlFile(String file) throws IOException{
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        Quote order = mapper.readValue(new File(file), Quote.class);
    }
}
