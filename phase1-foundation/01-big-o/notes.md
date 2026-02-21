# Big-O Notation

## Definisi
Cara mengukur efisiensi algoritma ketika data bertambah besar.

## Yang saya pahami
- O(1) → kayak ambil data dari Redis cache, selalu instan
- O(n) → kayak linear scan transaksi tanpa index
- O(log n) → kayak binary search, buang setengah setiap langkah
- O(n²) → nested loop, hindari kalau data besar

## Trade-off yang saya catat
hasDuplicateFast lebih cepat (O(n)) tapi butuh memori ekstra (O(n) space)
hasDuplicateNaive tidak butuh memori ekstra tapi lambat (O(n²))
→ ini yang namanya Time vs Space trade-off