import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    void getMoodResultSad() {
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
    
    @Test
    void getMoodResultHappy() {
        String mood = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
