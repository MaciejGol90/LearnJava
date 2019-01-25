package Absta;

public class Nosy extends TV {
    @Override
    public void onTV(boolean b) {
if (b)
    System.out.println("TV is on");
else
    System.out.println("TV in off");
    }
}
