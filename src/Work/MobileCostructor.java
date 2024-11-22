package Work;

    public class MobileCostructor {
        String Brand;
        String Color;
        int Price;

        public void MobileConstructor(String Brand, String Color, int Price) {
            System.out.println("I bought " + Brand + " Mobile of " + Color + " color in " + Price);
        }

        public static void main(String[] args) {
            MobileCostructor obj = new MobileCostructor();
            obj.MobileConstructor("Apple", "Rose Pink", 85000);
        }
    }