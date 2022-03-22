public class MoodAnalyserException extends Exception{

    /***
     * ExceptionType to differentiate mood type
     */
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    /***
     * constructor for mood analyser exception
     * @param type - mood type
     * @param message - passing message
     */
    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
