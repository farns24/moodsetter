package com.harrysoft.androidbluetoothserial.demoapp;

public class PositionToCodeUtils {
    public static String getCode(int i) {
        char base = 'A';
        char code = (char) (base + i);
        return "" + code;
    }
}
