package config;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.junit.JUnitStories;

public class RunnerClass extends JUnitStories {


	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("src/main/resources/abc.story");
	}

}
