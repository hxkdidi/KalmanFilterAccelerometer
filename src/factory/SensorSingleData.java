package factory;

public class SensorSingleData {
    private long number;
    private long timestamp;

    private double accX;
    private double accY;
    private double accZ;
    private double accV;

    private double gyroX;
    private double gyroY;
    private double gyroZ;

    private double magnX;
    private double magnY;
    private double magnZ;

    public SensorSingleData() {
    }

    public SensorSingleData(long number, long timestamp, double accX, double accY, double accZ, double accV,
                            double gyroX, double gyroY, double gyroZ, double magnX, double magnY, double magnZ) {
        this.number = number;
        this.timestamp = timestamp;
        this.accX = accX;
        this.accY = accY;
        this.accZ = accZ;
        this.accV = accV;
        this.gyroX = gyroX;
        this.gyroY = gyroY;
        this.gyroZ = gyroZ;
        this.magnX = magnX;
        this.magnY = magnY;
        this.magnZ = magnZ;
    }

    private double setV() {
        return Math.sqrt(Math.pow(this.accX, 2) + Math.pow(this.accY, 2) + Math.pow(this.accZ, 2));
    }

    public long getNumber() { return number; }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getAccX() {
        return accX;
    }

    public void setAccX(double accX) {
        this.accX = accX;
    }

    public double getAccY() {
        return accY;
    }

    public void setAccY(double accY) {
        this.accY = accY;
    }

    public double getAccZ() {
        return accZ;
    }

    public void setAccZ(double accZ) {
        this.accZ = accZ;
    }

    public double getAccV() {
        return accV;
    }

    public void setAccV(double accV) {
        this.accV = accV;
    }

    public double getGyroX() {
        return gyroX;
    }

    public void setGyroX(double gyroX) {
        this.gyroX = gyroX;
    }

    public double getGyroY() {
        return gyroY;
    }

    public void setGyroY(double gyroY) {
        this.gyroY = gyroY;
    }

    public double getGyroZ() {
        return gyroZ;
    }

    public void setGyroZ(double gyroZ) {
        this.gyroZ = gyroZ;
    }

    public double getMagnX() {
        return magnX;
    }

    public void setMagnX(double magnX) {
        this.magnX = magnX;
    }

    public double getMagnY() {
        return magnY;
    }

    public void setMagnY(double magnY) {
        this.magnY = magnY;
    }

    public double getMagnZ() {
        return magnZ;
    }

    public void setMagnZ(double magnZ) {
        this.magnZ = magnZ;
    }

    @Override
    public String toString() {
        return number + " " + timestamp + " " + accX + " " + accY + " " + accZ + " " + accV;
    }
}
