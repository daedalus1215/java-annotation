package spring.annotation.Fortune;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements FortuneServiceInterface {
	
	/* (non-Javadoc)
	 * @see Fortune.FortuneServiceInterface#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Fortune from the FortuneService.";
	}
}
