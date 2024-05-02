package pica;

public class Cena {
    public static class Pizza {
        private String picuVeidi;
        private String picuIzmeri;
        private boolean hasRedOnions;
        private boolean hasOlives;
        private boolean hasMushrooms;
        private boolean hasCheese;

        public Pizza(String picuVeidi, String picuIzmeri, boolean hasRedOnions, boolean hasOlives, boolean hasMushrooms, boolean hasCheese) {
            this.picuVeidi = picuVeidi;
            this.picuIzmeri = picuIzmeri;
            this.hasRedOnions = hasRedOnions;
            this.hasOlives = hasOlives;
            this.hasMushrooms = hasMushrooms;
            this.hasCheese = hasCheese;
        }

        // Getters and setters
        public String getPicuVeidi() {
            return picuVeidi;
        }

        public void setPicuVeidi(String picuVeidi) {
            this.picuVeidi = picuVeidi;
        }

        public String getPicuIzmeri() {
            return picuIzmeri;
        }

        public void setPicuIzmeri(String picuIzmeri) {
            this.picuIzmeri = picuIzmeri;
        }

        public boolean hasRedOnions() {
            return hasRedOnions;
        }

        public void setRedOnions(boolean hasRedOnions) {
            this.hasRedOnions = hasRedOnions;
        }

        public boolean hasOlives() {
            return hasOlives;
        }

        public void setOlives(boolean hasOlives) {
            this.hasOlives = hasOlives;
        }

        public boolean hasMushrooms() {
            return hasMushrooms;
        }

        public void setMushrooms(boolean hasMushrooms) {
            this.hasMushrooms = hasMushrooms;
        }

        public boolean hasCheese() {
            return hasCheese;
        }

        public void setCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "picuVeidi='" + picuVeidi + '\'' +
                    ", picuIzmeri='" + picuIzmeri + '\'' +
                    ", redOnions=" + hasRedOnions +
                    ", olives=" + hasOlives +
                    ", mushrooms=" + hasMushrooms +
                    ", cheese=" + hasCheese +
                    '}';
        }
    }

    public static void main(String[] args) {
        
    }
}
