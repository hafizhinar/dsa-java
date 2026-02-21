public class BigOExamples{

    // ─────────────────────────────────────────
    // O(1) — Konstan
    // Analogi: ambil saldo dari cache Redis
    // Tidak peduli berapa juta user, akses index langsung
    // Time: O(1) | Space: O(1)
    // ─────────────────────────────────────────
    public static int getFirst(int[] arr) {
        return arr[0]; // selalu 1 operasi, tidak peduli ukuran array
    }

    // ─────────────────────────────────────────
    // O(n) — Linear
    // Analogi: cek satu per satu transaksi untuk cari yang fraud
    // Makin banyak transaksi, makin lama
    // Time: O(n) | Space: O(1)
    // ─────────────────────────────────────────
    public static boolean containsValue(int[] arr, int target) {
        for (int num: arr){              // loop sebanyak n
            if(num == target) {
                return true;
            }
        }
        return false;
    }

    // ─────────────────────────────────────────
    // O(log n) — Logaritmik
    // Analogi: cari nama di buku telepon
    // Buka tengah → buang setengah → buka tengah lagi
    // Tidak perlu cek satu per satu
    // Time: O(log n) | Space: O(1)
    // ─────────────────────────────────────────

    public static int binarySearch(int[] sortedArr, int target){
        int left = 0;
        int right = sortedArr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (sortedArr[mid] == target) {
                return mid;
            } else if (sortedArr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // ─────────────────────────────────────────
    // O(n²) — Kuadratik
    // Analogi: cek setiap pasangan transaksi untuk deteksi duplikat
    // tanpa HashMap — cara yang naive
    // Time: O(n²) | Space: O(1)
    // ─────────────────────────────────────────
    public static boolean hasDuplicateNaive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // ─────────────────────────────────────────
    // Bandingkan: solusi O(n) untuk masalah yang sama
    // Analogi: pakai HashSet sebagai "catatan" yang sudah dilihat
    // Time: O(n) | Space: O(n), trade-off: lebih cepat tapi butuh memori
    // ─────────────────────────────────────────
    public static boolean hasDuplicateFast(int[] arr) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 6};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("=== Big-O Examples ===");

        // O(1)
        System.out.println("O(1)     - getFirst: " + getFirst(arr));

        // O(n)
        System.out.println("O(n)     - containsValue(9): " + containsValue(arr, 9));

        // O(log n)
        System.out.println("O(log n) - binarySearch(7): index " + binarySearch(sorted,7));

        // O(n²) vs O(n) — hasil sama, cara beda
        System.out.println("O(n²)    - hasDuplicateNaive: " + hasDuplicateNaive(arr));
        System.out.println("O(n²)    - hasDuplicateFast: " + hasDuplicateFast(arr));

    }
}


