package plaindoll;
import java.util.Random;
public class Welcomer{
	private static final String[] HUNTER_REPLIES = {
        "The hunter is tracking in the forest",
        "A skilled hunter knows patience",
        "Hunter's instinct never fails",
        "Every hunter has a story to tell"
    };
    
    private final Random random = new Random();
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
public String getHunterReply() {
        return HUNTER_REPLIES[random.nextInt(HUNTER_REPLIES.length)];
    }
}


