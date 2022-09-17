public class Breuvage {

    class Liquide {
        public void imprimer() {
            System.out.println("Je suis un liquide");
        }
    }
    
    class Café extends Liquide {
        public void imprimer() {
            System.out.println("Je suis un café");
        }
    }

    class Lait extends Liquide {
        public void imprimer() {
            System.out.println("Je suis un lait");
        }
    }
}
