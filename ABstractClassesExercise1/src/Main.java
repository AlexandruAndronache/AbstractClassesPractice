public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("1", 2);
        Item item2 = new Item("2", 2);
        Item item3 = new Item("3", 2);
        Item item4 = new Item("4", 2);

        Playlist playlist = new Playlist();
        playlist.add(item1);
        playlist.add(item2);
        playlist.add(item3);
        playlist.add(item4);

        playlist.playSong();
    }
}
