import java.util.Objects;

public class Card {
    String color;     String rang;   String suit;

    public String getSuit() {        return suit;    }


    public String getColor() {   return color;    }

    public String getRang() {       return rang;   }

    public Card(String color, String rang, String suit) {
        this.color = color;
        this.rang = rang;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", rang='" + rang + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return color.equals(card.color) && rang.equals(card.rang) &&
                suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, rang, suit);
    }
}
