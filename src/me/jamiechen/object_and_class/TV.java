package me.jamiechen.object_and_class;

/**
 * 本程序定义了一个 TV 类
 *
 * Created by JamieChen on 2017/2/24 0024.
 */
public class TV {

    int channel = 1; // 默认频道：1
    int volumeLevel = 1; // 默认音量大小：1
    boolean isOn = false; // 默认状态：关闭

    public TV() {}

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (isOn && newVolumeLevel >= 1 && newVolumeLevel <= 120)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (isOn && channel < 120)
            channel++;
    }

    public void channelDown() {
        if (isOn && channel > 1)
            channel--;
    }

    public void volumeUp() {
        if (isOn && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (isOn && volumeLevel > 1)
            volumeLevel--;
    }
}
