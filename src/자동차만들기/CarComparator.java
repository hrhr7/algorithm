package 자동차만들기;

import java.util.Comparator;

public class CarComparator implements Comparator<CarInfo> {

    @Override
    public int compare(CarInfo o1,CarInfo o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public Comparator<CarInfo> reversed(){
        return Comparator.super.reversed();
    }
}
