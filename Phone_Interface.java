interface Camera {
    void capturePhoto();
}

interface GPS {
    void navigateTo(String destination);
}

class SmartPhone implements Camera, GPS {
    @Override
    public void capturePhoto() {
        System.out.println("Photo captured using the smartphone camera........");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Navigating to " + destination + " using the smartphone GPS.");
    }

}

public class Phone_Interface {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.capturePhoto();
        myPhone.navigateTo("Hyderabad, India");
    }
}

