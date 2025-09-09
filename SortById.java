import java.util.Comparator;

public class SortById implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getId(), p2.getId());
    }
}
