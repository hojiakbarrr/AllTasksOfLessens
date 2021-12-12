package company.Comparator;

import java.util.Comparator;

public class Price implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof House) {
            if (((House) o1).price > ((House) o2).price) {
                return 1;
            }
            if (((House) o1).price < ((House) o2).price) {
                return -1;
            }


        }return 0;

    }
}