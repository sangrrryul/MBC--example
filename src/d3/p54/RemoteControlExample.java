package d3.p54;

public class RemoteControlExample {
    public static void main(String[] args) {
//        RemoteControl rc = new RemoteControl();

        RemoteControl rc1 = new Audio();
        rc1.turnOn();
        rc1.turnOff();

        RemoteControl rc2 = new RemoteControl() {

            @Override
            public void turnOn() {
                System.out.println("RemoteControl - turnOn()");
            }

            @Override
            public void turnOff() {
                System.out.println("RemoteControl - turnOff()");
            }

            @Override
            public void setVolume(int volume) {
                // TODO Auto-generated method stub

            }
        };

        rc2.turnOn();
        rc2.turnOff();
    }
}