import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class EgnReader {
    public static String readEgnFromJson(){
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is = EgnReader.class
                    .getClassLoader()
                    .getResourceAsStream("file/egns.json");
            JsonNode node = mapper.readTree(is);

            return node.get("egn").asText();

        } catch (Exception e){
            return null;
        }
    }
}
