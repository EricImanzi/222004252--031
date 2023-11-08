interface Tree {
    void grow();
}


class MapleTree implements Tree {
    public void grow() {
        System.out.println("A maple tree is growing.");
    }

    public void produceSeeds() {
        System.out.println("A maple tree is producing seeds.");
    }
}


class PalmTree implements Tree {
    public void grow() {
        System.out.println("A palm tree is growing.");
    }

    public void provideShade() {
        System.out.println("A palm tree provides shade in hot climates.");
    }
}

public class trees{
    public static void main(String[] args) {
        
        Tree maple = new MapleTree();
        maple.grow();
        ((MapleTree) maple).produceSeeds();

        // Create a palm tree object
        Tree palm = new PalmTree();
        palm.grow();
        ((PalmTree) palm).provideShade();
    }
}
