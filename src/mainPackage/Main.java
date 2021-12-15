package mainPackage;

public class Main {

    static void countFoods(Food[] breakfast) {
        int CheeseType = 0, AppleType = 0, BeefType = 0;
        Cheese CompC = new Cheese(); // Создаем экземпляры класса, чтобы найти кол-во продуктов по типам
        Beef CompB = new Beef(null);
        Apple CompA = new Apple(null);
        for (int i = 0; i < breakfast.length; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(CompC)) {
                    CheeseType++;
                } else
                if (breakfast[i].equals(CompB)) {
                    BeefType++;
                } else
                if (breakfast[i].equals(CompA)) {
                    AppleType++;
                }
            } else
                break;
        }
        System.out.println("Ваш завтрак состоит из "+ AppleType +" яблок, "+BeefType+" кусков мяса и "+CheeseType+
                " ломтиков сыра.");
    }

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        for(int itemIndex=0; itemIndex <args.length; itemIndex++) {
        String[] parts = args[itemIndex].split("/");
        if (parts[0].equals("Cheese")) {
            // У сыра дополнительных параметров нет
            breakfast[itemIndex] = new Cheese(); }
        else if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
            breakfast[itemIndex] = new Apple(parts[1]); }
        else if (parts[0].equals("Beef")){
            breakfast[itemIndex] = new Beef(parts[1]);
        }
// ... Продолжается анализ других продуктов для завтрака
    }
    // Перебор всех элементов массива
countFoods(breakfast);
for (Food item: breakfast) {
    if (item==null) break;
    item.consume();
}
System.out.println("Всего хорошего!");
    }
}
