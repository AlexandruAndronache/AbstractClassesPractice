import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist extends ListItem{

    LinkedList<Item> playlist = new LinkedList<>();

    @Override
    protected boolean isInList(Item item) {
        return super.isInList(item);
    }

    @Override
    protected void add(Item item) {
        if (!isInList(item)){
            playlist.add(item);
            System.out.println("Item " + item.getName() + " has been added");
            return;
        }

        System.out.println("Item already in list");
    }

    protected void playSong(){
       Iterator<Item> iterator = playlist.iterator();

        for (Item item: playlist) {
            System.out.println("Now playing: " + item.getName());

        }

    }

    @Override
    protected void delete(Item item) {

    }
}
