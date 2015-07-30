package cn.jarlen.gpuimagelibrary;

/**
 * Created by jarlen on 2015/7/30.
 */
public class YUVCoderLibrary {
    static {
        System.loadLibrary("YUVCoderLib");
    }

    public static native String testJni();

    public static native void YUVtoRBGA(byte[] yuv, int width, int height, int[] out);

    public static native void YUVtoARBG(byte[] yuv, int width, int height, int[] out);

}
