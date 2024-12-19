package DemoTbale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dict {
    private ArrayList<Word> list;

    public Dict() {
        this.list = new ArrayList<Word>();
        list.add(new Word(0, "a", "abc"));
        list.add(new Word(1, "b", "bcd"));
        list.add(new Word(2, "c", "cde"));
        list.add(new Word(3, "d", "def"));
        list.add(new Word(4, "e", "efg"));
        list.add(new Word(5, "f", "fgh"));
        list.add(new Word(6, "g", "ghi"));
        list.add(new Word(7, "h", "hij"));
        this.sort();
    }

    public int dictSize() {
        return list.size();
    }

    public void sort() {
        Collections.sort(list, new Comparator<Word>() {

            @Override
            public int compare(Word o1, Word o2) {
                return o1.getViet_tat().compareTo(o2.getViet_tat());
            }
        });
    }

    public int binarySearch(String search, int t, int p) {
        if (t < p) {

            int len = (t + p) / 2;

            if (list.get(len).getViet_tat().equals(search)) {
                return len;
            }

            if (search.compareTo(list.get(len).getViet_tat()) < 0) {
                return binarySearch(search, t, len - 1);
            }
            if (search.compareTo(list.get(len).getViet_tat()) > 0) {
                return binarySearch(search, len + 1, p);
            }
        }
        return -1;
    }

    public Word res(int i) {
        return list.get(i);
    }
    public void add (Word w){
        list.add(w);
    }
}
