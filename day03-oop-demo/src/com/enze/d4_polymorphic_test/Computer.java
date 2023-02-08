package com.enze.d4_polymorphic_test;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println(name + "开机了");
    }
    /* 提供安装USB设备的入口 */
    public void installUSB(USB device){
        device.connect();
        if(device instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) device;
            keyBoard.keyDown();
        }else if(device instanceof Mouse){
            Mouse mouse = (Mouse) device;
            mouse.doubleClick();
        }
        device.unconnect();
    }
}
