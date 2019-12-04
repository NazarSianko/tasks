public class Test {
        public static void main(String[] args) {
            String Total = "Total price of bouquet  is ";
            Rose rose = new Rose(36.5,"Роза", Color.Red);
            Tulip tulip  = new Tulip(20,"Тюльпан", Color.Yellow);
            Tulip tulip1  = new Tulip(23,"Тюльпан", Color.White);
            Violet vio1 = new Violet(55.56,"Фиалка",Color.Purple);
            Bouquet bouquet = new Bouquet();
            bouquet.addFlower(rose).addFlower(tulip).addFlower(vio1).addFlower(tulip1);
            System.out.println( Total + bouquet.getPrice());
        }
    }

