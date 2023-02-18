import java.util.Comparator;

public class ComL1Comporator implements Comparator<ComL1> {
    @Override
    public int compare(ComL1 o1, ComL1 o2) {
        int ret = o1.getC().compareTo(o2.getC());
        if (ret == 0){
            ret = Double.compare(o1.getD(), o2.getD());
        }

        return ret;
    }
}
