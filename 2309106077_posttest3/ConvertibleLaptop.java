public class ConvertibleLaptop extends Laptop {
    private boolean touchscreen;
    private boolean detachableKeyboard;

    public ConvertibleLaptop(String nama, String warna, String spek, double harga, boolean touchscreen, boolean detachableKeyboard) {
        super(nama, warna, spek, harga);
        this.touchscreen = touchscreen;
        this.detachableKeyboard = detachableKeyboard;
    }

    // Getter dan Setter
    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public boolean isDetachableKeyboard() {
        return detachableKeyboard;
    }

    public void setDetachableKeyboard(boolean detachableKeyboard) {
        this.detachableKeyboard = detachableKeyboard;
    }
}
