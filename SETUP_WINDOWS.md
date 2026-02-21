# 🛠️ Setup Guide — Windows

Panduan lengkap setup environment DSA Java di Windows dari nol.

---

## Step 1: Install Tools yang Dibutuhkan

### 1.1 Git for Windows
1. Download di [git-scm.com/download/win](https://git-scm.com/download/win)
2. Install dengan pilihan default semua — **kecuali** di bagian "Default editor", pilih **VS Code** kalau sudah install VS Code
3. Verifikasi: buka **Command Prompt** atau **PowerShell**, ketik:
   ```
   git --version
   ```
   Hasilnya: `git version 2.x.x`

### 1.2 JDK 21 (Java Development Kit)
1. Download di [adoptium.net](https://adoptium.net/) → pilih **JDK 21 LTS**
2. Install dengan pilihan default
3. Verifikasi:
   ```
   java --version
   javac --version
   ```

### 1.3 IntelliJ IDEA Community Edition (Gratis)
1. Download di [jetbrains.com/idea/download](https://www.jetbrains.com/idea/download/)
2. Pilih **Community Edition** (gratis, cukup untuk belajar)
3. Install dengan pilihan default

---

## Step 2: Konfigurasi Git

Buka **Git Bash** (sudah terinstall bersama Git for Windows), lalu:

```bash
# Set nama dan email (sesuaikan dengan akun GitHub kamu)
git config --global user.name "Nama Kamu"
git config --global user.email "email@kamu.com"

# Set default branch ke main
git config --global init.defaultBranch main

# Verifikasi
git config --list
```

---

## Step 3: Setup GitHub Repository

### 3.1 Buat Repo di GitHub
1. Buka [github.com](https://github.com) → Login
2. Klik tombol **"New"** (repo baru)
3. Isi:
   - Repository name: `dsa-java`
   - Description: `DSA Learning Journey using Java`
   - Visibility: **Public** (biar bisa jadi portfolio) atau Private
   - ✅ Centang **"Add a README file"** → nanti kita replace
4. Klik **"Create repository"**

### 3.2 Clone ke Lokal
Buka **Git Bash**, pilih folder tempat kamu mau simpan project:

```bash
# Contoh: simpan di D:\Projects
cd /d/Projects

# Clone repo (ganti username dengan username GitHub kamu)
git clone https://github.com/username/dsa-java.git

# Masuk ke folder
cd dsa-java
```

---

## Step 4: Setup Struktur Folder

Masih di Git Bash, jalankan perintah ini untuk buat semua folder sekaligus:

```bash
# Buat struktur folder
mkdir -p phase1-foundation/01-big-o
mkdir -p phase1-foundation/02-memory
mkdir -p phase1-foundation/03-recursion

mkdir -p phase2-linear/01-array
mkdir -p phase2-linear/02-dynamic-array
mkdir -p phase2-linear/03-linked-list
mkdir -p phase2-linear/04-stack
mkdir -p phase2-linear/05-queue
mkdir -p phase2-linear/06-deque
mkdir -p phase2-linear/07-hashmap
mkdir -p phase2-linear/08-hashset

mkdir -p phase3-nonlinear/01-tree
mkdir -p phase3-nonlinear/02-binary-tree
mkdir -p phase3-nonlinear/03-bst
mkdir -p phase3-nonlinear/04-heap
mkdir -p phase3-nonlinear/05-graph
mkdir -p phase3-nonlinear/06-trie

mkdir -p phase4-algorithms/01-two-pointer
mkdir -p phase4-algorithms/02-sliding-window
mkdir -p phase4-algorithms/03-binary-search
mkdir -p phase4-algorithms/04-bfs
mkdir -p phase4-algorithms/05-dfs
mkdir -p phase4-algorithms/06-sorting
mkdir -p phase4-algorithms/07-greedy
mkdir -p phase4-algorithms/08-dynamic-programming
mkdir -p phase4-algorithms/09-backtracking

mkdir -p phase5-problems/easy
mkdir -p phase5-problems/medium
mkdir -p phase5-problems/hard
```

---

## Step 5: Tambahkan README & PROGRESS

Copy file `README.md` dan `PROGRESS.md` yang sudah dibuat ke dalam folder `dsa-java`, lalu:

```bash
# Cek status
git status

# Tambahkan semua file
git add .

# Commit pertama
git commit -m "🚀 init: setup DSA learning journey structure"

# Push ke GitHub
git push origin main
```

---

## Step 6: Setup IntelliJ IDEA

1. Buka IntelliJ IDEA
2. **File → Open** → pilih folder `dsa-java`
3. IntelliJ akan detect ini sebagai project Java
4. Pastikan SDK sudah di-set ke JDK 21:
   - **File → Project Structure → Project → SDK** → pilih JDK 21

---

## Step 7: Git Workflow Harian

Setiap kali belajar, ikuti alur ini:

```bash
# 1. Sebelum mulai — pastikan up to date
git pull

# 2. Belajar, nulis kode, buat catatan...

# 3. Setelah selesai — simpan progress
git add .
git commit -m "📖 phase1/big-o: tambah catatan time complexity"
git push
```

### Format Commit Message yang Bagus:
```
📖 phase1/big-o: tambah notes konsep O(n log n)
⚙️  phase2/linked-list: implementasi singly linked list
🧩 phase5/easy: solve Two Sum dengan HashMap
📅 progress: update week 3 log
🐛 fix: perbaiki edge case di binary search
```

---

## Verifikasi Setup Berhasil

Kalau semua langkah selesai, kamu harusnya punya:

- [ ] `git --version` jalan di Command Prompt
- [ ] `java --version` jalan di Command Prompt  
- [ ] IntelliJ IDEA terinstall dan bisa buka project
- [ ] Repo `dsa-java` ada di GitHub dengan struktur folder lengkap
- [ ] `README.md` dan `PROGRESS.md` sudah ada di repo

Kalau semua checklist ✅ — setup selesai, siap belajar! 🎉
