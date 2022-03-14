import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    void getMoodResultSad() {
        String mood = moodAnalyser.analyseMood("Sad message");
        Assert.assertEquals("SAD", mood);
    }
    
    @Test
    void getMoodResultHappy() {
        String mood = moodAnalyser.analyseMood("Happy message");
        Assert.assertEquals("HAPPY", mood);
    }
}