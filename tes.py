while True:
    n = int(input("Masukkan angka lebih dari 3 (ketik 0 untuk keluar): "))
    if n == 0:
        break
    elif n <= 2:
        print("Masukkan nilai lebih dari 2")
        continue
    
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            # Mencetak nilai `n` di tepi persegi
            if i == 1 or i == n or j == 1 or j == n:
                print(n, end=" ")
            else:
                # Cetak spasi di bagian dalam
                print(" ", end=" ")
        print()  # Baris baru untuk setiap baris persegi

print("Program selesai")




