package yandexPrakticum.Static;




public class Tree {

    private static String type;

    public static int numberOfTrees;

    public Tree(String type) {
        this.type = type;
        numberOfTrees++;
    }

    public static void printCounter() {
        System.out.println("Деревьев посажено: " + numberOfTrees);
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        Tree spruce = new Tree("Ель");
        String spruceType = spruce.getType();

        Tree birch = new Tree("Берёза");
        String birchType = birch.getType();

        Tree.printCounter();
    }
}