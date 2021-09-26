import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list

        Hero hero0 = new Hero("Black Widow", 34);
        Hero hero1 = new Hero("Captain America", 100);
        Hero hero2 = new Hero("Vision", 3);
        Hero hero3 = new Hero("Iron Man", 48);
        Hero hero4 = new Hero("Scarlet Witch", 29);
        Hero hero5 = new Hero("Thor", 1500);
        Hero hero6 = new Hero("Hulk", 49);
        Hero hero7 = new Hero("Doctor Strange", 42);

        heroes.add(hero0);
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        heroes.add(hero5);
        heroes.add(hero6);
        heroes.add(hero7);

        // TODO 3 : It's Thor birthday, now he's 1501

        hero6.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list


        List<Hero> heroArrayListSub =  heroes.subList(3, 7);




        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        Iterator it = heroArrayListSub.listIterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());

        }

    }
}
