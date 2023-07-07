package Iphone;


import Notebook.Notebook;

public class Iphone implements Prototype {
    private int IMEI;
    private int deviceNo;
    private int battery;
    private int camera;
    private String color;

    public Iphone(int IMEI, int deviceNo, int battery, int camera,String color) {
        this.IMEI = IMEI;
        this.deviceNo = deviceNo;
        this.battery = battery;
        this.camera = camera;
        this.color = color;
    }

    public int getIMEI() {
        return IMEI;
    }

    public int getDeviceNo() {
        return deviceNo;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public String getColor() {
        return color;
    }

    public Iphone(Iphone original){
        this.battery = original.battery;
        this.camera = original.battery;
        this.deviceNo = original.deviceNo;
        this.IMEI = original.IMEI;
        this.color = original.color;
    }

    @Override
    public Iphone clone() {
        return new Iphone(this);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "IMEI=" + IMEI +
                ", deviceNo=" + deviceNo +
                ", battery=" + battery +
                ", camera=" + camera +
                ", color='" + color + '\'' +
                '}';
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public void setDeviceNo(int deviceNo) {
        this.deviceNo = deviceNo;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
