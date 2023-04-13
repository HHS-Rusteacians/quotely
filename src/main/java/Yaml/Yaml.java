package Yaml;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.hhsrustaceans.quotely.quote.Quote;
import java.io.File;
import java.io.IOException;

public class Yaml {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        Quote order = mapper.readValue(new File("examples/template.yaml"), Quote.class);
    }
}
