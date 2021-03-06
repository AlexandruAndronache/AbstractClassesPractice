import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public abstract class ListItem {

    List<Item> items = new LinkedList<>();

    protected abstract void add(Item item);
    protected abstract void delete(Item item);

    protected boolean isInList(Item item){

        ListIterator<Item> iterator = items.listIterator();
        while(iterator.hasNext()){
            Item fromList = iterator.next();
            return (item.getName().equalsIgnoreCase(fromList.getName()));
        }

        return false;
    }

}
