import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(13);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-15);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation4() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation6() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation7() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation8() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStation9() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationNext1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationNext3() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationNext4() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationPrev1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationPrev2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationPrev3() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationPrev4() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationCount1() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolume7() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumePlus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.plus();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumePlus2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.plus();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumePlus3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.plus();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumePlus4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.plus();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeMinus2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeMinus3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.minus();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVolumeMinus4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.minus();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}
