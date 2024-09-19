class Hewan {
    public void bergerak() {
        System.out.println("Hewan sedang bergerak");
    }
}

class Burung extends Hewan {
    public void terbang() {
        System.out.println("Burung sedang terbang");
    }
}

class Penguin extends Burung {
    @Override
    public void terbang() {
        throw new UnsupportedOperationException("Penguin tidak bisa terbang");
    }

    @Override
    public void bergerak() {
        System.out.println("Penguin sedang berenang");
    }
}

public class problemAnimal {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.terbang(); // Berfungsi normal

        Burung penguin = new Penguin();
        penguin.terbang(); // Akan menimbulkan error UnsupportedOperationException
    }
}