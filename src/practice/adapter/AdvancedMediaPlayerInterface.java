package practice.adapter;

interface AdvancedMediaPlayerInterface {
    public void loadFilename(String fileName);
    public void listen();
}

class VlcPlayer implements AdvancedMediaPlayerInterface{
    String myFile;

    @Override
    public void loadFilename(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file: " + myFile);
    }
}

class Mp4Player implements AdvancedMediaPlayerInterface{
    String myFile;

    @Override
    public void loadFilename(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file: " + myFile);
    }
}