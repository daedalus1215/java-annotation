package spring.annotation.Fortune;

import org.springframework.stereotype.Component;

@Component
public interface FortuneServiceInterface {

	public String getFortune();
}