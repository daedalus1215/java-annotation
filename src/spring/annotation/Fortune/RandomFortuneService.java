package spring.annotation.Fortune;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServiceInterface {	
	
	// create an array of string
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random randomGenerator = new Random();
	
	/* (non-Javadoc)
	 * @see Fortune.FortuneServiceInterface#getFortune()
	 */
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index  = (this.randomGenerator.nextInt(this.data.length));
		String theFortune = this.data[index];
		return "Fortune from the RandomFortuneService. With a fortune: " + theFortune;
	}
}
