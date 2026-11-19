package Mod7;

// Needs to be completed
// 1 - Extend this class from Exception class
public class CustomExceptionActivity extends Exception {

    @Override
    public String getMessage() {
        return "You are not allowed to use this program ";
    }
// 2 - Override getMessage() and provide the following message:
// "You are not allowed to use this program"
}