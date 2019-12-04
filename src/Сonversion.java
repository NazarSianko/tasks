 class Сonversion {
    public String g;
    public int h;
    public void madeConv() {
        Number number = new Number();
        number.getNumber();
        g = Integer.toString(number.d) + Integer.toString(number.e);
        System.out.println(g);
        h = Integer.parseInt(g) - number.f;
        System.out.println(h);
    }
}
