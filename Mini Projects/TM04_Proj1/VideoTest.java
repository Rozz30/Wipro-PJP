import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoTest {
	private Video video;
	private String videoName;
	private int rating;
	@Before
	public void before() {
		videoName="Tom";
		rating=10;
		video=new Video(videoName);
	}
	@Test
	public void testGetName() {
		assertEquals(videoName,video.getName());
	}
	@Test
	public void testDoCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}
	@Test
	public void testDoReturn() {
		video.doReturn();
		assertFalse(video.getCheckout());
	}
	@Test
	public void testReceiveRating() {
		video.receiveRating(rating);
		assertEquals(rating,video.getRating());
	}
	@Test
	public void testGetRating() {
		video.receiveRating(rating);
		assertEquals(rating,video.getRating());
	}
	@Test
	public void testGetCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
		video.doReturn();
		assertFalse(video.getCheckout());
	}

}
