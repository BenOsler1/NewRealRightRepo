package com.codedotorg;

import com.codedotorg.modelmanager.CameraController;
import com.codedotorg.modelmanager.ModelManager;
public class AppLogic {

    /** The pin to unlock the app */
    private String pin;

    /** The pin the user has provided */
    private String user;

    /**
     * Constructor for the AppLogic class.
     * Initializes the pin with a random value and user with an empty string.
     */
    public AppLogic() {
        pin = createRandomPin();
        user = "";
    }

    /**
     * Creates a user PIN based on the predicted class.
     * @param predictedClass the predicted class from the machine learning model
     * @return the user PIN as a string
     */
    public String createUserPin(String predictedClass){ 
        String userResponse = predictedClass.substring(predictedClass.indexOf("") + 1);
        switch (userResponse) {
            case "1":
                user += 1;
                break;
            case "2":
                user += 2;
                break;
            case "3":
                user += 3;
                break;
            case "4":
                user += 4;
                break;
                
            case "5":
                user += 5;
                break;
            case "6":
                user += 6;
                break;
            case "7":
                user += 7;
                break;
            case "8":
                user += 8;
                break;
            case "9":
                user += 9;
                break;
            case "0":
                user += 0;
                break;
        
            default:
                break;


        }
        return user;
    }

    /**
     * Checks if the length of the user's PIN is equal to 4.
     * @return true if the length of the user's PIN is equal to 4, false otherwise.
     */
    public boolean checkPinLength() {
        
        return false;
    }

    /**
     * Returns the status of the user's input PIN.
     * @param userPin the PIN entered by the user
     * @return a string indicating whether the PIN is correct or not
     */
    public String getPinStatus(String userPin) {
        if (userPin.equals(pin)) {
            return "Correct PIN!";
        } else {
            return "Incorrect PIN!";
        }
    }
    
    /**
     * Resets the logic of the application by generating
     * a new random PIN and clearing the user field.
     */
    public void resetLogic() {
        pin = createRandomPin();
        user = "";
    }

    /**
     * Generates a random 4-digit PIN number.
     * @return the generated PIN number as a string.
     */
    public static String createRandomPin() {
        return ""+ (int) (((int) 1+Math.random()*9998));
    }

}
