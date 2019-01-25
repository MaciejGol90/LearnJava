public class Tv {

    private int size;
    private String name;
    private boolean onOff;


    public Tv(int aSize, String name){
        size = aSize;
        this.name =name;

    }
    public void setOnOff(boolean a){
        onOff=a;
    }
    public void getOnOff(){
        if (onOff==true){
            System.out.println("TV is on");
        }
        else
            System.out.println("TV is off");

    }


    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

}
