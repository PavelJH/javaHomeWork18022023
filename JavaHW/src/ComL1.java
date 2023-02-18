import java.util.Comparator;

public class ComL1 implements Comparable<ComL1> {

    private int a;
    private boolean b;
    private String c;
    private double d;
    public ComL1(int a, boolean b, String c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(boolean b) {
        this.b = b;
    }
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public int compareTo(ComL1 o) {
        int ret = Integer.compare(this.a,o.a);
        if (ret == 0){
            ret = Boolean.compare(this.b, o.b);
        }
        return ret;
    }


    @Override
    public String toString() {
        return "ComL1{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", d=" + d +
                '}';
    }


}
