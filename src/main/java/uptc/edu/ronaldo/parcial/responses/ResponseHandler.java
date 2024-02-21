package uptc.edu.ronaldo.parcial.responses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus httpStatus, Object data) {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("message", message);
        responseMap.put("status", httpStatus);
        responseMap.put("data", data);

        return new ResponseEntity<>(responseMap, httpStatus);
    }
}
