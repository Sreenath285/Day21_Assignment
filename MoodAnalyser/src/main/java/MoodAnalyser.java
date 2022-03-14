public class MoodAnalyser {

    String message;

    /***
     * no args constructor
     */
    public MoodAnalyser() {
    }

    /***
     * parameterized constructor
     * @param message - passing message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /***
     * created analyseMood method to check mood happy or sad test case
     * @return - returns mood either happy or sad
     */
    public String analyseMood() {
        try {
            if (message.contains("I am in sad mood")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
