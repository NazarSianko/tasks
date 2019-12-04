public class Flower {
        private final double price;
        public final String name;
        private final Color color;
        protected Flower(double price, String name, Color color) {
            this.price = price;
            this.name = name;
            this.color = color;
        }
        public double getPrice() {
            return price;
        }
}
