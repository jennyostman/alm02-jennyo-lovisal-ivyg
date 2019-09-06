package pac;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tytrainor
 */
public class ControllerTest {

    @Test
    void testName() {
        String actualName = "John Rambo";
        Controller controller = new Controller();
        controller.setFullName(actualName);
        String expectedName = controller.getFullName();
        assertEquals(expectedName, actualName, "Expected name should be: " + actualName);
    }

    @Test
    void testAge() {
        int actualAge = 28;
        Controller controller = new Controller();
        controller.setAge(actualAge);
        
        int expectedAge = controller.getAge();
        assertEquals(expectedAge, actualAge, actualAge);
    }

    @Test
    void testNationality() {
        // for testing the set and get of Nationality
        String actualNationality = "Australian";

        Controller controller = new Controller();
        controller.setNationality(actualNationality);

        String expectedNationality = controller.getNationality();
        assertEquals(expectedNationality, actualNationality, "Expected nationality should be: " + actualNationality);
    }

    @Test
    void testGender() {
        // for testing the set and get of Gender
        String actualGender = "Male";

        Controller controller = new Controller();
        controller.setGender(actualGender);

        String expectedGender = controller.getGender();
        assertEquals(expectedGender, actualGender, "Expected nationality should be: " + actualGender);
    }

    @Test
    void testResponse() {
        // for testing the set and get of Response
        String actualResponse = "This is a response";

        Controller controller = new Controller();
        controller.setResponse(actualResponse);

        String expectedResponse = controller.getResponse();
        assertEquals(expectedResponse, actualResponse, "Expected nationality should be: " + actualResponse);
    }

    @Test
    void testGetMessage1() {
        Controller controller = new Controller();
        controller.setAge(20);
        // value 1-5
        controller.getMessage();
        String response = controller.getResponse();

        Message messages = new Message();
        assertTrue(messages.getMessageValue(1).equals(response) || messages.getMessageValue(2).equals(response)
                || messages.getMessageValue(2).equals(response)
                || messages.getMessageValue(3).equals(response)
                || messages.getMessageValue(4).equals(response)
                || messages.getMessageValue(5).equals(response));

    }

    @Test
    void testGetMessage2() {
        Controller controller = new Controller();
        controller.setAge(30);
        // value 6 to 10
        controller.getMessage();
        String response = controller.getResponse();

        Message messages = new Message();
        assertTrue(messages.getMessageValue(6).equals(response) || messages.getMessageValue(2).equals(response)
                || messages.getMessageValue(7).equals(response)
                || messages.getMessageValue(8).equals(response)
                || messages.getMessageValue(9).equals(response)
                || messages.getMessageValue(10).equals(response));

    }

    @Test
    void testGetMessage3() {
        Controller controller = new Controller();
        controller.setAge(60);
        // value 11 to 15
        controller.getMessage();
        String response = controller.getResponse();

        Message messages = new Message();
        assertTrue(messages.getMessageValue(11).equals(response) || messages.getMessageValue(2).equals(response)
                || messages.getMessageValue(12).equals(response)
                || messages.getMessageValue(13).equals(response)
                || messages.getMessageValue(14).equals(response)
                || messages.getMessageValue(15).equals(response));

    }

    @Test
    void testGetMessage4() {
        Controller controller = new Controller();
        controller.setAge(80);
        // value 16 to 20
        controller.getMessage();
        String response = controller.getResponse();

        Message messages = new Message();
        assertTrue(messages.getMessageValue(16).equals(response) || messages.getMessageValue(2).equals(response)
                || messages.getMessageValue(17).equals(response)
                || messages.getMessageValue(18).equals(response)
                || messages.getMessageValue(19).equals(response)
                || messages.getMessageValue(20).equals(response));

    }

    }
