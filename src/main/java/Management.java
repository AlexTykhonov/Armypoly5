public class Management {
    public static void main(String[] args) {

        ArcherChariot ac = new ArcherChariot();
        ArcherWing aw = new ArcherWing();
        Berzerker bz = new Berzerker();
        Knight kn = new Knight();
        Sorcerer sr = new Sorcerer();
        Warlock wl = new Warlock();

        System.out.println(ac.archerAttacks());
        System.out.println(aw.archerAttacks());
        System.out.println(bz.warriorAttacks());
        System.out.println(kn.warriorAttacks());
        System.out.println(sr.magicAttacks());
        System.out.println(wl.magicAttacks());

    }
}
