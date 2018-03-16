package spring.annotation.Fortune;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneServiceInterface {	
	
	/* (non-Javadoc)
	 * @see Fortune.FortuneServiceInterface#getFortune()
	 */
	@Override
	public String getFortune() {
		return "Fortune from the RandomFortuneService. With a fortune: " ;
	}
}
