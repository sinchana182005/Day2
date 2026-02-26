package string;

public class BuilderExample {
        public void stringInsert() {
            StringBuilder builder = new StringBuilder("JA");
            System.out.println("Old string:" + builder);
            builder.insert(1, "AV");
            System.out.println("New String:" + builder);
        }

        public void stringAppend() {
            StringBuilder builder = new StringBuilder("SNPSU");
            System.out.println("Old string:" +builder);
            builder.append("ISE");
            System.out.println("New String:" + builder);
        }

        public void stringReverse() {

            StringBuilder builder= new StringBuilder("HOHTYP");
            System.out.println("Old string:" + builder);
            builder.reverse();
            System.out.println("New String:" + builder);
        }

        public static void main(String[] args) {
            new string.BuilderExample().stringInsert();
            new string.BuilderExample().stringAppend();
            new string.BuilderExample().stringReverse();
        }
    }


