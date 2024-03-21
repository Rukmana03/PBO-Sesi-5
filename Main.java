// Contoh kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount account = new BankAccount(1000);
        
        // Menampilkan saldo awal
        System.out.println("Saldo awal:");
        account.displayBalance();
        
        // Menyetorkan uang ke akun
        account.deposit(500);
        // Menarik uang dari akun
        account.withdraw(200);
        
        // Menampilkan saldo setelah transaksi
        System.out.println("Saldo setelah transaksi:");
        account.displayBalance();
        
        // Membuat objek BankEmployee
        BankEmployee employee = new BankEmployee("Bintang");
        
        // Menampilkan nama karyawan bank
        employee.displayEmployeeName();
        
        // Memberikan bonus kepada karyawan
        employee.giveBonus(100);
    }
}
