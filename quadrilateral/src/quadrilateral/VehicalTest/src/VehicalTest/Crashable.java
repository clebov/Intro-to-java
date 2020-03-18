package VehicalTest;

public abstract class Crashable {
    boolean carDriveable = true;

    public void youCrashed(){
        carDriveable = false;
    }

    public abstract void    setCarStrength (int carStrength);
    public abstract int getCarStrength();
}
