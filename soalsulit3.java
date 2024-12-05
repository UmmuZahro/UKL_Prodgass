import java.util.HashMap;

public class soalsulit3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> frekuensiMap = new HashMap<>();

        for (int elemen : array) {
            // Jika elemen sudah ada dalam HashMap, tambahkan 1 ke frekuensinya
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1);
        }

        for (int elemen : frekuensiMap.keySet()) {
            System.out.println(elemen + " muncul " + frekuensiMap.get(elemen) + " kali");
            
        }
    }
}
