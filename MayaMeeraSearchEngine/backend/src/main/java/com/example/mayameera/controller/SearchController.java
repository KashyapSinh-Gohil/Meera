import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.client.RestTemplate; 
import org.springframework.http.ResponseEntity; 
import org.json.JSONObject; 
@RestController 
public class SearchController { 
"    private static final String API_KEY = \"YOUR_GOOGLE_API_KEY\";" 
"    private static final String CSE_ID = \"YOUR_CSE_ID\";" 
"    @GetMapping(\"/search\")" 
"    public String search(@RequestParam(\"q\") String query) {" 
"        RestTemplate restTemplate = new RestTemplate();" 
"        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);" 
"        String jsonResponse = response.getBody();" 
"        JSONObject jsonObject = new JSONObject(jsonResponse);" 
"        StringBuilder result = new StringBuilder();" 
"        jsonObject.getJSONArray(\"items\").forEach(item -> {" 
"            JSONObject searchResult = (JSONObject) item;" 
"            result.append(searchResult.getString(\"title\")).append(\"\\n\");" 
"            result.append(searchResult.getString(\"link\")).append(\"\\n\\n\");" 
"        });" 
"        return result.toString();" 
"    }" 
"}" 
