import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenzie.app.zipcode.dto.ZipCodeDTO;
import com.kenzie.app.zipcode.http.HTTPConnector;

public class Application {
    public static void main(String[] args) {
        try {
            //API- https://api.zippopotam.us/us/ca/los%20angeles

            //declare variables
            final String TEST_URL = "https://api.zippopotam.us/us/ca/LOS%20ANGELES";
            String httpResponseStr;
            //connect to zippopotam.us and get zipcode
            httpResponseStr = HTTPConnector.makeGETRequest(TEST_URL);

            System.out.println(httpResponseStr);
            //objectMapper
            //1. instantiate objectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            //2. Declare DTO object
            ZipCodeDTO zipObj;
            //3.read data- readValue()
            zipObj = objectMapper.readValue(httpResponseStr, ZipCodeDTO.class);

            //print out place name, zip code and state
            System.out.println("City:" + zipObj.getPlaces().get(0).getPlace_name());
            System.out.println("Zip Code: " + zipObj.getPlaces().get(0).getPostCode());
            System.out.println("State: " + zipObj.getState());

            //loop and print the list of ZipCodes
            if (zipObj.getPlaces().size() >1){
                for (int i = 0; i < zipObj.getPlaces().size(); i++) {
                    System.out.println("City:" + zipObj.getPlaces().get(0).getPlace_name());
                    System.out.println("Zip Code: " + zipObj.getPlaces().get(0).getPostCode());
                    System.out.println("State: " + zipObj.getState());

                }
            }


            //failure case
            System.out.println("Failure case: ");
        }
        catch(Exception e){
            System.out.println("Error has occurred in Main" + e.getMessage());
        }


    }
    }
