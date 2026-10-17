package dev.velolib.radial.util;

import org.lwjgl.glfw.GLFW;

/**
 * 1.21.9 起原版把键盘输入封装成 {@code KeyInput}，1.21.8 及更早只有裸的 {@code keyCode}。
 * 这里把本项目用到的那几个判定复刻成静态方法，供 {@code keyPressed(int, int, int)} 使用。
 */
public final class InputKeys {
    private InputKeys() {}

    public static boolean isEnter(int keyCode) {
        return keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER;
    }

    public static boolean isUp(int keyCode) {
        return keyCode == GLFW.GLFW_KEY_UP;
    }

    public static boolean isDown(int keyCode) {
        return keyCode == GLFW.GLFW_KEY_DOWN;
    }

    public static boolean isLeft(int keyCode) {
        return keyCode == GLFW.GLFW_KEY_LEFT;
    }

    public static boolean isRight(int keyCode) {
        return keyCode == GLFW.GLFW_KEY_RIGHT;
    }
}
