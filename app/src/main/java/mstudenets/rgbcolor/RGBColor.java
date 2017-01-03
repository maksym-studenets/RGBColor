package mstudenets.rgbcolor;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Maksym on 02.01.17.
 */

public class RGBColor
{
    private ArrayList<Integer> r;
    private ArrayList<Integer> g;
    private ArrayList<Integer> b;

    public RGBColor() {
        r = new ArrayList<>();
        g = new ArrayList<>();
        b = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            if ((i % 51 == 0) && (i != 0)) {
                r.add(i);
                g.add(i);
                b.add(i);
            }
        }
    }

    ArrayList<Integer> getGeneralList() {
        ArrayList<Integer> generalList = new ArrayList<>();
        int n = r.size();
        Collections.shuffle(g);
        Collections.sort(b, Collections.<Integer>reverseOrder());

        for (int i = 0; i < 3; i++) {
            generalList.add(r.get(i));
            generalList.add(g.get(i));
            generalList.add(b.get(i));
        }
        return generalList;
    }
}
