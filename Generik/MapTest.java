/* 
* File : MapTest.java
* Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
* Ester Imelda Br Sihotang / 24060123140127
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(1));
        Set<Integer> key = map.keySet();
        
    }
}