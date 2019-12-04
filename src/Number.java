class Number {
    public double a;
    public double b;
    public double c;
    public int d;
    public int e;
    public int f;

    public void getNumber() {
        a = 100 + Math.random() * 899;
        d = (int) a;
        b = 100 + Math.random() * 899;
        e = (int) b;
        c = 100 + Math.random() * 899;
        f = (int) c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}