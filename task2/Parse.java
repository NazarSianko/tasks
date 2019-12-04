public class Parse {
    public void parse() {
        Reader text = new Reader();
        text.Scan();
        for (String str1 : text.str.split(" ")) {
            System.out.println(str1);
        }
    }
}
