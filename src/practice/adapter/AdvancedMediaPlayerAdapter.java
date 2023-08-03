package practice.adapter;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
	AdvancedMediaPlayerInterface advancedMediaPlayer;

	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(String audioType, String filename) {
		advancedMediaPlayer.loadFilename(filename);
		advancedMediaPlayer.listen();
	}
}
