public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int maxStation;
    private int maxVolume;

    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++; // 2 пункт про станции
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--; // 3 пункт про странции
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plus() {
        if (currentVolume != maxVolume) {
            currentVolume++; // 2 пункт про громкость
        } else {
            currentVolume = maxVolume;
        }
    }

    public void minus() {
        if (currentVolume != 0) {
            currentVolume--; // 3 пункт про громкость
        } else {
            currentVolume = 0;
        }
    }

}
