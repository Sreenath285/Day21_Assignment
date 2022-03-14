public class MoodAnalyser {

    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    /***
     * created analyseMood method to check mood happy or sad test case
     * @return - returns mood either happy or sad
     */
    public String analyseMood() {
        if (message.contains("I am in sad mood")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
