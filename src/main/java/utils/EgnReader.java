package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Egn;

import java.io.InputStream;
import java.util.List;

public class EgnReader {
    public static List<String> readEgnFromJson(){
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream is = EgnReader.class
                    .getClassLoader()
                    .getResourceAsStream("file/egns.json");
            if(is == null){
                throw  new RuntimeException("File not found!");
            }
            Egn result = mapper.readValue(is, Egn.class);

            return result.getEgn();

        } catch (Exception e) {
            return null;
        }

    }
}