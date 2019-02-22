package config;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.junit.Test;

public class TraderStoryRunner {

	//@Test
	public void runClasspathLoadedStoriesAsJUnit() {
		Embedder embedder = new Embedder();
		List<String> storyPaths = Arrays
				.asList("C:\\Users\\e075583\\Documents\\workspace_new\\JBehaveWay\\src\\main\\resources\\stories\\abc.story");
		embedder.runStoriesAsPaths(storyPaths);
	}

	@Test
	public void runURLLoadedStoriesAsJUnit() {
		Embedder embedder = new Embedder();
		//List<String> storyPaths = Arrays.asList("C:\\Users\\e075583\\Documents\\workspace_new\\JBehaveWay\\src\\main\\resources\\stories\\abc.story");
		List<String> storyPaths = Arrays.asList("src/main/resources/abc.story");
		embedder.runStoriesAsPaths(storyPaths);
	}
}
