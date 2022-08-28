
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pets pet1 = new Pets("Cat", "Leopold", 5);
        Pets pet2 = new Pets("Dog", "Rex", 12);
        Pets pet3 = new Pets("Cat", "Valentin", 7);
        Pets pet4 = new Pets("Hamster", "Hom", 1);
        Pets pet5 = new Pets("Horse", "Nerld", 400);
        Pets pet6 = new Pets("Dog", "Bars", 14);
        Pets pet7 = new Pets("Dog", "Marina", 11);
        Pets pet8 = new Pets("Horse", "Dnetr", 420);
        Pets pet9 = new Pets("Cat", "Katya", 6);
        Pets pet10 = new Pets("Dog", "Vova", 15);

        List<Pets> petsList = new ArrayList<>();
        petsList.add(pet1);
        petsList.add(pet2);
        petsList.add(pet3);
        petsList.add(pet4);
        petsList.add(pet5);
        petsList.add(pet6);
        petsList.add(pet7);
        petsList.add(pet8);
        petsList.add(pet9);
        petsList.add(pet10);
        int i=1;
        for (Pets pets : petsList) {
            System.out.println(i + ": " + pets); i++;
        }
        System.out.println(petsList);

        System.out.println("\nСортировка по длине клички:");
        Collections.sort(petsList, new PetsComparator());
        System.out.println(petsList);

        Set<Pets> petSet = new TreeSet<>(petsList);
        System.out.println("\nСортировка по весу:");
        System.out.println(petSet);

//        Card card1 = new Card("red", "6", "Diamond");
//        Card card2 = new Card("red", "7", "Diamond");
//        Card card3 = new Card("red", "8", "Diamond");
//        Card card4 = new Card("red", "9", "Diamond");
//        Card card5 = new Card("red", "10", "Diamond");
//        Card card6 = new Card("red", "Valet", "Diamond");
//        Card card7 = new Card("red", "Dama", "Diamond");
//        Card card8 = new Card("red", "King", "Diamond");
//        Card card9 = new Card("red", "Ace", "Diamond");
//        Card card10 = new Card("black", "6", "Spade");
//        Card card11 = new Card("black", "7", "Spade");
//        Card card12 = new Card("black", "8", "Spade");
//        Card card13 = new Card("black", "9", "Spade");
//        Card card14 = new Card("black", "10", "Spade");
//        Card card15 = new Card("black", "Valet", "Spade");
//        Card card16 = new Card("black", "Dama", "Spade");
//        Card card17 = new Card("black", "King", "Spade");
//        Card card18 = new Card("black", "Ace", "Spade");
//
//        List<Card> cardList = new ArrayList<>();
//        cardList.add(card1);
//        cardList.add(card2);
//        cardList.add(card3);
//        cardList.add(card4);
//        cardList.add(card5);
//        cardList.add(card6);
//        cardList.add(card7);
//        cardList.add(card8);
//        cardList.add(card9);
//        cardList.add(card10);
//        cardList.add(card11);
//        cardList.add(card12);
//        cardList.add(card13);
//        cardList.add(card14);
//        cardList.add(card15);
//        cardList.add(card16);
//        cardList.add(card17);
//        cardList.add(card18);
//
//        Set<Card> cardSet = new TreeSet<Card>(new CardComparator().reversed());
//        cardSet.addAll(cardList);
//        for (Card card : cardSet) {
//            System.out.println(card);
//        }

//        Set<Card> cardSet = new HashSet<>(cardList);
//        for (Card card : cardSet) {
//            System.out.println(card);
//        }
//        Map<Card, Integer> cardMap = new HashMap<>();
//        for (Card card : cardList) {
//            if (cardMap.containsKey(card)) {
//                int value = cardMap.get(card);
//                cardMap.put(card, ++value);
//                System.out.println(card);
//            } else cardMap.put(card, 1);
//        }
//        for (Map.Entry<Card, Integer> cardEntry : cardMap.entrySet()){
//            System.out.println(cardEntry.getKey() + " = " + cardEntry.getValue());
//        }
    }
}
