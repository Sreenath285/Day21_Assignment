public class MoodAnalyser {

    /***
     * created analyseMood method to check mood happy or sad test case
     * @param message - contains message
     * @return - returns mood either happy or sad
     */
    public String analyseMood(String message) {
        if (message.contains("I am in sad mood")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
