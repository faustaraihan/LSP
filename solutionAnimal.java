interface Terbang {
    void terbang();
}

class Hewan {
    public void bergerak() {
        System.out.println("Hewan sedang bergerak");
    }
}

class Burung extends Hewan {
    // Burung yang bisa terbang dapat mengimplementasikan antarmuka Terbang
}

class Elang extends Burung implements Terbang {
    @Override
    public void terbang() {
        System.out.println("Elang sedang terbang tinggi di langit");
    }

    @Override
    public void bergerak() {
        System.out.println("Elang sedang bergerak");
    }
}

class Penguin extends Burung {
    @Override
    public void bergerak() {
        System.out.println("Penguin sedang berenang");
    }
}

public class solutionAnimal {
    public static void main(String[] args) {
        Elang elang = new Elang();
        elang.terbang(); // Berfungsi normal
        elang.bergerak(); // Elang sedang bergerak

        Penguin penguin = new Penguin();
        penguin.bergerak(); // Penguin sedang berenang

        // Tidak ada error, karena penguin tidak diperlakukan sebagai burung yang bisa terbang
    }
}