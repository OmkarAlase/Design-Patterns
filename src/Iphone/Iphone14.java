package Iphone;

public class Iphone14 extends Iphone {
    private Notch notch;

    public Iphone14(int IMEI, int deviceNo, int battery, int camera,String color,Notch notch){
        super(IMEI,deviceNo,battery,camera,color);
        this.notch = notch;
    }

    public void setNotch(Notch notch) {
        this.notch = notch;
    }

    public Iphone14(Iphone14 iphone){
        super(iphone);
        this.notch = iphone.notch;
    }
    @Override
    public Iphone14 clone(){
        return new Iphone14(this);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "IMEI=" + super.getIMEI() +
                ", deviceNo=" + super.getDeviceNo() +
                ", battery=" + super.getBattery() +
                ", camera=" + super.getCamera() +
                ", notch=" + notch +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
