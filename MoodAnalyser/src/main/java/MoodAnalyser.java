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

    public String analyseMood(String message) throws MoodAnalyserException {
        this.message = message;
        return analyseMood();
    }

    /***
     * created analyseMood method to check mood happy or sad test case
     * @return - returns mood either happy or sad
     */
    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
            }
            if (message.contains("I am in sad mood")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Enter proper message");
        }
    }
}
