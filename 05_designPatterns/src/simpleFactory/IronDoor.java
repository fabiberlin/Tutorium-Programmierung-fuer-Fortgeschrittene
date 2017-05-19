package simpleFactory;

public class IronDoor implements Door{

    private float width;
    private float height;

    public IronDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }
}
